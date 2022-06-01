public class Product {
  
    private String name;
    private String category; //change to enum
    private Double weight;
    private Double price;
    private Data data;

    public Product(String name, String category, Double weight, Double price, Data data) {
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
