import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //adding a couple of customers, add a couple of deposits and withdrawals.
        //Add some customer object
        Customer MM = new Customer("Michael Myers", 0001, 237, 53);
        Customer NN = new Customer("Noni Nicegood", 0002, 78, 39);

        //add deposits to customers in both savings and checking accounts
        MM.deposit(5, new Date(), Customer.SAVING);
        NN.deposit(23,new Date(), Customer.CHECKING);

        MM.withdraw(1, new Date(), Customer.SAVING);
        NN.withdraw(2,new Date(), Customer.CHECKING);

        //print results
        System.out.println(MM);
        MM.displayDeposits();
        MM.displayWithdraws();

        System.out.println(NN);
        NN.displayDeposits();
        NN.displayWithdraws();
    }
}
