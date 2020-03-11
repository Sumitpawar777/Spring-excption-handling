package com.javatechie.spring.exp.handle.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "ORDER_TB")
public class Order {
	@Id
	private int id;
	private String name;
	private String catagory;
	private double amount;
	
	

	public Order() {
		super();
	}

	public Order(int id, String name, String catagory, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", catagory=" + catagory + ", amount=" + amount + "]";
	}
	
}
