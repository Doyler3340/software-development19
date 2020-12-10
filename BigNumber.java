//uncomment next line if input required
import java.util.Scanner;

public class BigNumber{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("Enter a number: ");
    number = input.nextInt();
    if(number > 1_000_000){
        System.out.println("Number entered by you,"+number+", is equal to 0");
    }else{
        System.out.println("Number entered by you,"+number+", is not equal to 0");
    }
    System.out.println();
    //uncomment next line if input required
    input.close();
  }
}