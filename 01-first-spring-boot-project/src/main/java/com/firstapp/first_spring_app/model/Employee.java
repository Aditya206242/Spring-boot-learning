package com.firstapp.first_spring_app.model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String designation;

    public Employee(int id, String name, String email, String designation, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.address = address;
    }

    public Employee() {
    }

    private Address address; // Addres is an another class

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // notes -> if the class the printing the object location so we have to convert object
    // into the String formate

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}
