/*
Program Name:  Jane
Inputs Required: no     
Variables/Types: String name, int age, String subject, String college, String job
If/else statements: no 
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
//import java.util.Scanner;

public class Jane{
  public static void main(String[] args){
    String name = "Jane";
    int age = 20;
    String subject = "English";
    String college = "NUIG";
    String job = "Journalist";

    System.out.println(name + " is " + age +" years old and is studying " + subject + " in " + college + " . ");
    System.out.println("Some day she hopes to be a "+job+".");
    
    //uncomment next line if input required
    //input.close();
  }
}