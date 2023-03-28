package Assignment7_000905188;
/**
 * This interface represents a commodity that can be purchased from Tim Hortons.
 * It contains methods to get the production cost and retail price of the commodity.
 * @author Jovain Chisholm
 */
public interface Commodity {

    /**
     * Returns the production cost of the commodity.
     * @return the production cost of the commodity
     */
    double getProductionCost();

    /**
     * Returns the retail price of the commodity.
     * @return the retail price of the commodity
     */
    double getRetailPrice();
}
