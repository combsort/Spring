package com.genspark.SpringBootAssign1.Dao;

import com.genspark.SpringBootAssign1.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {

}
