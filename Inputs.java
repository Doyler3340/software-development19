/*
Program Name: Inputs  
Inputs Required: yes    
Variables/Types: String name, int number, double decNumber
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/
//uncomment next line if input required
import java.util.Scanner;

public class Inputs{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String name;
    int number;
    double decNumber;

    System.out.print("Enter your name: ");
    name = input.next();
    System.out.print("Enter a whole number: ");
    number = input.nextInt();
    System.out.print("Enter a decimal number: ");
    decNumber = input.nextDouble();

    System.out.println(name + ", you entered the numbers "+ number + " and " + decNumber);

    input.close();
  }
}