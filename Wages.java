//uncomment next line if input required
import java.util.Scanner;

public class Wages{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    double hours = 0;
    double rate = 0;
    double pay = 0;

    int counter = 1;
    while(counter <= 3){
        System.out.print("enter hours worked: ");
        hours = input.nextDouble();
        System.out.print("enter hours rate: ");
        rate = input.nextDouble();

        if(hours > 40){
            pay = (40.0 * rate ) + ((hours - 40) * (rate * 1.5));
        }else{
            pay = hours * rate;
        }

        pay = hours * rate;
        System.out.println("pay for employee "+counter+" is: "+pay);
        System.out.println();
        counter++;
}

    //uncomment next line if input required
    input.close();
  }
}