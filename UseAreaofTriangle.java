import java.util.Scanner;

public class UseAreaofTriangle {
    public void Calculate(Scanner sc){
        System.out.print("Enter Value of Base : ");
        double a1 = sc.nextInt();
        System.out.print("Enter Value of Height : ");
        double b1 = sc.nextInt();
        double res = (0.5 * (a1 * b1));
        System.out.println("Area Of Triangle : " + res);
        System.out.println("");
    }
}
