//uncomment next line if input required
import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int a = 0;
    System.out.print("please enter a number: ");
    a = input.nextInt();

    if(a == 2 || a == 2){
        System.out.println("Number entered "+a+" is equal to 2 or 2");
    }else{
        System.out.println("Number entered "+a+" is not equal to 2 or 2");
    }

  
    //uncomment next line if input required
    input.close();
  }
}