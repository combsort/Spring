package com.genspark.MailSendAssignment.Service;

import com.genspark.MailSendAssignment.Dao.CourseDao;
import com.genspark.MailSendAssignment.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;
    @Autowired
    private EmailSenderService emailSenderService;

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
        emailSenderService.sendEmail("amdalr@gmail.com", "Test Mail","Course added");
        return this.courseDao.save(course);
    }

    public Course updateCourse(Course course){
        return this.courseDao.save(course);
    }

    public String deleteCourse(int courseId){
        this.courseDao.deleteById(courseId);
        emailSenderService.sendEmail("amdalr@gmail.com", "Test Mail","Course deleted");
        return "Deleted Successfully";
    }

}
