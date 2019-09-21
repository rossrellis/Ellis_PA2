package ellis_p2;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Imperial or Metric?:");
		String choice = scnr.next();
		
		if(choice.equals("imperial") || choice.equals("Imperial")) {
			double weightLbs, heightInch;

			System.out.println("Enter weight in pounds:");
			weightLbs = scnr.nextDouble();
			System.out.println("Enter height in inches:");
			heightInch = scnr.nextDouble();
			
			double Bmi = (703 * weightLbs) / (Math.pow(heightInch,  2));
			System.out.println("BMI: " + Bmi);
		}
		else if(choice.equals("metric") || choice.equals("Metric")) {
			double weightKgs, heightMeter;

			System.out.println("Enter weight in kilograms:");
			weightKgs = scnr.nextDouble();
			System.out.println("Enter height in meters:");
			heightMeter = scnr.nextDouble();
			
			double Bmi = (weightKgs) / (Math.pow(heightMeter, 3));
			System.out.println("BMI: " + Bmi);
		}
			System.out.println("Underweight = < 18.5\nNormal weight = 18.5-24.9\nOverweight = 25-29.9\nObesity = BMI of 30 or greater");

	}

}