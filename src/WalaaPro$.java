import java.util.Scanner;

public class WalaaPro$ {
    public static void main(String[]a){
        Scanner scanner = new Scanner(System.in);
        int x ;
        int count=0;
        for(int i = 0; i<10; i++) {
            x = scanner.nextInt();
            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println();


    }
}
