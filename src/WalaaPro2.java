import java.util.Scanner;
public class WalaaPro2 {
    public static void main(String[]a){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count=2;
          while(x>=count) {
               if(x%count==0){
                   System.out.println("not a prime");
                   break;
               }else{
                   System.out.println("Your number is prime");
                   break;
               }
          }
          if(x<2){
              System.out.println("Please enter a number bigger then 2");
          }
    }
}
