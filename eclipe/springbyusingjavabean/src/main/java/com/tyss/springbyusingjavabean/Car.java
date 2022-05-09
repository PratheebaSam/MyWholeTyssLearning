package com.tyss.springbyusingjavabean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String modelName;
	private String brand;
	private double amount;
	@Autowired
	private CarSpare spares;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String modelName, String brand, double amount) {
		super();
		this.modelName = modelName;
		this.brand = brand;
		this.amount = amount;
	}
	
	public Car(String modelName, String brand, double amount, CarSpare spares) {
		super();
		this.modelName = modelName;
		this.brand = brand;
		this.amount = amount;
		this.spares = spares;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public CarSpare getSpares() {
		return spares;
	}
	public void setSpares(CarSpare spares) {
		this.spares = spares;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", brand=" + brand + ", amount=" + amount + ", spares=" + spares + "]";
	}
	
	
	
}
