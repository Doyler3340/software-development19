//uncomment next line if input required
import java.util.Scanner;

public class FirstCondition{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("please enter a number: ");
    number= input.nextInt();

    if(number==7){
        System.out.println("Number entered by user was equal to 7" );
    }
           
    //uncomment next line if input required
    input.close();
  }
}