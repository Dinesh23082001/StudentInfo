package com.techpalle.SchoolStudentInfo.repository;

import com.techpalle.SchoolStudentInfo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
