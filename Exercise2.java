//uncomment next line if input required
import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    System.out.print("Enter first number ");
    num1 = input.nextInt();
    System.out.print("Enter second number ");
    num2 = input.nextInt();
    System.out.print("Enter third number ");
    num3 = input.nextInt();

    System.out.println();
    System.out.println(num1+" + "+num2+" + "+num3+" = "+(num1 + num2 + num3));
    System.out.println(num1+" * "+num2+" * "+num3+" ="+(num1 * num2 * num3));

  
    //uncomment next line if input required
    input.close();
  }
}