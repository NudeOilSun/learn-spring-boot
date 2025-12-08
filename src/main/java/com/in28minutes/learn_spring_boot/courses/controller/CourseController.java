package com.in28minutes.learn_spring_boot.courses.controller;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return List.of(new Course(1, "Learn Microservices", "in28Minutes"));
    }
}
