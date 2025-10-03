import java.util.Scanner;

public class UseOfAreaRectangle {
    
    public void Calculate(Scanner sc){
        int l,b,Area;
        System.out.print("Enter Length Of Reectangle : ");
        l = sc.nextInt();
        System.out.print("Enter Breadth Of Rectangle : ");
        b = sc.nextInt();
        Area = l * b;
        System.out.println("Area Of Rectangle = " + Area);
        System.out.println("");
    }
}

