package points; 

// This program calculates the amount of housing points a student has based off of 5 factors. 

import java.util.Scanner; 

public class HousingDecisionMaker { 

 

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in); 

		int housingPoints = 0; 

		 

	// Ask for student standing and add points  

		System.out.println("What is your student standing?"); 

		System.out.print("1)Freshman\n2)Sophomore\n3)Junior\n4)Senior and above\n"); 

		System.out.println("Enter a number: "); 

		int year = scan.nextInt(); 
		

		while (year != 1 && year != 2 && year != 3 && year != 4) 

			{ 

				System.out.println("Invalid Input\nTry again:"); 

				year = scan.nextInt(); 

			} 

		if (year == 1) 

			{housingPoints += 2;} 

		else if(year == 2 || year == 3 || year >=4) 

			{housingPoints ++;} 

		 

	//Ask for student financial aid and add points 

		System.out.print("How much financial aid have you received?"); 

		System.out.print("\n1)0- 10k \n2)Greater than 10k\n3)Full tuition\n"); 

		System.out.println("Enter a number: "); 

		int aid = scan.nextInt(); 

		while (aid != 1 && aid != 2 && aid != 3) 

			{ 

				System.out.println("Invalid Input\nTry again:"); 

				aid = scan.nextInt(); 

			} 

		if (aid == 1) 

			{housingPoints ++;} 

		else if (aid == 2) 

			{housingPoints += 2;} 

		else if(aid == 3) 

			{housingPoints += 3;} 

		 

	// Ask for student proximity from home to campus and add points 

		System.out.println("How many miles from campus is your residence?"); 

		System.out.print("1)Between 30 and 100\n2)Greater than 100\n3)Out of State\n"); 

		System.out.println("Enter a number: "); 

		int miles = scan.nextInt(); 

		while (miles != 1 && miles != 2 && miles != 3) 

			{ 

				System.out.println("Invalid Input\nTry again:"); 

				miles = scan.nextInt(); 

			} 

		if (miles == 1) 

			{housingPoints += 2;} 

		else if(miles ==2) 

			{housingPoints += 3;} 

		else if (miles == -1) 

			{housingPoints += 4;} 

		 

	// Ask if they are employed on campus and add points 

		System.out.println("Are you employed on campus?"); 

		System.out.print("1)Yes\n2)No\n"); 

		System.out.println("Enter a number: "); 

		int employed = scan.nextInt(); 

		while (employed != 1 && employed != 2) 

			{ 

				System.out.println("Invalid Input\nTry again:"); 

				employed = scan.nextInt(); 

			} 

		if (employed == 1) 

			{housingPoints ++;} 

		 

	// Ask if they have been on academic or disciplinary probation and subtract points 

		System.out.println("Have you ever been on academic or disciplinary probation/suspension?"); 

		System.out.print("1)Yes\n2)No\n"); 

		System.out.println("Enter a number: "); 

		int probation = scan.nextInt(); 

		while (probation != 1 && probation != 2 ) 

			{ 

				System.out.println("Invalid Input\nTry again:"); 

				probation = scan.nextInt(); 

			} 

		if (probation == 1) 

			{housingPoints -= 3;} 

		 

		//Print final housing points total 

		System.out.println("You have " + housingPoints + " housing point(s).");
		
		// close Scanner
		scan.close();

		} 

} 

 
