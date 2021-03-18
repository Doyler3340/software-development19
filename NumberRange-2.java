//uncomment next line if input required
import java.util.Scanner;

public class NumberRange{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int x = 0;
    
    System.out.print("Enter a number: ");
    x = input.nextInt();

    if(x > 10 && x < 20){
        System.out.println("Number entered is between 10 to 20");
    }else{
        System.out.println("Number entered is Not between 10 to 20");
    }

    //uncomment next line if input required
    input.close();
  }
}
    
