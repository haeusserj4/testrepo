package com.usermanagement.j.usermanagement.Controller;

import com.usermanagement.j.usermanagement.Classes.CompanyIdentifier;
import com.usermanagement.j.usermanagement.Classes.NewAttandance;
import com.usermanagement.j.usermanagement.Entities.UserAttandanceChange;
import com.usermanagement.j.usermanagement.Repositories.UserAttandanceChangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/attandance")
public class AttandanceController {
    
    @Autowired
    private UserAttandanceChangeRepository userAttandanceChangeRepository;

    @PostMapping("/insertNew")
    @ResponseBody String verfifyUser(@RequestBody NewAttandance lc){

        if(lc != null){
            userAttandanceChangeRepository.save(new UserAttandanceChange(lc.getCompanyId(), lc.getUserId(), lc.getYear(), lc.getMonth(), lc.getDay(), lc.getHour(), lc.getMinute(), lc.getSecondes(), lc.getLatitute(), lc.getLongitude()));
            return "inserted";
        }else{
            return "no match";
        }
        
    }

    @GetMapping("/getAll")
    @ResponseBody Iterable<UserAttandanceChange> getAll(){
        // TODO add id to only get all for one company
        return userAttandanceChangeRepository.findAll();
    }

}
