/*
Program Name:  
Inputs Required: yes  
Variables/Types: String name, String UpperCaseName
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Upper{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String name;
    String upperCaseName;

    System.out.print("Please enter your name: ");
    name = input.next();

    upperCaseName = name.toUpperCase();

    System.out.println("Hello " + upperCaseName + " , nice to meet you!");

  
    //uncomment next line if input required
    input.close();
  }
}