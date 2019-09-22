package ellis_p3;

import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"political issues", "global issues", "food","video games","music"};
		int numVoters,i,k,j;
		double ratings;
		
		System.out.print("How many voters?:");
		numVoters = scnr.nextInt();
		
		double totals[] = new double[5];
		
		for(i = 0; i < numVoters ; i++) {
			k = i + 1;
			for(j = 0; j < 5; j++) {
				System.out.print("Person " + k + " - " + topics[j] + ":");
				ratings = scnr.nextDouble();
				if(ratings > 10) {
					System.out.println("Invalid, enter a ratings between 1 and 10");
					ratings = scnr.nextDouble();
				}
				totals[j] += ratings;
				

				}
			}
		
		

		for(i = 0; i < 5;i++)
		{
			System.out.println("Average rating for " + topics[i] + ":" + (totals[i] / numVoters));
		}
		
		double min = totals[0], max = totals[0];
		String lowRating = topics[0], highRating = topics[0];
		
		for(i = 0; i < 5; i++) {
			if(totals[i] > max) {
				max = totals[i];
				highRating = topics[i];
			}
			if(totals[i] < min) {
				min = totals[i];
				lowRating = topics[i];
			}
		}
		
		
		String [][] table = new String [5][10];
		
		for(i = 1; i < table.length; i++) {
			for(j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "      ");
				}
		}
		System.out.println();
		
		System.out.println("Topic: " + lowRating + " had the lowest rating");
		System.out.println("Topic: " + highRating + " had the highest rating");
		
		
		

		
		

		
		
		
		
		
		
		
	}

}
