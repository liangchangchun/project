package com.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpademo.dao.PersonRepository;
import com.jpademo.support.CustomRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class JpaDemoApplication {
	@Autowired
	PersonRepository personRepository;
	
	
    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
        
    }
    
 
}
