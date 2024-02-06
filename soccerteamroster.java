package Practice;

import java.util.Scanner;

public class Soccerteamroster {

	public static void menu() {
		System.out.println("MENU");
		System.out.println("u - Update player rating");
		System.out.println("a - Output players above a rating");
		System.out.println("r - Replace player");
		System.out.println("o - Output roster");
		System.out.println("v - Average rating");
		System.out.println("b - Best and Worst Players");
		System.out.println("q - Quit");
		System.out.println("Choose an option: ");	
	}
	
	public static void outputroster(int[] jearsey, int[] ratings){
		 System.out.println("ROSTER");
		    for (int i = 0; i < jearsey.length; i++) {
		        System.out.print("Player " + (i + 1) + " -- Jearsey number: " + jearsey[i]);
		        System.out.print(", Rating: " + ratings[i]);
		        System.out.println();
		    }
			
	}
	public static void updateroster(int[] jearsey, int[] ratings){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter jearsey number: ");
		int update;
		boolean found = false;
		int index = 0;
		int userrating;
		
		update = scnr.nextInt();
		for (int i = 0; i < jearsey.length; i++) {
		    if (update == jearsey[i]) {
		        index = i;
		        found = true;
		        break; // Exit the loop once a match is found
		    }
		    else if (update != jearsey[i]) {
		       found = false;
		        }
		    }
		
		
		if (!found) {
			System.out.println("Jearsey Number: " + update + " not available");
			System.out.println();
		}
		else if (found) {
			System.out.println("Enter User Rating: ");
			userrating = scnr.nextInt();
			ratings[index] = userrating;
	}
		}
	
	public static void outputaboverating(int[] jearsey, int[] ratings) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a rating: ");
		
		int input;
		input = scnr.nextInt();
		for(int i = 0; i < ratings.length; i++) {
		if(input < ratings[i]) {
		System.out.println("Player " + (i + 1) + " -- Jearsey number: " + jearsey[i]);
	}
		}
	}
	
	public static void replaceplayer(int[] jearsey, int[] ratings) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a jersey number: ");
		int num;
		num = scnr.nextInt();
		System.out.println("Enter a new jersey number: ");
		int newnum;
		newnum = scnr.nextInt();
		System.out.println("Enter a rating for the new player: ");
		int newrating;
		newrating = scnr.nextInt();
		
		
		for(int i = 0; i < jearsey.length; i++) {
			if (num == jearsey[i]) {
			jearsey[i] = newnum; 	
			ratings[i] = newrating;
			
			}
		}
	}
	
	public static void averagerating(int[] jearsey, int[] ratings) {
		double avgrating = 0;
		double result;
		for(int i = 0; i < ratings.length; i++) {
			avgrating += ratings[i];
		}
		result = avgrating/ratings.length;
		System.out.println(result);
	}
	
	public static void bestandworst(int[] jearsey, int[] ratings) {
			
		int temp = 0;
		int i;
		for(i = 0; i < ratings.length; i++) {
		
			for(int j = i + 1; j < ratings.length; j++) {
				
				if (ratings[j] < ratings[i]) {
					temp = ratings[i];
					ratings[i] = ratings[j];
					ratings[j] = temp;	
				}
			}
			
		}	
		System.out.println("Best Player: Player " + ratings.length + " -- Jearsey number: " +
                jearsey[i] + ", Rating: " + ratings[ratings.length - 1]);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter amount of players: ");
		int num;
		num = scnr.nextInt();
		int []jearseynum = new int[num];
		int []ratings = new int[num];
		String select;
	
		
		
		for(int i = 0; i < jearseynum.length; i++) {
			System.out.println("Enter player " + (i + 1) + "'s jearsey number: " );
			jearseynum[i] = scnr.nextInt();
			System.out.println("Enter player " + (i + 1) + "'s rating: " );
			ratings[i] = scnr.nextInt();
			}
		
		 outputroster(jearseynum, ratings);
		 
		 
	System.out.println();
	

	do {
		menu();
        select = scnr.next();

        switch (select) {
            case "o":
                outputroster(jearseynum, ratings);
                break;
            case "b":
               bestandworst(jearseynum, ratings);
                break;
            case "u":
                updateroster(jearseynum, ratings);
                break;
            case "a":
            	outputaboverating(jearseynum, ratings);
            	break;
            case "r":
            	replaceplayer(jearseynum, ratings);
            	break;
            case "v":
                averagerating(jearseynum, ratings);
                break;
            case "q":
                System.out.println("Quitting the program.");
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
        }

    } while (!select.equals("q"));
}
	}



