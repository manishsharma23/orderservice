package com.aws.cicd.pipeline;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;


@Repository
public class OrderDao {
	
	public List<Order> getOrders(){
		
		return Stream.of(
				new Order(101,"mani",4,67587)).collect(Collectors.toList());
			
			//new Order(id:101,name:"Mobile",quantity:1,price:300000)
			//.collect(Collectors.toList()));
			
		}

}
