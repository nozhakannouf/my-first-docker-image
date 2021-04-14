package com.realdolmen.myfirstdockerimage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    //create dockerfile
    //clean package
    //create docker image: docker build -t first-docker-custom-image .
    //run a container form this image: docker run --name first-docker-custom-container -d -p 8088:8080 first-docker-custom-image
    //open a browser to: http://localhost:8088/app/ this should work!
}
