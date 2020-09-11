package com.aws.cicd.pipeline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class AwsCicdPipelineApplication {
	
	@Autowired
	private OrderDao orderDao;
	
	@GetMapping
	public List<Order> fetchOrders(){
		
		return orderDao.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsCicdPipelineApplication.class, args);
	}

}
