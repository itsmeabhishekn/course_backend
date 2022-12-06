package com.example.courseBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping(path = "/")
    public String home()
    {
        return "this is the home page";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add()
    {
        return "data added succesfully";
    }

    @GetMapping(path = "/viewall")
    public String viewall()
    {
        return "this is the viewall page";
    }
}
