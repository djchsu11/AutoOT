package com.schedule.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David on 1/16/2017.
 */

@Service
public class ScheduleService {

    public ScheduleService() {
    }

    public Map<String, Object> getSchedule(){
        Map<String, Object> schedule = new HashMap<>();
        return schedule;
    }
}
