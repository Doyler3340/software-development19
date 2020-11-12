//uncomment next line if input required
import java.util.Scanner;

public class AddProduct{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int x = 0;
    int y = 0;
    int z = 0;

    System.out.print("Enter first number: ");
    x = input.nextInt();
    System.out.print("Enter second number: ");
    y = input.nextInt();
    System.out.print("Enter third number: ");
    z = input.nextInt();

    result = x * y * z;
    System.out.println(x + " * " + y + " * " + z + " = " + result);
    
    result = x + y + z;
    System.out.println("\n"+x + " + " + y + " + " + z + " = " + result);


   //uncomment next line if input required
    input.close();
  }
}