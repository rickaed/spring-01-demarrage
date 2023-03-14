package com.wildcodeschool.doctorwho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell";
    }
    @GetMapping("/doctor10")
    @ResponseBody
    public String doctor2() {
        return "David Tennant";
    }
    @GetMapping("/doctor11")
    @ResponseBody
    public String doctor3() {
        return "Jodie Whittaker";
    }
}
