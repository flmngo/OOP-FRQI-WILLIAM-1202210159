import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Calculation calculation = new Calculation();

         boolean repeat = false;

            Thread Thread1 = new Thread(calculation);

                Scanner ScannerNew = new Scanner(System.in);

        
        do {
            System.out.println("=== menu program ===");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("Select Menu: ");

            int opr = ScannerNew.nextInt();
            try {
                switch (opr) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");
                        calculation.sisi = ScannerNew.nextDouble();
                        calculation.setSquare();
                        Thread1.start();
                        Thread1.join();
                        System.out.println("=====");
                        System.out.println("The calc result: " + calculation.getSquare());
                        break;

                    case 2:
                        System.out.println("enter the radius of the circle: ");
                        calculation.radius = ScannerNew.nextDouble();
                        calculation.setCircle();
                        Thread1.start();
                        Thread1.join();
                        System.out.println("=====");
                        System.out.println("the calc result is: " + calculation.getCircle());
                        break;
                    
                    case 3:
                        System.out.println("insert the side of the base of the trapezoid: ");
                        double a = ScannerNew.nextDouble();
                        System.out.println("enter the upper side of the trapezoid: ");
                        double b = ScannerNew.nextDouble();
                        System.out.println("enter height: ");
                        double c = ScannerNew.nextDouble();
                        calculation.setTrapezoid(a, b, c);
                        Thread1.start();
                        Thread1.join();
                    
                        System.out.println("=====");
                        System.out.println("the calculation result: " + calculation.getTrapezoid());
                        break;
                        
                    default:
                        System.out.println("====erorr: option not available====");
                        break;
                  }
                } catch (InputMismatchException a) {
                    System.out.println("erorr:: input must be number");

                    } catch (IllegalArgumentException e) {
                        System.out.println("java.lang.IllegalArgumentException");
                    }

            } while (repeat);
            ScannerNew.close();
        
    }
}