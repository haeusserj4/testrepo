package com.usermanagement.j.usermanagement.Controller;

import java.util.Optional;

import com.usermanagement.j.usermanagement.Classes.LoginClass;
import com.usermanagement.j.usermanagement.Classes.NewAccount;
import com.usermanagement.j.usermanagement.Entities.UserInfo;
import com.usermanagement.j.usermanagement.Entities.UserLogin;
import com.usermanagement.j.usermanagement.Repositories.UserInfoRepository;
import com.usermanagement.j.usermanagement.Repositories.UserLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user")
public class LoginController {
    
    @Autowired
    private UserLoginRepository userLoginRepos;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @PostMapping("/addUser")
    //@ResponseBody String addUser(@RequestParam String username, @RequestParam String password, @RequestParam String companyId, @RequestParam String surename, @RequestParam String lastname, @RequestParam String email,@RequestParam String phone, @RequestParam String birthday){
    @ResponseBody String addUser(@RequestBody NewAccount newAccount){

        System.out.println(newAccount.toString());


        if(newAccount.getUsername().equals("") || newAccount.getPassword().equals("") || newAccount.getUsername() == null || newAccount.getPassword() == null ){
            return "username or password empty!";
        }

        if(newAccount.getCompanyId().equals("") || newAccount.getCompanyId() == null){
            return "no companyId";
        }

        for(UserLogin ul : userLoginRepos.findAll()) {
            if(ul.getUserName().equals(newAccount.getUsername())){
                return "username already taken!";
            }
        }

        UserLogin u = userLoginRepos.save(new UserLogin(Integer.parseInt(newAccount.getCompanyId()), newAccount.getUsername(), newAccount.getPassword(), 0));

        userInfoRepository.save(new UserInfo(u.getUserId(), newAccount.getSurname(), newAccount.getLastname(), newAccount.getEmail(), newAccount.getPhone(), newAccount.getBday()));

        return "user added";
    }

    @PostMapping("/verify")
    @ResponseBody String verfifyUser(@RequestBody LoginClass lc){

        if(lc.getUsername().equals("") || lc.getPassword().equals("") || lc.getUsername() == null || lc.getPassword() == null ){
            return "username or password empty!";
        }
        System.out.println(lc.getUsername() + " | " + lc.getPassword());
        for(UserLogin ul : userLoginRepos.findAll()) {
            if(ul.getUserName().equals(lc.getUsername()) && ul.getPassword().equals(lc.getPassword())){
                System.out.println(ul.getUserId());
                Optional<UserInfo> temp = userInfoRepository.findById(ul.getUserId());
                UserInfo u = temp.get();
                return "userID : " + u.getUserId() + " companyID : " + ul.getCompanyId() + " sureName : " + u.getSurName() + " lastName : " + u.getLastName();
            }
        }
        // TODO test if it works
        return "no match";
    }

}
