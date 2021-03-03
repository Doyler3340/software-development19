/*
Program Name:  Calculator
Inputs Required: yes    
Variables/Types: int number, int flag
If/else statements: yes
Loops: yes
Loop how many times: unknown
*/

//uncomment next line if input required
import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int total = 0;
    int flag = 0;
    
    while(flag != -1){
        System.out.print("Enter a number (-1 to quit): ");
        flag = input.nextInt();
        if(flag != -1){
            total += flag;
        }
    }

    System.out.println("sum of numbers entered is: "+total);
    //uncomment next line if input required
    input.close();
  }
}