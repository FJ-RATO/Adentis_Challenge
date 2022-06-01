public class Product {
  
    private String name;
    private String category; //change to enum
    private double weight;
    private double price;
    private Date date;


    public Product(String name, String category, double weight, double price, Date date) {
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

    public Date getDate() {
        return this.date;
    }
}
