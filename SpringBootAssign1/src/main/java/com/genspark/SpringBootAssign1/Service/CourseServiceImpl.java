package com.genspark.SpringBootAssign1.Service;

import com.genspark.SpringBootAssign1.Dao.CourseDao;
import com.genspark.SpringBootAssign1.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseDao courseDao;

    public Course getByCourseId(int id){
        Optional<Course> c = this.courseDao.findById(id);
        Course course = null;
        if (c.isPresent()) course = c.get();
        else throw new RuntimeException("Course not found for id: "+id);
        return course;
    }

    public List<Course> getAllCourses(){
        return this.courseDao.findAll();
    }

    public Course addCourse(Course course){
        return this.courseDao.save(course);
    }

    public Course updateCourse(Course course){
        return this.courseDao.save(course);
    }

    public String deleteCourse(int courseId){
        this.courseDao.deleteById(courseId);
        return "Deleted Successfully ";
    }

}
