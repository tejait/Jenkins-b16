package com.cicd.jenkinsb16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("getName")
    public String getName(){
        return "Your Java Stop!";
    }
}
