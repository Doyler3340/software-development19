import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class SixthLoop{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int counter = 0;

    System.out.print("Please enter a loop counter value: ");
    counter = input.nextInt();

    System.out.println("Before Loop");
    while(counter < 5){
        System.out.println("Inside Loop - Counter = "+counter);
        counter++;
    }
    System.out.println("After Loop");
    //uncomment next line if input required
    input.close();
  }
}