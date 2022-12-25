public class Waiters implements Runnable {

    private final int orderQty;

    private final int customerID;

    static int hargaMakanan = 25000;

    public Waiters(int IDcustomer, int orderQty) {
        this.customerID = IDcustomer;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public void orderInfo() {
            System.out.println("====================ESD RESTAURANT====================");
            System.out.println("Customer ID     : " + this.customerID);
            System.out.println("Number of Food : " + this.orderQty);
            System.out.println("Total Price     : " + this.orderQty * hargaMakanan);
            System.out.println("======================================================");
    }
        public void getFood() {
            synchronized(Restaurant.getLock()) {

                System.out.println("Waiter: food is ready to deliver");
                System.out.println("");
                Restaurant resto = new Restaurant();
                resto.setWaitingForPickup(false);



                if (Restaurant.getfoodNumber() == this.orderQty + 1) {
                    orderInfo();
                    System.exit(0);
            }
                Restaurant.getLock().notifyAll();
                System.out.println("Waiter: Tell the chef of restaurant to make another food\n");

        }
    }
}
