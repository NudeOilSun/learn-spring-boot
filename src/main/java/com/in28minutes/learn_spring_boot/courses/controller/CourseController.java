package com.in28minutes.learn_spring_boot.courses.controller;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getACourse(@PathVariable long id){
        Optional<Course> course = getCourse(id);

        return course.get();
    }

    private Optional<Course> getCourse(long id) {
        Optional<Course> course = courseRepository.findById(id);

        if (course.isEmpty()){
            throw new RuntimeException("Course not found with ID: "+ id);
        }
        return course;
    }

    @PostMapping("/courses")
    public void postCourse(@RequestBody Course request){
        courseRepository.save(request);
    }

    @PutMapping("/courses/{id}")
    public void putCourse(@RequestBody Course request, @PathVariable long id){
        courseRepository.save(request);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        courseRepository.deleteById(id);
    }

}