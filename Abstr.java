// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
import java.util.*;
abstract class Bank {
	abstract void loan();
}

// Class 2
class Derived extends Bank {
	void loan()
	{
        	int a = 2959;
        	if(a > 2000)
		System.out.println("Loan Approved");
		else
		System.out.println("Not Approved");
	}
}

// Class 3
// Main class
class Main {

	// Main driver method
	public static void main(String args[])
	{
                Scanner sc = new Scanner(System.in);
		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		Derived b = new Derived();

		b.loan();
	}
}
