package paint;

import java.util.Scanner;

public class Paintv1 {

	public static void main(String[] args) 
	{
		
		//Class object     Instantiation Constructor Parameter   
		Scanner keyboard = new Scanner(System.in);
		
		//<---------------------- read from right to left           
		
		//Constants
		final double COVERAGE = 350;
		final double PIE = Math.PI;
		final double GALLON = 4.54;
		final double WASTAGE = 1.10;
		
		
		//Variables
		double surfaceArea = 0.0;
		double radius = 0.0;
		double paintRequired = 0.0;
		double paintRequiredLitres = 0.0;
		
		
		//Input
		System.out.println("Please enter radius");
		
		radius = keyboard.nextDouble();
		
		//Process
		surfaceArea = (2 * PIE * radius) * WASTAGE;
		
		paintRequired = surfaceArea / COVERAGE;
		
		paintRequiredLitres = paintRequired * GALLON;
		
		//Output
		
		//Paint required in litres is 5.25 for radius 6.0
		
		System.out.printf("Paint required in gallons is %.2f for radius %.2f %n",
				           paintRequired, radius);
		System.out.printf("Paint required in litres is %.2f for radius %.2f %n",
		           paintRequiredLitres, radius);
		System.out.print("Hope you have a nice day -- Rosco's dog is Flash");
		
	}

}
