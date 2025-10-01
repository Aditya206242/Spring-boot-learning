package com.firstapp.first_spring_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")


public class SampleController {

    @GetMapping("/getSample1")
    public String getSample1(){
        System.out.println("this is sample api");
        return "this is sample api";

    }




}
