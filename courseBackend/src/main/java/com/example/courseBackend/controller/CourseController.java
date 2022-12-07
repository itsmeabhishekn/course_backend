package com.example.courseBackend.controller;

import com.example.courseBackend.dao.CourseDao;
import com.example.courseBackend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/")
    public String home()
    {
        return "this is the home page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Courses c)
    {
        System.out.println(c.getId());
        System.out.println(c.getCourseDesc());
        System.out.println(c.getCourseTitle());
        System.out.println(c.getDate());
        System.out.println(c.getDuration());
        System.out.println(c.getVenue());
        dao.save(c);
        return "data added succesfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewall")
    public List<Courses> viewall()
    {
        return (List<Courses>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Courses> search(@RequestBody Courses s)
    {
        String courseTitle = s.getCourseTitle();
        System.out.println(courseTitle);
        return (List<Courses>) dao.search(s.getCourseTitle());
    }
}
