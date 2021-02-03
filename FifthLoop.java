import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class FifthLoop{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    
    int x = 1;
    int y = 0;
    System.out.print("Enter a counter value: ");
    y = input.nextInt();
    
    while(x <= y){
        System.out.println("Loop counter: "+x);
        x++;
    }
  
    //uncomment next line if input required
    input.close();
  }
}