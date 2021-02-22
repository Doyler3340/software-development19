/*
Program Name: Sale
Inputs Required: yes
Variables/Types: double price, int quantity, double total
If/else statements: yes
Loops: no 
Loop how many times: not applicable
*/
//uncomment next line if input required
import java.util.Scanner;

public class Sale{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    double price = 0;
    int quantity = 0;
    double total = 0;
    //Add code here for Inputs, if/else statements, loops
    System.out.print("Enter unit price: ");
    price = input.nextDouble();
    System.out.print("Enter quantity sold: ");
    quantity = input.nextInt();

    total = quantity * price;

    if(quantity > 120){
        total = total * 0.05;
    }else if(quantity >=100){
        total = total * 0.09;
    }

    System.out.println("Sale revenue: "+total);
    //uncomment next line if input required
    input.close();
  }
}