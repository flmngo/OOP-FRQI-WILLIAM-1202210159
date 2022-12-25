import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant rstrnt = new Restaurant();
        int IDcustomer, orderQty;

        try {
            System.out.println("Enter Customer ID: ");
            IDcustomer = input.nextInt();

                System.out.println("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(rstrnt);
                Waiters Waiters = new Waiters(IDcustomer, orderQty);
                Thread t2 = new Thread(Waiters);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}