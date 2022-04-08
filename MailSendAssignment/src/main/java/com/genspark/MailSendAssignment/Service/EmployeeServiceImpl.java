package com.genspark.MailSendAssignment.Service;


import com.genspark.MailSendAssignment.Dao.CourseDao;
import com.genspark.MailSendAssignment.Dao.EmployeeDao;
import com.genspark.MailSendAssignment.Entity.Course;
import com.genspark.MailSendAssignment.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmailSenderService emailSenderService;

    public Employee getByEmployeeId(int id){
        Optional<Employee> e = this.employeeDao.findById(id);
        Employee employee = null;
        if (e.isPresent()) employee = e.get();
        else throw new RuntimeException("Employee not found for id: "+id);
        return employee;
    }

    public List<Employee> getAllEmployees(){

        return this.employeeDao.findAll();
    }

    public Employee addEmployee(Employee employee){
        emailSenderService.sendEmail("amdalr@gmail.com", "Test Mail","Employee added");
        return this.employeeDao.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return this.employeeDao.save(employee);
    }

    public String deleteEmployee(int employeeId){
        this.employeeDao.deleteById(employeeId);
        emailSenderService.sendEmail("amdalr@gmail.com", "Test Mail","Employee deleted");
        return "Deleted Successfully";
    }

}
