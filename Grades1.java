/*
Program Name:  Grades1
Inputs Required: yes     
Variables/Types: int counter,int total, int grade
If/else statements: no
Loops: yes
Loop how many times: 10
*/

//uncomment next line if input required
import java.util.Scanner;

public class Grades1{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int counter = 1;
    int total = 0;
    int grade = 0;

    while(counter <= 10){
        System.out.print("Enter grade"+counter+": ");
        grade = input.nextInt();
        total += grade;
        counter++;
    }

    System.out.println("Average grade is: "+(total/10.0));

    
    //uncomment next line if input required
    input.close();
  }
}