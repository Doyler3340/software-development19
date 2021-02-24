/*
Program Name: odd
Inputs Required: no     
Variables/Types: Int i, 
If/else statements: yes/no 
Loops: yes/no 
Loop how many times: fixed / unknown / not applicable
*/

//uncomment next line if input required
//import java.util.Scanner;

public class odd{
  public static void main(String[] args){
    int total = 0;
    for(int i = 1; i <= 15; i++){
        if(i%2 == 1){
            total = total + i;
        }
    }
        System.out.println("Total: "+total);

        System.out.println();
        total = 0;
        for(int i = 1; i <= 15; i = i + 2){
            total = total + i;
        }
        System.out.println("Total: "+total);
  }
}