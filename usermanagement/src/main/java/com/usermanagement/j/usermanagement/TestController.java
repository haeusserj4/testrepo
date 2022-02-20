package com.usermanagement.j.usermanagement;

import com.usermanagement.j.usermanagement.Entities.UserLogin;
import com.usermanagement.j.usermanagement.Repositories.UserLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private UserLoginRepository userLoginRepos;

    @GetMapping("/test")
    @ResponseBody Iterable<UserLogin> test(){
        return userLoginRepos.findAll();
    }
}
