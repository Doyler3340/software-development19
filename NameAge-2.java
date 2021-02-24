/*
Program Name:  NameAge
Inputs Required: yes  
Variables/Types: String Name, Int Age
If/else statements: no 
Loops: yes
Loop how many times: age
*/

//uncomment next line if input required
import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String name = "";
    int age = 0;
    int counter = 0;

    System.out.println("Enter your name ");
    name = input.nextLine();
    System.out.println("Enter your age ");
    age = input.nextInt();

    while(counter <= age){
        System.out.println(counter + ". "+name);
        counter++;
    }
    //uncomment next line if input required
    input.close();
  }
}
    
