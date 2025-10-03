import java.util.Scanner;

public class UseAreaofCircle {
    public void Calculate(Scanner sc){
        System.out.print("Enter Value of Radius : ");
        int a = sc.nextInt();
        System.out.println("Area Of Circle : " + (3.14 * (a * a)));
        System.out.println("");
   }
}