import java.util.Scanner;
public class WalaaPro3 {
    public static double getRadiusFromUser() {
        Scanner scanner = new Scanner(System.in);
        double userIN;
        System.out.println("Enter your R");
        do{
            userIN = scanner.nextDouble();
        }while(userIN<1);
        return userIN;

    }
    public static double calculations(Double R){
        double CircleArea= Math.PI*(Math.pow(R,2));
        return CircleArea;

    }
    public static void main(String []args){
       double radius= getRadiusFromUser();
       double area = calculations(radius);
        System.out.println(area);
    }

}




    
