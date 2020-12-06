//uncomment next line if input required
import java.util.Scanner;

public class NumberRange{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int a = 0;
    System.out.print("please enter a number: ");
    a = input.nextInt();

    if(a >= 10 && a <= 20){
        System.out.println("Number entered "+a+" is within the range of 10 to 20");
    }else{
        System.out.println("Number entered "+a+" is not within the range of 10 to 20");
    }

    //uncomment next line if input required
    input.close();
  }
}
    
