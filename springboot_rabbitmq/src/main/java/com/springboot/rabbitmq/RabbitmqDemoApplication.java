package com.springboot.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqDemoApplication implements CommandLineRunner{
	@Autowired
	RabbitTemplate rabbitTemplate; //1

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
    }
    
    @Bean //2
    public Queue wiselyQueue(){
        return new Queue("my-queue");
    }
    

	@Override
	public void run(String... args) throws Exception {
		 rabbitTemplate.convertAndSend("my-queue", "来自RabbitMQ的问候"); //3
	}
}
