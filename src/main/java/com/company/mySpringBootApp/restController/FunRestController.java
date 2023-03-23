//package com.company.mySpringBootApp.restController;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FunRestController {
//
//    @Value("${name}")
//    private String userName;
//
//    @GetMapping("/userName")
//    public String userName() {
//        return "The name of user is " + userName;
//    }
//
//    @GetMapping("/")
//    public String sayHello() {
//        return "Hello World!";
//    }
//
//    @GetMapping("/test")
//    public String test() {
//        return "Test";
//    }
//
//    @GetMapping("/devtools")
//    public String devTools() {
//        return "It is working!";
//    }
//}
