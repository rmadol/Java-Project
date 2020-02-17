package Practice_Car;

import java.util.Scanner;

public class FuelLevel extends CarPart {
	private float tankLevel;
	
	//Constructor
	public FuelLevel(float tankLevel) {
		super("Current fuel level", 108);
		tankLevel = tankLevel;
	}
	
	//Getters

	public float getTankLevel() {
		return tankLevel;
	}
	
	//Setters

	@Override
	public void function() {
		System.out.println("Welcome! Your fuel level is low, let's add gas before beginning the drive.");
		setCondition(100);
		
		int b;
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the number of gallons of gas you wish to add: ");
		b = i.nextInt();
		
		if (b <= 0) {
			condition = b;
			System.out.println("No fuel added due to an erro. Please check in with the cashier.");
		}else if (b == 8) {
			condition = b;
			System.out.println("You added " + condition + " gallons.");
			status("You have a range of 200 miles, based on current fuel level");
		}else if (b <= 4) {
			condition = b;
			System.out.println("You added " + condition + " gallons.");
			status("You have less than a quarter tank, consider refueling soon!");
		}else if (b >= 9) {
			condition = b;
			System.out.println("You added " + condition + " gallons.");
			status("Your fuel level is optimal, Enjoy the drive!");
		}
	}
}