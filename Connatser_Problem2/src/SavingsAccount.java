public class SavingsAccount{
public static double annualInterestRate = 0.0;
  
private double savingsBalance;
  
// Constructor
public SavingsAccount(double amt){
this.savingsBalance = amt;  
}
  
// calculate the monthly interest
public void calculateMonthlyInterest(){
double interest;
interest = (this.savingsBalance * (annualInterestRate/100))/12;
this.savingsBalance += interest;
}
  
//  display the balance
public void showBalance(){
System.out.printf("$%.2f", this.savingsBalance);
}
  
// to set the static variable
public static void changeInterestRate(double newRate){
annualInterestRate = newRate;
}


public static void main(String[] args){
SavingsAccount s1 = new SavingsAccount(2000.0); // initializing first instance
SavingsAccount s2 = new SavingsAccount(3000.0); // initializing second instance
SavingsAccount.changeInterestRate(4.0); // setting interest rate to 4.0%
System.out.println("Month \t\t Saver1 \t Saver2");
  
// Display the data of two instances for 12 months
for(int i=1; i<=12; ++i){
s1.calculateMonthlyInterest();
s2.calculateMonthlyInterest();
System.out.print("Month " + i + ": \t");
s1.showBalance();
System.out.print("\t");
s2.showBalance();
System.out.println();
}
System.out.println();
  
System.out.println("Setting the Interest Rate to 5.0%");
System.out.println();
SavingsAccount.changeInterestRate(5.0); // Changing the interest rate to 5.0%
  
// Calculating new Savings Balance
s1.calculateMonthlyInterest();
s2.calculateMonthlyInterest();
  
// Displaying final data
System.out.print("Month 13: \t");
s1.showBalance();
System.out.print("\t");
s2.showBalance();
System.out.println();
}
}