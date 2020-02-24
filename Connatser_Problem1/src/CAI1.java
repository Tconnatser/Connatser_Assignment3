import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1
{
	static SecureRandom rand = new SecureRandom();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

			quiz();
		
	}
		//method to generate question

	public static int Key() 
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

		int correct, Input;

		// Input Scanner
		
		correct = Key();
		
		do 
		{

			//Asking for guess
			
			Input = sc.nextInt();

			//Checking if the answer is right

			if (Input == correct) 
			{
				ResponseRight();
			} 
		
			else 
			{
					
				ResponseWrong();
					
			}
		} while (Input != correct);
		
	       
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
	
	// Print Statement for Correct Answers
	public static void ResponseRight()
	{
		System.out.println("Correct! Well done, young Padawan!");
	}
	// Print Statement for wrong answers
	public static void ResponseWrong()
	{
		System.out.println("You have much to learn, youngling");
	}
}