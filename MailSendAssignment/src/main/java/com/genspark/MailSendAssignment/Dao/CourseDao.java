package com.genspark.MailSendAssignment.Dao;

import com.genspark.MailSendAssignment.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {

}
