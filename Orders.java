import java.util.*;
public class Orders {
    public static void main(String[] args) {
        
        List<Order> list_orders = new ArrayList<Order>();

        //Creates 100 random orders with 4 items each
        for(int i = 0; i <= 99; i++){
            Order shipment = new Order("Francisco", 963474765, "UA", random());
            
            for(int j = 0; j <= 4; j++ ){
                Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, random());
                shipment.add_item(x38randoms);
                list_orders.add(shipment);
            } 
        }
        
        //Receive the inputs
        String start[] = args[0].split(" ");
        String finish[] = args[1].split(" ");
        
        String start_date[] = start[0].split("-");
        String start_hour[] = start[1].split(":");

        String finish_date[] = finish[0].split("-");
        String finish_hour[] = finish[1].split(":");

        Date startdate = new Date(Integer.parseInt(start_date[0]), Integer.parseInt(start_date[1]), Integer.parseInt(start_date[2]), Integer.parseInt(start_hour[0]), Integer.parseInt(start_hour[1]), Integer.parseInt(start_hour[2]));
        Date finishdate = new Date(Integer.parseInt(finish_date[0]), Integer.parseInt(finish_date[1]), Integer.parseInt(finish_date[2]), Integer.parseInt(finish_hour[0]), Integer.parseInt(finish_hour[1]), Integer.parseInt(finish_hour[2]));

        //Search in interval

        List<Order> filtered = new ArrayList<Order>();
        Iterator<Order> iterator = list_orders.iterator();
        while (iterator.hasNext()){
            Order order = iterator.next();
            if(order.getdate().between(startdate, finishdate)){
                filtered.add(order);
            }
        }    

        System.out.print(filtered.size());
    
    }

    // gives a random date between 2017/2021
    public static Date random(){
        Date random = new Date(
            (int)(Math.random()*5 + 2017),
            (int)(Math.random()*12 +1),
            (int)(Math.random()*28+1),
            (int)(Math.random()*24),
            (int)(Math.random()*59),
            (int)(Math.random()*59));

        return random;
    }
}
