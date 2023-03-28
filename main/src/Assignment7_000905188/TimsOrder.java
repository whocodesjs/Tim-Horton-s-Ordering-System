package Assignment7_000905188;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * This class represents a Tim Horton's order. It contains methods to create a new order, add items to the order, and get the total amount due.
 * @author Jovain Chisholm
 */

public class TimsOrder {
    private String name;
    private ArrayList<TimsProduct> items;

    public TimsOrder(String name) {
        this.name = name;
        items = new ArrayList<TimsProduct>();
    }

    public static TimsOrder create() {
        String name = JOptionPane.showInputDialog("Enter the name for your order:");
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of items you would like to order:"));
        TimsOrder order = new TimsOrder(name);

        for (int i = 0; i < size; i++) {
            String type = JOptionPane.showInputDialog("Enter the type of item you would like to order (donut, coffee, tumbler or mug):");
            TimsProduct item = null;
            switch (type) {
                case "donut":
                    item = Donut.create();
                    break;
                case "coffee":
                    item = Coffee.create();
                    break;
                case "tumbler":
                    item = Tumbler.create();
                    break;
                case "mug":
                    item = Mug.create();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid item type", "Order cancelled", JOptionPane.ERROR_MESSAGE);
                    return null;
            }
            if (item != null) {
                order.addItem(item);
            }
        }

        return order;
    }

    public void addItem(TimsProduct item) {
        items.add(item);
    }

    public double getAmountDue() {
        return items.stream().mapToDouble(TimsProduct::getRetailPrice).sum();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Order for " + name + " (" + items.size() + " items)\n\n");
        items.forEach(item -> str.append(item).append("\n"));
        str.append("\nTotal: $" + String.format("%.2f", getAmountDue()));
        return str.toString();
    }
}
