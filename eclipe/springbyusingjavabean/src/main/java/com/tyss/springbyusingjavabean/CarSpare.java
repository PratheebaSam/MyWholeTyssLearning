package com.tyss.springbyusingjavabean;

import org.springframework.stereotype.Component;

@Component
public class CarSpare {
	private String battery;
	private String tier;
	public CarSpare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarSpare(String battery, String tier) {
		super();
		this.battery = battery;
		this.tier = tier;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "CarSpare [battery=" + battery + ", tier=" + tier + "]";
	}
	
}
