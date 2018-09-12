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
	
	private void questions()
	{
		System.out.println("Johny Johny?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		
		if (answer == "Yes Papa?") 
		{
			System.out.println("Eating Sugar?");
			answer = inputScanner.nextLine();
		}
			
	} 
		
	public boolean validInt(String sample) 
	{
		//Declares and initializes a boolean variable to false.
		boolean isValid = false; //declaring a boolean variable
		
		try
		{
			//Tries to convert the text to an integer...
			Integer.parseInt(sample);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number mammal!");
		}
		
		return isValid;
	}
			
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException oops)
		{
			System.out.println("Only floating point values are accepted AKA a number with a . in it");
		}
		
		return true; 
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
	
}
