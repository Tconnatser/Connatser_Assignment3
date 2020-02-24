import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 
{
	static Scanner sc = new Scanner(System.in);
	static SecureRandom rand = new SecureRandom();
	   public static void main(String[] args)
	   {
		   quiz();
	   }
	   
	   
	   public static void quiz()
	   {
		   SecureRandom rand = new SecureRandom();

		   int correct = 0;// Correct Counter
		   int counter = 0;
		   int difficulty = readDifficulty(sc);
		   System.out.println();
		   int operation = pickOperation(rand,sc);
		   while (counter<10) {

		   int n1 = generateQuestionArgument(rand, difficulty);
		   int n2 = generateQuestionArgument(rand, difficulty);

		   int correctAns = generateCorrectAnswer(operation,n1,n2);

		   askQuestion(n1, n2, counter,operation);

		   int response = readResponse(sc);

		   if (response == correctAns)
		   {
		   ResponseRight();
		   correct++;
		   } else
		   ResponseWrong();
		   }
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

		   //generating random number according to given difficulty
		   private static int generateQuestionArgument(SecureRandom rand, int difficulty) {
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

		   //reading difficulty from user
		   private static int readDifficulty(Scanner sc) {
		   System.out.print("Enter difficulty level(1-4): ");
		   return sc.nextInt();
		   }

		   //calculating ratio of correct answers,
		   private static void CompletionMessage(int correct) {
		   double percent = ((double) correct / 10.0) * 100.0;
		   System.out.println("\nYou Scored: " + percent + "%");
		   if (percent < 75)
		   System.out.println("Please ask your teacher for extra help.");
		   else
		   System.out.println("Congratulations, you are ready to go to next level!");
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

		   public static void ResponseRight()
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
		   
		   private static int readResponse(Scanner sc) {
		   System.out.print("Ans. ");
		   int response = sc.nextInt();
		   return response;
		   }

		   public static void askQuestion(int n1, int n2,int counter,int operation)
		   {
			   switch(operation)
			   {
		   		case 1:
		   			System.out.println("Q[" + counter + "] how much is " + n2 + " added to " + n1 + "?");
		   			break;
		   		case 2:
		   			System.out.println("Q[" + counter + "] how much is " + n1 + " multiplied by " + n2 + "?");
		   			break;
		   		case 3:
		   			System.out.println("Q[" + counter + "] how much is " + n2 + " subtracted from " + n1 + "?");
		   			break;
		   		case 4:
		   			System.out.println("Q[" + counter + "] how many times does " + n2 + " divide " + n1 + "?");
		   			break;
		   		}
		   }

		   //reading operation type
		   private static int pickOperation(SecureRandom rand, Scanner sc)
		   {
			   int operation;
			   System.out.println("Enter Type of questions you want. 1 for Addition, 2 for Multiplication, 3 for Subtraction, 4 for Division, 5 for Random questions: ");
			   operation =  sc.nextInt();
			   // random choice if user selects 5
			   if(operation == 5)
				   operation = rand.nextInt(4)+1;
		     
		   return operation;
		   }

		   //method to generate Correct answer based on the option/operation selected by user
		   private static int generateCorrectAnswer(int operation, int n1, int n2){

		   switch(operation)
		   {
		   case 1:
		   return n1 + n2;
		   case 2:
		   return n1 * n2;
		   case 3:
		   return n1 -n2;
		   case 4:
		   return n1/n2;
		   }
		   return 0;
		   }
		   }
