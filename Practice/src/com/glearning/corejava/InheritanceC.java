package com.glearning.corejava;

public class InheritanceC extends InheritanceB{
	public float base, height, areaT;
	
	public void triangleArea(float b, float h ) {
		System.out.println("The Area of Triangle is 1/2*base*height");
		base = b;
		height = h;
		areaT = 0.5f * base * height;
		System.out.println("The Area of your Triangle is " + areaT +" cm");
	}
	
	public static void main(String[] args) {
		InheritanceC Area = new InheritanceC();
		Area.circleArea(12.5f);
		Area.rectangleArea(15, 6.2f);
		Area.triangleArea(25, 14);
	}
}
 