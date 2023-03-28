package com.mobileCentre;

public class Mobile 
{
	private int id;
	private String brand;
	private String name;
	private float price;
	
	public Mobile() 
	{
	
	}

	public Mobile(int id, String brand,String name, float price) 
	{
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	
	public String toString() 
	{
		return "Mobile [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

	
	
	
	
	
	

}
