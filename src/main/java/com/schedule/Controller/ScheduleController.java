package com.schedule.Controller;

import com.schedule.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David on 1/15/2017.
 */

@RestController
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

    @RequestMapping("/getSchedule")
    public Map<String, Object> getSchedule(){
        Map<String, Object> response;

        response = service.getSchedule();

        return response;
    }
}

