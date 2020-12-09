//uncomment next line if input required
import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String name = "";
    int age = 0;

    System.out.print("Enter your first name: ");
    name = input.next();
    System.out.print("Enter your age: ");
    age = input.nextInt();

    System.out.println(name+" you are "+age+" years old. In 20 years time, you will be "+(age+20)+" years old.");
  
    //uncomment next line if input required
    input.close();
  }
}
    
