/*
Program Name:  ReverseString
Inputs Required: yes    
Variables/Types: String value String reverseValue
If/else statements: no 
Loops: yes
Loop how many times: depends on the length of string input by the user
*/

//uncomment next line if input required
import java.util.Scanner;

public class ReverseString{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String value;
    String reverseValue = "";

    System.out.print("please enter a string value: ");
    value = input.next();


    int counter = value.length() -1;
    while(counter >= 0){
        reverseValue += value.charAt(counter);
        counter = counter - 1;
    }

    System.out.println("Input string reversed is: "+reverseValue);
    //uncomment next line if input required
    input.close();
  }
}