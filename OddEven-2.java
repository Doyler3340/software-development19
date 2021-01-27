import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class OddEven{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int x = 0;
    int y = 0;

    System.out.print("Please enter a number: ");
    x = input.nextInt();
    y = x;

    //x = x % 2;
    x %= 2;
    if(x == 0){
        System.out.println(y+" is an even number. ");
    }else{
        System.out.println(y+" is an odd number. ");
    }

    //uncomment next line if input required
    input.close();
  }
}