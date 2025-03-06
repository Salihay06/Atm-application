import java.text.BreakIterator;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;
public class Project2 {

    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
int balance=0,input,amount;
System.out.println("Hello, welcome to our bank.");
System.out.println("Please enter your balance:");
balance=scan.nextInt();
while(balance>0){ 
System.out.println("Please select the action you want to perform");
System.out.println("1- Deposit money");
System.out.println("2- Withdraw money");
System.out.println("3- Balance inquiry");
System.out.println("4- Check out");
input=scan.nextInt();
 
 if(input==1){
    System.out.println("Entered the amount you want to deposit");
    amount=scan.nextInt();
    balance=balance+amount;
    System.out.println("The transaction was completed successfully. Your current balance: "+balance+"$");
 }else if(input==2){
    System.out.println("Entered the balance you want to withdraw");
    amount=scan.nextInt();
    if(amount>balance){
        System.out.println("İnsufficient funds");
    } else {
        balance=balance-amount;
    }
    System.out.println("The transaction was completed successfully. Your current balance :"+balance+"$");
}else if(input==3){
    System.out.println("Your current balance :"+balance+"$");
}else if(input==4){
    System.out.println("Exit is in progress");
    break;
}else{
    System.out.println("You have entered an invalid transaction");
}
 }
}
}