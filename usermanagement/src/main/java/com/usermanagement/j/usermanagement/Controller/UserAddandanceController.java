package com.usermanagement.j.usermanagement.Controller;

import com.usermanagement.j.usermanagement.Entities.UserAttandanceChange;
import com.usermanagement.j.usermanagement.Repositories.UserAttandanceChangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/worker")
public class UserAddandanceController {
    
    @Autowired
    private UserAttandanceChangeRepository userAttandanceChangeRepository;

    @PostMapping("/addChangeState")
    @ResponseBody String addUser(@RequestParam String companyId, @RequestParam String userId, @RequestParam String year, @RequestParam String month, @RequestParam String day, 
                                @RequestParam String hour,@RequestParam String minute, @RequestParam String secondes,@RequestParam String latitute, @RequestParam String longitude){

        //TODO validate input
        //int companyId, long userId, int year, int month, int day, int hour, int minute, int secondes, double latitute, double longitude
        UserAttandanceChange UAC = new UserAttandanceChange(Integer.parseInt(companyId), Long.parseLong(userId), Integer.parseInt(year), Integer.parseInt(month),Integer.parseInt(day), 
        Integer.parseInt(hour), Integer.parseInt(minute), Integer.parseInt(secondes), Double.parseDouble(latitute), Double.parseDouble(longitude));

        userAttandanceChangeRepository.save(UAC);
        return "user added";
    }

}
