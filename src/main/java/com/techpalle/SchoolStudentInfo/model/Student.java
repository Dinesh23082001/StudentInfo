package com.techpalle.SchoolStudentInfo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "studentInfo")
public class Student {

    @Id()
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String name;
    private String pho;
    private String mail;
}
