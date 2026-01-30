package com.in28minutes.learn_spring_boot.courses.controller;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
//        return List.of(new Course(1, "Learn Microservices", "in28Minutes"),
//                new Course(1, "Learn Full Stack with Angular and React", "in28Minutes"));

        return courseRepository.findAll();
    }

    @GetMapping("/courses/1")
    public Course getACourse(){
        return new Course(1, "Learn Microservices 1", "in28Minutes");
    }
}