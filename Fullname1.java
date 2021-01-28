import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class Fullname1{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String firstname, surname;

    System.out.print("Enter first name: ");
    firstname = input.next();
    System.out.print("Enter surname: ");
    surname = input.next();
    
    System.out.println(firstname.concat(" ").concat(surname));

    //uncomment next line if input required
    input.close();
  }
}