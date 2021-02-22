/*
Program Name: Change  
Inputs Required: yes  
Variables/Types: int fifty, int twenty, int five, int ten, double euro
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Change{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int fifty = 0;
    int twenty = 0;
    int five = 0;
    int ten = 0;
    double euro = 0;
    //Add code here for Inputs, if/else statements, loops
    System.out.print("Enter the number of 50 cent coins: ");
    fifty = input.nextInt();
    System.out.print("Enter the number of 20 cent coins: ");
    twenty = input.nextInt();
    System.out.print("Enter the number of 10 cent coins: ");
    ten = input.nextInt();
    System.out.print("Enter the number of 5 cent coins: ");
    five = input.nextInt();

    euro = (fifty * 0.5) + (twenty * 0.2) + (ten * 0.1) + (five * 0.05);

    System.out.println("Total amount in euro is: "+euro);
    
    //uncomment next line if input required
    //input.close();
  }
}