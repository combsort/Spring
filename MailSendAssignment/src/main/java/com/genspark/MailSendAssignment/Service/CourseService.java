package com.genspark.MailSendAssignment.Service;

import com.genspark.MailSendAssignment.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    Course getByCourseId(int id);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int courseId);

}
