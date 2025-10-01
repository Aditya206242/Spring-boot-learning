package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
        System.out.println("hello everyone: This is first Sprintboot Project");



        ///  tight coupling
//        Employee emp1 = new Employee();
//        emp1.id = 111;
//        emp1.name = "Ajay k";
//        emp1.email = "ajay123@gmail.com";
//        emp1.designation = "developer";
//
//        Address adrs1 = new Address();
//        adrs1.doorNo = 345;
//        adrs1.streetName = "some street";
//        adrs1.city = "some city";
//
//        emp1.address = adrs1;
//
//        System.out.println("emp1 is :"+emp1);
//        System.out.println("adrs1 is :"+adrs1);
//
//
//        // change the addres
//        adrs1.streetName = "new street";
//        adrs1.city = "new city";
//
//        System.out.println("emp1 is after address change :"+emp1);
//        System.out.println("adrs1 is after address change :"+adrs1);


        // so here the emp object depending on the address object
        // whenever address object will change emp also will get affected
        // so that is called tight coupling (one object depend on other object)

        // so we should avoid tight coupling , we should make our object loose coupling




        ///  loose coupling (object does not depend on other object)
        // types of loose coupling
        // 1. setter injection
        // so setter injection says that you should have a getter setter for each class
        // using the getter setter you should access the data

        Employee emp2 = new Employee();
        emp2.setId(222);
        emp2.setName("Vijay K");
        emp2.setDesignation("tester");
        emp2.setEmail("vijay123@gmail.com");

        Address adrs2 = new Address();
        adrs2.setDoorNo(567);
        adrs2.setStreetName("old street");
        adrs2.setCity("old city");

        emp2.setAddress(adrs2);

        System.out.println("emp2 is :"+emp2);
        System.out.println("adrs2 is: "+adrs2);

        emp2.getAddress().setStreetName("new street");
        emp2.getAddress().setCity("new city");

        System.out.println("emp2 is after address change :"+emp2);
        System.out.println("adrs2 is after address change: "+adrs2);



        //2. Constructor injection
        Address adrs3 = new Address(367,"old street","old city");
        Employee emp3 = new Employee(333,"Sanjay k","sanjay123@gmail.com","tester",adrs3);

        System.out.println("emp3 is : "+emp3);
        System.out.println("adrs3 is :"+adrs3);

        // change the data
        emp3.getAddress().setCity("new city");

        System.out.println("emp3 is after change adrs3 : "+emp3);
        System.out.println("adrs3 is after change adrs3 :"+adrs3);


















    }

}
