public class Product extends Item{
  
    private String name;
    private String category; //change to enum
    private double weight;
    private double price;
    private Data data;


    public Product(String name, String category, double weight, double price, Data data, double cost, int shipping_fee, int tax_amount) {
        super(cost,shipping_fee,tax_amount);
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.data = data;
    }
    

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Double getPrice() {
        return this.price;
    }

    public Data getData() {
        return this.data;
    }
}
