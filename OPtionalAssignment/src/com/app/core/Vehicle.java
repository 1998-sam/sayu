package com.app.core;

public class Vehicle {


	private String regNo;
	private String color;
	private double price;
	private String model;
	public Vehicle(String regNo,String color,double price,String model) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + ", model=" + model + "]";
	}

	
	/* @Override
  public boolean equals(Object o)
  {
	System.out.println("in vehicle's equals");
	if(o instance of Vehicle)
	{
		Vehicle v=(Vehicle)o;
		return regNo.equals(v.regNo)&& color.equals(v.color);
		
	}
	return false;
  }
  
	@Override
	public integer hashCode()
	{
		System.out.println("in hashCode");
		//String class has already overridden hashCode() to maintain contract
		return regNo.hashCode()*color.hashCode();
	} */

  @Override
  public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((regNo == null) ? 0 : regNo.hashCode());
	return result;
  } 
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehicle other = (Vehicle) obj;
	if (color == null) {
		if (other.color != null)
		return false;
	} else if (!color.equals(other.color))
		return false;
	if (regNo == null) {
		if (other.regNo != null)
		return false;
	} else if (!regNo.equals(other.regNo))
		return false;
	return true;
 }

 }


