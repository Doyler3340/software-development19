/*
Program Name:  Exercise10
Inputs Required: yes    
Variables/Types: int num1,int num2, int num3, int num4, int num5, int num6, int num7, int num8, int result
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Exercise10{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int num7 = 0;
    int num8 = 0;
    int result = 0;

    System.out.print("Enter number 1: ");
    num1 = input.nextInt();
    System.out.print("Enter number 2: ");
    num2 = input.nextInt();
    System.out.print("Enter number 3: ");
    num3 = input.nextInt();
    System.out.print("Enter number 4: ");
    num4 = input.nextInt();
    System.out.print("Enter number 5: ");
    num5 = input.nextInt();
    System.out.print("Enter number 6: ");
    num6 = input.nextInt();
    System.out.print("Enter number 7: ");
    num7 = input.nextInt();
    System.out.print("Enter number 8: ");
    num8 = input.nextInt();

    result = num1 * num8;

    System.out.println(num1 + " * " + num8 + " * " + result);


    //uncomment next line if input required
    input.close();
  }
}