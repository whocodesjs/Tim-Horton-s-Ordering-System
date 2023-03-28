package Assignment7_000905188;
import  javax.swing.JOptionPane;

/**
 * This class is for testing the TimsOrder class. It contains a main method that creates a new order and displays the order summary and amount due.
 * @author Jovain Chisholm
 */



public class TimHortons {

    /**
     * Creates a new order and displays the order summary and amount due.
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        TimsOrder order = TimsOrder.create();
        if (order != null) {
            JOptionPane.showMessageDialog(null, order.toString(), "Order summary", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Amount due: $" + String.format("%.2f", order.getAmountDue()), "Order summary", JOptionPane.INFORMATION_MESSAGE);
    }
}
}

/** Feel free to comment out the above code and use the following code to test your code in the console:
 *
 */

//public class TimHortons {
//    public static void main(String[] args) {
//        TimsOrder t = TimsOrder.create();
//        System.out.println(t);
//        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
//    }
//}
