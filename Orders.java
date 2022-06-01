import java.util.*;
public class Orders {
    public static void main(String[] args) {
        
        List<Order> list_orders = new ArrayList<Order>();

        for(int i = 0; i <= 99; i++){
            Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, random());
            Order shipment = new Order("Francisco", 963474765, "UA", random());
            shipment.add_item(x38randoms);
            list_orders.add(shipment);
        } 
    }

    public static Date random(){
        Date random = new Date(
            (int)(Math.random()*22 + 1998),
            (int)(Math.random()*12 +1),
            (int)(Math.random()*28+1),
            (int)(Math.random()*24),
            (int)(Math.random()*59),
            (int)(Math.random()*59));

        return random;
    }
}
