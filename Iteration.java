//uncomment next line if input required
import java.util.Scanner;

public class Iteration{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1 = 0;
    int counter = 1;
    while(counter <= 3){
        System.out.print("Enter a number: ");
		num1 += input. nextInt();
        counter++;
    }

    System.out.println("Result of adding numbers together is: "+(num1));

    input.close();
  }
}