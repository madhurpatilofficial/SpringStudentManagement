package com.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StudentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }
}


//Now I want to use a frontend application for our application using Angular, I have created the angular application I request you to give me the complete code for angular connecting Spring boot application.....
//Below is the app.component.ts file for your reference........
//Note that I have changed the port number of springboot to 7283.
//
//
//
