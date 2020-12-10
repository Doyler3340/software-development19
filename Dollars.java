//uncomment next line if input required
import java.util.Scanner;

public class Dollars{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    double dollars = 0;
    double euro = 0;
    double amount;
    System.out.print("enter current euro to US Dollar exchange rate ");
    dollars = input.nextDouble();
    System.out.print("Enter amount of euro to convert to US Dollars: ");
    euro = input.nextDouble();

    amount= euro * dollars;

    System.out.println();
    System.out.println(euro+" euro will get you: "+amount+"US Dollars.");
  
    //uncomment next line if input required
    input.close();
  }
}