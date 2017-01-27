import java.util.Scanner;

public class HeightConverter
	{

		public static void main(String[] args)
			{
			double feetHeight = inputFeet();
			double inchesHeight = inputInches();
			double totalInches = convertToInches(feetHeight, inchesHeight);
			double centimeters = convertInchToCent(totalInches);
			double meters = convertCentToMeters(centimeters);
			double feet = convertMetersToFeet(meters);
			double inches = convertFeetToInch(feet);
			}
		
		public static double inputFeet()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please type how tall you are in feet.");
				return userInput.nextDouble();
			}
		
		public static double inputInches()
			{
				Scanner userInput2 = new Scanner(System.in);
				System.out.println("Please type the inches. For examples if you are 5'10 type 10");
				return userInput2.nextDouble();
			}
		
		public static double convertToInches(double x , double y)
			{
				double totalInches= x * 12 + y;
				System.out.println("You are " + totalInches + " inches tall.");
				return totalInches;
			}
		
		public static double convertInchToCent(double x)
			{
				double centimeters = x * 2.54;
				System.out.println("You are " + centimeters + " centimeters tall.");
				return centimeters;
			}
			
		public static double convertCentToMeters(double x)
			{
				double meters = x * .01;
				System.out.println("You are " + meters + " meters tall.");
				return meters;
			}
			
		public static double convertMetersToFeet(double x)
			{
				double feet = x * 3.28084;
				System.out.println("You are " + feet + " feet tall.");
				return feet;
			}
		
		public static double convertFeetToInch(double x)
			{
				double inches = x * 12;
				System.out.println("You are " + inches + " inches tall.");
				return inches;
			}
	}
