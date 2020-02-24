import java.util.Scanner;

import java.security.SecureRandom;


public class CAI2
{
	static Scanner sc = new Scanner(System.in);
	static SecureRandom rand = new SecureRandom();
	
	public static void main(String[] args) 
	{
		quiz();
	}
		//method to generate question

	public static int key() 
	{
		// Initializing the Variables!!!
	
		int n1, n2;

		// Generating random values Captain!

		n1 = rand.nextInt(10);

		n2 = rand.nextInt(10);

		System.out.println("How much is " + n1 + " times " + n2 + "?");

		return n1 * n2;
	}
	public static void quiz()
	{
		// Declaring Variables

		int answer, Input;
		answer = key();

		do
		{
			//Asking for guess

			System.out.println("Your answer: ");

			Input = sc.nextInt();

			//Checking if the answer is right

			if (Input == answer) 
			{
				ResponseRight();
			} 
		
			else 
			{
				ResponseWrong();
			}

		} while (Input != answer);
	       
	       System.out.println("Do you want to solve another new problem(Y/N)?");
	       // Scanning Y or N for question
	       char ch=sc.next().charAt(0);
	       // If they are not a quitter
	       if(ch=='Y' || ch=='y')
	           quiz();
	       
	       // Quitter
	       else
	           System.exit(0);
	}
	
	   public static void ResponseRight()
	   {
		   // Commander, We will begin to Initialize and Randomize the values!
	       int value = rand.nextInt(4)+1;
	       
	       switch (value)
	       {
	       // Output Displays for Positive cases
	           case 1:
	           System.out.println("Well done Padawan!");
	           break;
	           
	           case 2:
	           System.out.println("Excelent!");
	           break;
	           
	           case 3:
	           System.out.println("Nice Work!");
	           break;
	           
	           case 4:
	           System.out.println("Keep Up The Good Work");
	           break;
	       }
	   }

	   public static void ResponseWrong()
	   {

		   
	           int value = rand.nextInt(4)+1;
	           
	           switch (value)
	           {
	               case 1:
	               System.out.println("You have much to learn, Youngling.");
	               break;
	               
	               case 2:
	               System.out.println("Wrong.Try Once More.");
	               break;
	               
	               case 3:
	               System.out.println("Don't Give Up!");
	               break;
	               
	               case 4:
	               System.out.println("No Keep Trying.");
	               break;
	           }
	   }
}

