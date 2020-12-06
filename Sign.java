//uncomment next line if input required
import java.util.Scanner;

public class Sign{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("please enter a number: ");
    number = input.nextInt();

    if(number > 0){
        System.out.println("Number entered "+number+" is a positive number");
    }else if (number < 0){
        System.out.println("Number entered "+number+" is a negative number");
    }else{
        System.out.print("Number entered is zero");
    }

    if(number > 0){
        System.out.println("Number entered "+number+" is a positive number");
    }else{
        if (number < 0){
        System.out.println("Number entered "+number+" is a negative number");
        }else{
        System.out.print("Number entered is zero");
        }
    }
       
  
    //uncomment next line if input required
    input.close();
  }
}