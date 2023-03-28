package Assignment7_000905188;
/**
 * This interface represents a consumable item that can be purchased from Tim Hortons.
 * It contains methods to get the calorie count and consumption method of the item.
 * @author Jovain Chisholm
 */
public interface Consumable {

    /**
     * Returns the calorie count of the item.
     * @return the calorie count of the item
     */
    int getCalorieCount();

    /**
     * Returns the consumption method of the item.
     * @return the consumption method of the item
     */
    String getConsumptionMethod();
}
