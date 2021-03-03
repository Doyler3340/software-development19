/*
Program Name:  LoopCount
Inputs Required: yes  
Variables/Types: int counter, int flag
If/else statements: yes
Loops: yes 
Loop how many times: unknown
*/

//uncomment next line if input required
import java.util.Scanner;

public class LoopCount{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int counter = 0;
    int flag = 0;
    
    System.out.print("Want to loop: (0 for yes, 1 for no): ");
    flag = input.nextInt();

    while(flag == 0){
        System.out.print("Want to loop: (0 for yes, 1 for no): ");
        flag = input.nextInt();
        counter++;
    }

    System.out.println("You looped: "+counter+" times.");
    //uncomment next line if input required
    input.close();
  }
}