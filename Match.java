//uncomment next line if input required
import java.util.Scanner;

import javax.swing.Spring;

public class Match {
    public static void main(String[] args) {
        // uncomment next line if input required
        Scanner input = new Scanner(System.in);

        String a;
        String b;

    System.out.print("Enter first string: ");
    a = input.next();
    System.out.print("Enter second string: ");
    b = input.next();

    if(a.equals(b)){
        System.out.println("The two strings entered match");
    }else{
        System.out.println("The two strings entered do not match");
    }

    //uncomment next line if input required
    input.close();
  }
}