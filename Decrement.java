//uncomment next line if input required
//import java.util.Scanner;

public class Decrement{
  public static void main(String[] args){
    //uncomment next line if input required
    //Scanner input = new Scanner(System.in);

    int number = 10;
    System.out.println("Number before post decrement: "+number);
    System.out.println("post decrement number: "+(number--));
    System.out.println("Number after post decrement: "+number);

    number = 10; // revert value assigned to number to 10
    System.out.println(); // skip a line

     System.out.println("Number before pre decrement: "+number);
     System.out.println("Pre decrement number: "+(--number));
     System.out.println("Number after pre decrement: "+number);

  
    //uncomment next line if input required
    //input.close();
  }
}