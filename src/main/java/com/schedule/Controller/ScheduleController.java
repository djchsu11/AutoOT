package com.schedule.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 1/15/2017.
 */

@RestController
public class ScheduleController {

    @RequestMapping("/")
    public String index(){
        return "Hello!";
    }
}
