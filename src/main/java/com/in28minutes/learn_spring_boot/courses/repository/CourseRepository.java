package com.in28minutes.learn_spring_boot.courses.repository;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
