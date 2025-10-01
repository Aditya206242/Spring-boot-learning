package com.firstapp.first_spring_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller // it a controller class its contains the api;
@ResponseBody //(send the response back to fronted) if you missed this anotation so responce will not go to the user

@RestController // it's a mixer of @Controller + @ResponseBody
// so you can write only this instead of above two ..

@RequestMapping("/demo/apis")


public class DemoController {


    //1.Get request
    @GetMapping("/demo1")
    public String getDemo1(){
            // for print in the console
            System.out.println("this is our first demo Api");

            // for return back to the user
            return "This is our first demo Api";
    }



    @GetMapping("/demo2")
    public String getDemo2(){
        // for print in the console
        System.out.println("this is our second demo Api");

        // for return back to the user
        return "This is our second demo Api";
    }





}
