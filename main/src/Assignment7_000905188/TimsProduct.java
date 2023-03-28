package Assignment7_000905188;
import javax.swing.*;
import java.awt.Color;

/**
 * TimsProduct is an abstract class that implements the Commodity interface.
 * It has a name, cost, and price. It also has a static factory method that
 * creates a new TimsProduct object.
 * @author Jovain Chisholm
 */




public abstract class TimsProduct implements Commodity{
    /** The name of the product */
    private String name;
    /** The cost of the product */
    private double cost;
    /** The price of the product */
    private double price;

    /**
     * Creates a new TimsProduct object with the given name, cost, and price.
     * @param name The name of the product
     * @param cost The cost of the product
     * @param price The price of the product
     */

    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Creates a new TimsProduct object with the given name, cost, and price.
     * @param name The name of the product
     * @param cost The cost of the product
     * @param price The price of the product
     * @return A new TimsProduct object
     */

    public static TimsProduct create(String name, double cost, double price) {
        return new TimsProduct(name, cost, price) {};
    }



    /**
     * Gets the name of the product.
     * @return The name of the product
     */

    public String getName() {
        return name;
    }

    Commodity c = new Commodity() {

        /**
         * Gets the production cost of the product.
         * @return The production cost of the product
         */
    	public double getProductionCost() {
    		return cost * 1.5;
    	}

            /**
            * Gets the retail price of the product.
            * @return The retail price of the product
            */
    	public double getRetailPrice() {
    		return price;
    	}
    };

    /**
     * Gets the production cost of the product.
     * @return The production cost of the product
     */

    public double getProductionCost() {
    	return c.getProductionCost();
    }

    /**
     * Gets the retail price of the product.
     * @return The retail price of the product
     */

    public double getRetailPrice() {
    	return c.getRetailPrice();
    }

    /**
     * Gets a string representation of the product.
     * @return A string representation of the product
     */

    public String toString() {
        return name + " (Production cost: $" + cost + ", Retail price: $" + price + ")\n";
    }

}

/**
 * Donut is a subclass of TimsProduct that implements the Consumable interface.
 * It has a description and calorie count. It also has a static factory method
 * that creates a new Donut object.
 */

class Donut extends TimsProduct implements Consumable {

    /** The description of the donut */
    private String description;

    /** The calorie count of the donut */
    private int calorieCount;

    /**
     * Creates a new Donut object with the given name, cost, price, description,
     * and calorie count.
     * @param name The name of the donut
     * @param cost The cost of the donut
     * @param price The price of the donut
     * @param description The description of the donut
     * @param calorieCount The calorie count of the donut
     */

    private Donut(String name, double cost, double price, String description, int calorieCount) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * Creates a new Donut object with the given name, cost, price, description,
     * and calorie count.
     * @param name The name of the donut
     * @param cost The cost of the donut
     * @param price The price of the donut
     * @param description The description of the donut
     * @param calorieCount The calorie count of the donut
     * @return A new Donut object
     */

    public static Donut create () {
        String name = "Donut";
        double cost = 1.99;
        double price = 4.99;
        String description = JOptionPane.showInputDialog("Enter a description for the donut");
        int calorieCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the calorie count for the donut"));
        return new Donut(name, cost, price, description, calorieCount);
    }

    /**
     * Gets the description of the donut.
     * @return The description of the donut
     */


    public String getDescription() {
        return description + " " + getName().toLowerCase() + " (Calories: " + calorieCount + ")";
    }

    /**
     * Gets the calorie count of the donut.
     * @return The calorie count of the donut
     */

    Consumable c = new Consumable() {
    	public int getCalorieCount() {
    		return calorieCount;
    	}

        /**
         * Gets the consumption method of the donut.
         * @return The consumption method of the donut
         */
    	public String getConsumptionMethod() {
    		return "Eat";
    	}
    };


    public int getCalorieCount() {
    	return c.getCalorieCount();
    }

    public String getConsumptionMethod() {
    	return c.getConsumptionMethod();
    }

    /**
     * Gets a string representation of the donut.
     * @return A string representation of the donut
     */


    @Override
    public String toString() {
        return super.toString() + "Description: " + getDescription() + "\n";
    }
}

/**
 * Coffee is a subclass of TimsProduct that implements the Consumable interface.
 * It has a description and calorie count. It also has a static factory method
 * that creates a new Coffee object.
 */

class Coffee extends TimsProduct implements Consumable {

    /** The description of the coffee */
    private String description;

    /** The calorie count of the coffee */
    private int calorieCount;

    /**
     * Creates a new Coffee object with the given name, cost, price, description,
     * and calorie count.
     * @param name The name of the coffee
     * @param cost The cost of the coffee
     * @param price The price of the coffee
     * @param description The description of the coffee
     * @param calorieCount The calorie count of the coffee
     */

    private Coffee(String name, double cost, double price, String description, int calorieCount) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * Creates a new Coffee object with the given name, cost, price, description,
     * and calorie count.
     * @param name The name of the coffee
     * @param cost The cost of the coffee
     * @param price The price of the coffee
     * @param description The description of the coffee
     * @param calorieCount The calorie count of the coffee
     * @return A new Coffee object
     */

    public static Coffee create() {
        String name = "Coffee";
        double cost = 0.99;
        double price = 3.99;
        String description = JOptionPane.showInputDialog("Enter a description for the coffee");
        int calorieCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the calorie count for the coffee"));
        return new Coffee(name, cost, price, description, calorieCount);
    }

    /**
     * Gets the description of the coffee.
     * @return The description of the coffee
     */

