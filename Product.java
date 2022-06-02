public class Product {
  
    private String name;
    private String category; //change to enum
    private double weight;
    private double price;
    private Dates date; //date of creation of the product


    public Product(String name, String category, double weight, double price, Dates date) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.date = date;
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

    public Dates getDate() {
        return this.date;
    }
}
