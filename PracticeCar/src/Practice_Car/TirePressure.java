package Practice_Car;

import java.util.Scanner;

public class TirePressure extends CarPart {
	
	//Constructor
	
	public TirePressure(float inflationLevel) {
		super("Tire pressure", 100);
	}
	
	@Override
	public void function() {
		System.out.println("Okay, let's check your tire pressure.");
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the current temperature in Farenheit: ");
		a = s.nextInt();
		
		if (a <= 0) {
			condition = a;
			System.out.println("You tire popped, that will cost you $150. Ouch! ");
		}
		if (a < 70) {
			System.out.println("Tire pressure may be low due to cold weather conditions. Check that your air pressure is optimal (between 30-35 PSI).");
		}else if (a > 85) {
			System.out.println("Tire pressure may be high due to hot weather conditions. Check that your air pressure is optimal (between 30-35 PSI).");
		}else{
			System.out.println("Tire pressure is perfect, enjoy the drive!");
		}
	}
}


