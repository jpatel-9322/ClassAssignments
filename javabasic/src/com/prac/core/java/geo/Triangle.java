package com.prac.core.java.geo;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	
	public Triangle(int b, int h)
	{
		
		this.base = b;
		this.height = h;
		
	}
	public Triangle()
	{
		base= 10;
		height= 12;
		
	}


	@Override
	public void calShapeArea() {
		float temp = 0.5f*(base*height);
		System.out.println("Area of the Triangle is " + temp);
	}
	

	
	public final void displayCircle(){
		System.out.println("Triangle: Display");
	}
}
