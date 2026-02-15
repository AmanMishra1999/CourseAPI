package com.course.service;

import java.util.List;

import com.course.entity.Course;

public interface CourseService {

    Course createCourse(Course course);

    Course getCourseById(Long id);

    List<Course> getAllCourses();

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);
}