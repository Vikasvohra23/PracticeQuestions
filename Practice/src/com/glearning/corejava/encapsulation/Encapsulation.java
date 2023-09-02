package com.glearning.corejava.encapsulation;

public class Encapsulation {
	private String country, nationalAnthem, touristSpot;
	public String getCountry() {
		return country;	
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNationaAnthem() {
		return nationalAnthem;	
	}
	public void setNationaAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;	
	}
	public String getTouristSpot() {
		return touristSpot;	
	}
	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;	
	}
	
	public static void main(String[] args) {
		Encapsulation c = new Encapsulation();
		c.setCountry("India");
		c.setNationaAnthem("JanGanMan");
		c.setTouristSpot("New Delhi");
		
		System.out.println(c.getCountry() + " " + c.getNationaAnthem() + " " + c.getTouristSpot());
		
	 
		
	}
}
