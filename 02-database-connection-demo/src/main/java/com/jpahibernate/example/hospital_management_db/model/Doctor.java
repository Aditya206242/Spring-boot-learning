package com.jpahibernate.example.hospital_management_db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // it represents that this class is entity class or model class
// which directly creating database table or schema
// we should create a table of Docter name in database;
// and column name should be id, name,email,specialization

@Table(name="Doctor") // it will create a table of Docter name in database
// don't need to create a table by sql query
// if you don't give me name this will take a class name and create table


public class Doctor {


    @Id// it is the primary key of the table- it will unique and it is not null
    // we are using it above id so , id will be primary key
    @Column(name="id")// it will create a column inside the table
    private int id;

    @Column(name="name",nullable=false)
    // nullable - false -> it cannot contain null value
    //so name can not contain null value
    private String name;

    @Column(name="email",nullable=false,unique = true)
    // unique = true means it can not contain duplicate value
    // so email should not be duplicate
    private String email;


    @Column(name="specialization",nullable=false)
    private String specialization;


    @Column(name="dob",nullable=false)
    private String dob;


    @Column(name="mobile",nullable=false)
    private int mobile;

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
