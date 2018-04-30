package paint;

import java.util.Scanner;

public class Paintv4 {
	
	//Class Variables
	//Constants
			static final double COVERAGE = 350;
			static final double PIE = Math.PI;
			static final double GALLON = 4.54;
			static final double WASTAGE = 1.10;
					
			//Variables
			static double surfaceArea = 0.0;
			static double radius = 0.0;
			static double paintRequired = 0.0;
			static double paintRequiredLitres = 0.0;
			static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) 
	{		
		//Input
		getRadius();
		//Process
		getPaintCoverage();
		//Output
		getOutput();
	
	}
	
	public static void getRadius()
	{
		System.out.println("Please input radius");
		radius = keyboard.nextDouble();
		//radius = Double.parseDouble(args[0]);
		
	}
	
	public static void getPaintCoverage()
	{
		getSurfaceArea();
		getPaintRequiredInGallons();
		getPaintRequiredInLitres();
			
	}
	
	public static void getSurfaceArea()
	{
		surfaceArea = 2 * radius * PIE;
	}
	
	public static void getPaintRequiredInGallons()
	{
		paintRequired = surfaceArea / COVERAGE;
	}
	
	public static void getPaintRequiredInLitres()
	{
		paintRequiredLitres = paintRequired * GALLON;
	}
	
	public static void getOutput()
	{
		System.out.printf("Paint required in gallons is %.2f for radius %.2f %n",
		           paintRequired, radius);
		System.out.printf("Paint required in litres is %.2f for radius %.2f %n",
        paintRequiredLitres, radius);
		System.out.print("Hope you have a nice day -- Rosco's dog is Flash");
	}
	
	
	
	
	
	
	
	

}
