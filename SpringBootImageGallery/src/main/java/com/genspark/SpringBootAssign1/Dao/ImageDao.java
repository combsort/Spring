package com.genspark.SpringBootAssign1.Dao;

import com.genspark.SpringBootAssign1.Entity.Course;
import com.genspark.SpringBootAssign1.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image,Integer> {
}
