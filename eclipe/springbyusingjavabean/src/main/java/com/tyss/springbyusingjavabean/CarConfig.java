package com.tyss.springbyusingjavabean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages="com.tyss.springbyusingjavabean")
public class CarConfig {
	@Bean(name="car")
	public Car getCar() {
		Car car = new Car();
		car.setBrand("audi");
		car.setModelName("a4");
		car.setAmount(4000000);
		CarSpare spare = new CarSpare();
		spare.setBattery("lead");
		spare.setTier("mrf");
		car.setSpares(spare);
		return car;		
	}
//	@Bean(name="car2")
//	public Car getCar1() {
//		Car car = new Car();
//		car.setBrand("maruthi");
//		car.setModelName("swiss");
//		car.setAmount(200000);
//		CarSpare spare = new CarSpare();
//		spare.setBattery("lead");
//		spare.setTier("mrf");
//		car.setSpares(spare);
//		return car;
//	}
	@Bean(name="spares")
	@Primary
	public CarSpare getcarspare() {
		CarSpare spare = new CarSpare();
		spare.setBattery("lead");
		spare.setTier("mrf");
		return spare;
	}
	@Bean(name="spares")
	public CarSpare getcarspare1() {
		CarSpare spare = new CarSpare();
		spare.setBattery("lead");
		spare.setTier("mr");
		return spare;
	}
	
}
