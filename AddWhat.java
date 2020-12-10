//uncomment next line if input required
import java.util.Scanner;

public class AddWhat{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("Enter a number: ");
    number = input.nextInt();

    System.out.println();

    if(number > 100){
        System.out.println(number+" + 10 = "+(number + 10));

    }else if(number >= 50){

        System.out.println(number+" + 20 = "+(number + 20));

    }else{

        System.out.println(number+" + 30 = "+(number + 30));

    }

    System.out.println();

    //uncomment next line if input required
    input.close();
  }
}