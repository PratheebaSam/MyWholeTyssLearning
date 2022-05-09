package com.tyss.springcore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoyFriend {
	private String name;
	private String phoneNumber;
	private String instaId;
	private String bestQuality;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	public String getInstaId() {
//		return instaId;
//	}
//	public void setInstaId(String instaId) {
//		this.instaId = instaId;
//	}
//	public String getBestQuality() {
//		return bestQuality;
//	}
//	public void setBestQuality(String bestQuality) {
//		this.bestQuality = bestQuality;
//	}
	@Override
	public String toString() {
		return "BoyFriend [name=" + name + ", phoneNumber=" + phoneNumber + ", instaId=" + instaId + ", bestQuality="
				+ bestQuality + "]";
	}
	
	
}
