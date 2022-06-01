public class Item {

    private double cost;
    private int shipping_fee;
    private int tax_amount;
    

    public Item(double cost, int shipping_fee, int tax_amount) {
        this.cost = cost;
        this.shipping_fee = shipping_fee;
        this.tax_amount = tax_amount;
    }

    public double getCost() {
        return this.cost;
    }

    public int getShipping_fee() {
        return this.shipping_fee;
    }

    public int getTax_amount() {
        return this.tax_amount;
    }

}
