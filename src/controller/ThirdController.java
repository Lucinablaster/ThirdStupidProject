package controller;

import java.util.Scanner;

public class ThirdController 
{

	public void start()
	{
		System.out.println("This is the questions show.!!!!!");
		System.out.print("First we will ask you a question..  ");
		System.out.println("THEN YOU MUST ANSWER");
		
		questions();
		
		moreInput();
	}

	private void moreInput() 
	{
		Scanner textScanner; // This is a declaration of a scanner variable.
		
		textScanner = new Scanner(System.in); // Initialization of the textScanner variable.
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " + userNumber);// + squishes the variables together
		
		textScanner.close();
	}	
	private void questions()
	{
		System.out.println("Johny Johny?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		
		if (answer == "Yes Papa?") {
			
			System.out.println("Eating sugar?");
			answer = inputScanner.nextLine();
			
			if (answer == "No Papa") {
			System.out.println("Telling lies");
			answer = inputScanner.nextLine();
				
				if (answer == "No Papa") {
					System.out.println("Open your mouth");
					answer = inputScanner.nextLine();
					System.out.println("That's my Johny!");
				} 
				else {
					System.out.println("Who's this IMPOSTER?!");
				}
				
			
			} else {
				System.out.println("You fake little child, I disown you.");
			}
		
		
		} else {
			System.out.println("You aren't Johny, get out!!!");
		}
		


	}
	
}
