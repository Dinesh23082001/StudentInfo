package com.techpalle.SchoolStudentInfo.service;


import com.techpalle.SchoolStudentInfo.model.Student;
import com.techpalle.SchoolStudentInfo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveInfo(Student student){
        return studentRepo.save(student);
    }


}
