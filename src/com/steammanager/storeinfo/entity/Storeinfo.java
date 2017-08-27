package com.steammanager.storeinfo.entity;

public class Storeinfo {
	private int id;
	private String name;
	private String image;
	private int price;
	private int initial;
	private int discount;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
