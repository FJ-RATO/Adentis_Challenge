import java.util.*;

public class Order {
        private String c_name; //customer name
        private int c_contact; //customer contact
        private String shipping_address; 
        private double grand_total = 0;
        private Dates date; //creation date
        private List<Item> items = new ArrayList<Item>();

        public Order(String name, int contact, String shipping_address, Dates date) {
                this.c_name = name;
                this.c_contact = contact;
                this.shipping_address = shipping_address;
                this.date = date;
        }

        public void add_item(Item item){
                items.add(item);
                this.grand_total = this.grand_total + item.getCost();
        }

        public Dates getdate(){
                return this.date;
        }
        
        public List<Item> getItems(){
                return this.items;
        }
}
