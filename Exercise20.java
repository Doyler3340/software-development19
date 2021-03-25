/*
Program Name:  Exercise20
Inputs Required: yes    
Variables/Types: int number
If/else statements: yes
Loops: no 
Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Exercise20{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int number = 0;
    System.out.print("Enter a number");
    number = input.nextInt();
    
    if(number >= 10 && number <= 20){
        number = number + 10;
    }else if(number >= 30 && number <= 40){
        number = number + 30;
    }else if(number >= 50 && number <= 60){
        number = number + 50;
    }else{
        number = number + 100;
    }

    System.out.println("input number updated to: "+number);
    //uncomment next line if input required
    input.close();
  }
}