    public String getDescription() {
        return description + " " + getName().toLowerCase() + " (Calories: " + calorieCount + ")";
    }

    /**
     * Gets the calorie count of the coffee.
     * @return The calorie count of the coffee
     */

    Consumable c = new Consumable() {
        public int getCalorieCount() {
            return calorieCount;
        }

        /**
         * Gets the consumption method of the coffee.
         * @return The consumption method of the coffee
         */
        public String getConsumptionMethod() {
            return "Eat";
        }
    };

    public int getCalorieCount() {
        return c.getCalorieCount();
    }

    public String getConsumptionMethod() {
        return c.getConsumptionMethod();
    }

    /**
     * Gets a string representation of the coffee.
     * @return A string representation of the coffee
     */

    @Override
    public String toString() {
        return super.toString() + "Description: " + getDescription() + "\n";
    }

}

/**
 * Tumbler is a subclass of TimsProduct that implements the Consumable interface.
 * It has a color. It also has a static factory method that creates a new
 * Tumbler object.
 */

class Tumbler extends TimsProduct {

    /** The color of the tumbler */
    private Color color;

    /**
     * Creates a new Tumbler object with the given name, cost, price, and color.
     * @param name The name of the tumbler
     * @param cost The cost of the tumbler
     * @param price The price of the tumbler
     * @param color The color of the tumbler
     */

    private Tumbler(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    /**
     * Creates a new Tumbler object with the given name, cost, price, and color.
     * @param name The name of the tumbler
     * @param cost The cost of the tumbler
     * @param price The price of the tumbler
     * @param color The color of the tumbler
     * @return A new Tumbler object
     */

    public static Tumbler create() {
        String name = "Tumbler";
        double cost = 9.99;
        double price = 29.99;
        Color color = JColorChooser.showDialog(null, "Choose a color for the Tumbler", Color.BLACK);
        return new Tumbler(name, color, cost, price);
    }

    /**
     * Gets the color of the tumbler.
     * @return The color of the tumbler
     */

    public Color getColor() {
        return color;
    }

    /**
     * Gets a string representation of the tumbler.
     * @return A string representation of the tumbler
     */

    @Override
    public String toString() {
        String colorString = getColor().toString();
        if (colorString.equals("java.awt.Color[r=0,g=0,b=0]")) {
            colorString = "Black";
        } else if (colorString.equals("java.awt.Color[r=255,g=255,b=255]")) {
            colorString = "White";
        } else if (colorString.equals("java.awt.Color[r=255,g=0,b=0]")) {
            colorString = "Red";
        } else if (colorString.equals("java.awt.Color[r=0,g=255,b=0]")) {
            colorString = "Green";
        } else if (colorString.equals("java.awt.Color[r=0,g=0,b=255]")) {
            colorString = "Blue";
        }
        else if (colorString.equals("java.awt.Color[r=255,g=255,b=0]")) {
            colorString = "Yellow";
        }
        else if (colorString.equals("java.awt.Color[r=255,g=0,b=255]")) {
            colorString = "Magenta";
        }
        else if (colorString.equals("java.awt.Color[r=0,g=255,b=255]")) {
            colorString = "Cyan";
        }
        else
        {
            colorString = "Custom Color";
        }
        return super.toString() + "Color: " + colorString + "\n";
    }
}

/** Mug is a subclass of TimsProduct that implements the Consumable interface. It has a color. It also has a static factory method that creates a new Mug object. */

    class Mug extends TimsProduct {

        /** The color of the mug */
        private Color color;

        /**
         * Creates a new Mug object with the given name, cost, price, and color.
         * @param name The name of the mug
         * @param cost The cost of the mug
         * @param price The price of the mug
         * @param color The color of the mug
         */
        private Mug(String name, Color color, double cost, double price) {
            super(name, cost, price);
            this.color = color;
        }

        /**
         * Creates a new Mug object with the given name, cost, price, and color.
         * @param name The name of the mug
         * @param cost The cost of the mug
         * @param price The price of the mug
         * @param color The color of the mug
         * @return A new Mug object with the given name, cost, price, and color
         */

        public static Mug create() {
           String name = "Mug";
              double cost = 9.99;
                double price = 19.99;
                Color color = JColorChooser.showDialog(null, "Choose a color for the Mug", Color.BLACK);
                return new Mug(name, color, cost, price);
        }

        /**
         * Gets the color of the mug.
         * @return The color of the mug
         */

        public Color getColor() {
            return color;
        }

        /**
         * Gets a string representation of the mug.
         * @return A string representation of the mug
         */

        @Override
        public String toString() {
            String colorString = getColor().toString();
            if (colorString.equals("java.awt.Color[r=0,g=0,b=0]")) {
                colorString = "Black";
            } else if (colorString.equals("java.awt.Color[r=255,g=255,b=255]")) {
                colorString = "White";
            } else if (colorString.equals("java.awt.Color[r=255,g=0,b=0]")) {
                colorString = "Red";
            } else if (colorString.equals("java.awt.Color[r=0,g=255,b=0]")) {
                colorString = "Green";
            } else if (colorString.equals("java.awt.Color[r=0,g=0,b=255]")) {
                colorString = "Blue";
            }
            else if (colorString.equals("java.awt.Color[r=255,g=255,b=0]")) {
                colorString = "Yellow";
            }
            else if (colorString.equals("java.awt.Color[r=255,g=0,b=255]")) {
                colorString = "Magenta";
            }
            else if (colorString.equals("java.awt.Color[r=0,g=255,b=255]")) {
                colorString = "Cyan";
            }
            else
            {
                colorString = "Custom Color";
            }
            return super.toString() + "Color: " + colorString + "\n";
        }
    }
