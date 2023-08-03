package com.glearning.corejava;

public class ThreeDimensionShape {
	double width, height, depth;
	ThreeDimensionShape(double a, double b, double c){
		width = a;
		height = b;
		depth = c;
	}
	
	ThreeDimensionShape(double e){
		width = e;
		height = e;
		depth = e;
	}
	
	ThreeDimensionShape(){
		width=height=depth=0;
		   
		
	}
	
	double volume() {
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		
		ThreeDimensionShape shape1 = new ThreeDimensionShape(5,6, 7);
		ThreeDimensionShape shape2 = new ThreeDimensionShape();
		ThreeDimensionShape shape3 = new ThreeDimensionShape(8); 
		
		double volume;
		volume = shape1.volume();
		System.out.println("The Volume of this Shape1 is " + volume);
		
		volume = shape2.volume();
		System.out.println("The Volume of this Shape2 is " + volume);
		
		volume = shape3.volume();
		System.out.println("The Volume of this Shape3 is " + volume);
		
	    
		

		
		
	}
}

	
	
	
	


	
	


