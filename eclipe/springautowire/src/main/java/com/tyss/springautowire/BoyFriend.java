package com.tyss.springautowire;

public class BoyFriend {
	private String name;
	private String phoneNumber;
	private String instaId;
	private String bestQuality;
	private GirlFriend girlFriend;
	
	public BoyFriend() {
		super();
	}
	

	public BoyFriend(String name, String phoneNumber, String instaId, String bestQuality) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.instaId = instaId;
		this.bestQuality = bestQuality;
	}


	public BoyFriend(String name, String phoneNumber, String instaId, String bestQuality, GirlFriend girlFriend) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.instaId = instaId;
		this.bestQuality = bestQuality;
		this.girlFriend = girlFriend;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInstaId() {
		return instaId;
	}
	public void setInstaId(String instaId) {
		this.instaId = instaId;
	}
	public String getBestQuality() {
		return bestQuality;
	}
	public void setBestQuality(String bestQuality) {
		this.bestQuality = bestQuality;
	}
	
	public GirlFriend getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}

	@Override
	public String toString() {
		return "BoyFriend [name=" + name + ", phoneNumber=" + phoneNumber + ", instaId=" + instaId + ", bestQuality="
				+ bestQuality + ", girlFriend=" + girlFriend + "]";
	}

	
	
}
