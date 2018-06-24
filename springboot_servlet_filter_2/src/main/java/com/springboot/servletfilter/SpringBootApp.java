package com.springboot.servletfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = { 
    "com.boraji.tutorial.springboot.servlet",
    "com.boraji.tutorial.springboot.filter", 
    "com.boraji.tutorial.springboot.listener"
   })
public class SpringBootApp {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootApp.class, args);
  }

}
