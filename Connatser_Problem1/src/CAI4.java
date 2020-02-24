import java.util.Scanner;
import java.security.SecureRandom;

public class CAI4 
{
	static Scanner sc = new Scanner(System.in);
	static SecureRandom rand = new SecureRandom();
	   public static void main(String[] args)
	   {
		   quiz();
	   }

	   public static void quiz() 
	   {
		   // Randomizing and Initializing Variables!!!!!!!!!!!! 
	       int counter=1;
	       
	       int correct=0;
	       
	       int difficulty = scanDifficulty(sc);

	       while (counter<=10)
	       {
	           int num1 = difficultyMultiplier(rand, difficulty);
	           
	           int num2 = difficultyMultiplier(rand, difficulty);
	           
	           int val1 = askQuestion(num1, num2);
	           
	           int val2 = readResponse();
	           
	           // Displaying a Positive response, incrementing the wrong counter
	           if (val1 == val2)
	           {
	        	   ResponseRight();
	               correct++;
	           }
	           
	           // Displaying a Negative response, incrementing the wrong counter
	           else
	           {
	               ResponseWrong();
	           }

	           counter++;
	       }
	     // Call completionMessage with the percent of correct answers 
	       
	       CompletionMessage(correct);
	       
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

	   private static int readResponse() 
	   {
	       int val = sc.nextInt();
	       return val;
	   }

	   public static int askQuestion(int n1, int n2) 
	   {
	       System.out.println("How much is " + n1 + " times " + n2);
	       return n1 * n2;
	   }

	   private static void ResponseRight()
	   {
		   // Commander, We will begin to Initialize and randomize the values!
		   SecureRandom rand = new SecureRandom();
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

	   private static void ResponseWrong()
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
	   private static void CompletionMessage(int correct)
	   {
		   // Calculating the ratio of correct answers, 
	       float ratio=(float)correct/10*100;
	       
	       System.out.println("Your Score is "+ratio+"%");
	       
	       if(ratio>=75)
	           System.out.println("Congratulations, you are ready to go to the next level!");
	       
	       else
	           System.out.println("Please ask your teacher for extra help.");
	   }
	   
	   private static int difficultyMultiplier(SecureRandom rand, int difficulty)
	   {
	       int argument = 0;
	      
	       if (difficulty == 1)
	           argument = rand.nextInt(10);
	       else if (difficulty == 2)
	           argument = rand.nextInt(100);
	       else if (difficulty == 3)
	           argument = rand.nextInt(1000);
	       else
	           argument = rand.nextInt(10000);
	      
	       return argument;
	   }
	   private static int scanDifficulty(Scanner sc) {
	       System.out.print("Enter difficulty level(1-4): ");
	       return sc.nextInt();
	       }
}