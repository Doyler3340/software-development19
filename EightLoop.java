//uncomment next line if input required
import java.util.Scanner;

public class EightLoop{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int value = 0;
    int counter = 1;

    System.out.print("Please enter Number: ");
    value = input.nextInt();

    while(counter <= 5){
        System.out.println(value+" times "+counter+" = "+(value * counter));
        counter++;
    }

    //uncomment next line if input required
    input.close();
  }
}