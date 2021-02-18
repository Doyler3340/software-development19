/*
Program Name:  
Inputs Required: no     
Variables/Types: String a, String b
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
//import java.util.Scanner;

public class Swap{
  public static void main(String[] args){
    //uncomment next line if input required
    //Scanner input = new Scanner(System.in);

     String a = "Hello";
     String b = "World";
  
     System.out.println("strings before swap: a = "+" abd b = "+b);

     a = a + b;

     b = a.substring(0, a.length() - b.length());
     //system.out.println("b = "+b);
     a = a.substring(b.length());
     //system.out.println("a = "+a);
     
    //uncomment next line if input required
    //input.close();
  }
}