package com.example.student_records.entity;



import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private int age;
    private String email;
    private int division;

    public Student(String name , int age , String email, int division){
        this.name=name;
        this.age=age;
        this.email=email;
        this.division=division;
    }
    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public int getDivision(){
        return division;
    }




}
