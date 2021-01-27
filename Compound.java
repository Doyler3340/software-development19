import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class Compound{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int x = 0;

    System.out.print("Please enter a number: ");
    x = input.nextInt();

    //x = x + 2;
    x += 2;
    System.out.println("x after adding 2 using compound assignment is: "+x);

    //x = x - 5;
    x -= 5;
    System.out.println("x after subtracting 5using compound assignment is: "+x);

    //uncomment next line if input required
    input.close();
  }
}