package kel29._HappyTravelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kel29._HappyTravelling.repo.JadwalRepository;
import kel29._HappyTravelling.service.JadwalService;

@RestController
public class UserController {
    @Autowired
    JadwalService jadwalService;

    @GetMapping("/addschedule")
    public ModelAndView addSchedule(){
		return null;
        
    }

}
