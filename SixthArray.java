/*
Program Name:  SixthArray
Inputs Required: yes   
Variables/Types: int[] x, int number, int index
If/else statements: yes
Loops: yes
Loop how many times: depends on array length
*/

//uncomment next line if input required
import java.util.Scanner;

public class SixthArray{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int[] x = {100,200,300,400,500,600};
    int number = 0;
    int index = 0;

    System.out.print("Enter a number to search for: ");
    number = input.nextInt();

    for(int i = 0; i < x.length; i++){
        if(x[i] == number){
            index = i;
        }
    }

    System.out.println();

    if(index > -1){
        System.out.println(x[index] + " is contained in the array at index: " + index);
    }else{
        System.out.println("Number not found");
    }
    //uncomment next line if input required
    input.close();
  }
}