import java.util.Scanner;

//uncomment next line if input required
//import java.util.Scanner;

public class Fullname2{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    String firstName, middleName, surname;

    System.out.print("Enter first name: ");
    firstName = input.next();
    input.nextLine();
    System.out.print("Enter middle name: ");
    middleName = input.next();
    System.out.print("Enter surname: ");
    surname = input.next();
    if(middleName.isEmpty()){
        System.out.println(firstName.concat(" ").concat(surname));
    }else{
        System.out.println(firstName.concat(" ").concat(middleName).concat(" ").concat(surname));
    }

    //uncomment next line if input required
    input.close();
  }
}