package com.genspark.MailSendAssignment.Dao;

import com.genspark.MailSendAssignment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
