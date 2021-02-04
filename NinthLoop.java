//uncomment next line if input required
import java.util.Scanner;

public class NinthLoop{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int total = 0;
    int counter = 1;

    while(counter <= 5){
        System.out.print("Enter a grade for student"+counter+": ");
        total = total + input.nextInt();
        counter++;
    }

    System.out.println("Total of all 5 grades is: "+total);
    System.out.println("Average goal is: "+(total / 5.0));

    //uncomment next line if input required
    input.close();
  }
}