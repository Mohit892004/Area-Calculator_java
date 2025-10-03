import java.util.Scanner;

public class Menu_Area2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("-------------------------");
        System.out.println("|    Area Calculator    |");
        System.out.println("-------------------------");
        System.out.println("| 1. Rectangle          |");
        System.out.println("| 2. Triangle           |");
        System.out.println("| 3. Circle             |");
        System.out.println("| 4. Square             |");
        System.out.println("| 5. Exit               |");
        System.out.println("-------------------------");
        System.out.print("Enter Your Choice Between 1 to 5.: ");
        int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    UseOfAreaRectangle obj = new UseOfAreaRectangle();
                        obj.Calculate(sc);
                    break;
                case 2:
                    UseAreaofTriangle obj1 = new UseAreaofTriangle();
                        obj1.Calculate(sc);
                    break;
                case 3:
                    UseAreaofCircle obj2 = new UseAreaofCircle();
                        obj2.Calculate(sc);
                    break;
                case 4:
                    UseAreaofSquare obj3 = new UseAreaofSquare();
                        obj3.Calculate(sc);
                    break;
                case 5:
                    System.out.println("Thank's For Using This Programe.");
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Number.");
                    System.out.println("Enter Number Between 1 to 5 Only.");
                    break;
            }
        }
    }
}
