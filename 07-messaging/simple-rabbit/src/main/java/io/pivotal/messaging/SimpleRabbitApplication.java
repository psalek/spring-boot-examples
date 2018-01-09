package io.pivotal.messaging;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SimpleRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRabbitApplication.class, args);
	}
	
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Scheduled(fixedDelay = 1000L)
	public void send() {
		this.rabbitTemplate.convertAndSend("spring-boot", "Hello World! at " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
	@RabbitListener(queues = "spring-boot")
	public void process(String message) {
		System.out.println(">>> " + message);
	}
	
	@Bean
	public Queue queue() {
		return new Queue("spring-boot", false);
	}	
}