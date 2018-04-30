package mpgcpm;

public class Mpgcpm0 {

	public static void main(String[] args)
	{
		
		//Declare Variables and hard code
		
		int previousMiles = 10000, 
		    currentMiles = 10500,
		    totalMiles = 0;
		
		final double GALLON = 4.54;
		
		double noOfLitres = 45.40, totalGallons = 0, mpg = 0.0;
		
		String heading = "MPG Calculator";
	
		//Process
		
		totalMiles = currentMiles - previousMiles;
				
		totalGallons = noOfLitres / GALLON;
				
		mpg = totalMiles / totalGallons;
			
		System.out.println(heading);
		System.out.println("Miles per gallon is " + mpg);
				
	}

}
