package com.aws.cicd.pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

	
	private int id;
	private String name;
	private int quantity;
	private long price;
	
	public Order(int id , String name,int quantity, long  price) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price = price;
	}
}
