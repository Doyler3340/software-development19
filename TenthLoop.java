public class TenthLoop{
  public static void main(String[] args){
    int i = 0;
    System.out.println("Number\tSquare\tCube");
    while(i<=10){
        System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
        i++;
    }
  }
}