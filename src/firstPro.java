import javax.swing.text.Style;
import java.util.Scanner;
public class firstPro {
    public static void main(String[]args){
        // write a program will read the user input and check if his password more
        // than 8 character and if at least has two digits
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pass");
        String userIN = scanner.next();
        operation(userIN);
    }
    public static void operation(String x){
        if(x.length()>8){
            int count=0;
            for(int i=0; i<x.length();i++){
                char mdry = x.charAt(i);
                if(digit(mdry)) {
                    count++;
                }else if (!letter(mdry)) {
                        System.out.println("Your Pass must contain digits or letter");
                        return;
                    }
                }
            if(count>1){
                System.out.println("Valid");


            }else {
                System.out.println("Your pass must contain 2 digits");
            }


            }else {
            System.out.println("Your pass must be more than 8 character");

        }
    }
    public static boolean digit(char d){
        return d>='0' && d<='9';
    }
    public static boolean letter(char y){
        return (y>='a' && y<='z')|| (y>='A' && y<='Z');
    }

}
