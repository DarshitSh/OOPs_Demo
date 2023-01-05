// Java program to demonstrate the
// real-world example of Interfaces

import java.io.*;

interface Vehicle {
	
	// all are the abstract methods.
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

class Bicycle implements Vehicle{
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
}

class GFG {
	
	public static void main (String[] args) {
	
		// creating an inatance of Bicycle
		// doing some operations
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(6);
		bicycle.speedUp(7);
		bicycle.applyBrakes(3);
		
		System.out.println("Bicycle present state :");
		bicycle.printStates();
		
	}
}
