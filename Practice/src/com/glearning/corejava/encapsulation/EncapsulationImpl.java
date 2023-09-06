package com.glearning.corejava.encapsulation;

public class EncapsulationImpl {
	private int age;
	private boolean decision;
	
	public int getAge() {
		return age;
	}
	
	public boolean getDecision() {
		return decision;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDecision(boolean result) {
		this.decision = result;
	}
	
	public static void main(String[] args) {
		EncapsulationImpl obj = new EncapsulationImpl();
		obj.setAge(70);
		
		if(obj.getAge() <= 60) {
			obj.setDecision(true);	
		}
		
		else {
			obj.setDecision(false);
		}
		
		System.out.println("The age of the candidate is " + obj.getAge());
		System.out.println("Driving License can be issued to the candidate " + obj.getDecision());
	}

}
