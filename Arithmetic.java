/*
Program Name:  Arithmetic
Inputs Required: yes 
Variables/Types: int x, int y
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Arithmetic{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int x = 0;
    int y = 0;

    System.out.print("Enter first number: ");
    x = input.nextInt();
    System.out.print("Enter second number: ");
    y = input.nextInt();

    System.out.println(x + " + " + y + " = " + (x + y));
    System.out.println(x + " * " + y + " = " + (x * y));
    System.out.println(x + " - " + y + " = " + (x - y));

    //uncomment next line if input required
    input.close();
  }
}