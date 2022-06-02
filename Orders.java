import java.util.*;
import java.util.Date;

public class Orders {
    public static void main(String[] args) {
        Date today = new Date();
        List<Order> list_orders = new ArrayList<Order>();

        //Creates 100 random orders with 4 items each
        for(int i = 0; i <= 5; i++){
            Order shipment = new Order("Francisco", 963474765, "UA", random());
            
            for(int j = 0; j <= 4; j++ ){
                Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, random());
                shipment.add_item(x38randoms);
                list_orders.add(shipment);
            } 
        }
        
        //Receive the inputs (PUT IN A FUNCTION)
        String start[] = args[0].split(" ");
        String finish[] = args[1].split(" ");
        
        String start_date[] = start[0].split("-");
        String start_hour[] = start[1].split(":");

        String finish_date[] = finish[0].split("-");
        String finish_hour[] = finish[1].split(":");

        Dates startdate = new Dates(Integer.parseInt(start_date[0]), Integer.parseInt(start_date[1]), Integer.parseInt(start_date[2]), Integer.parseInt(start_hour[0]), Integer.parseInt(start_hour[1]), Integer.parseInt(start_hour[2]));
        Dates finishdate = new Dates(Integer.parseInt(finish_date[0]), Integer.parseInt(finish_date[1]), Integer.parseInt(finish_date[2]), Integer.parseInt(finish_hour[0]), Integer.parseInt(finish_hour[1]), Integer.parseInt(finish_hour[2]));

        //Search in interval
        int f1_3=0;
        int f4_6=0;
        int f7_12=0;
        int f12=0;
        long today_stamp = today.getTime()/1000;

        Iterator<Order> iterator_order = list_orders.iterator();
        while (iterator_order.hasNext()){
            Order order = iterator_order.next();
            if(order.getdate().between(startdate, finishdate)){
                Iterator<Item> iterator_item = order.getItems().iterator();
                while(iterator_item.hasNext()){
                    Item item = iterator_item.next();
                    int stamp = item.getDate().getTimestamp();
                    if((today_stamp - 2629743*12) <= stamp)
                        f12++;
                    if(((today_stamp - 2629743*12) >= stamp) && ((today_stamp - 2629743*6) < stamp))
                        f7_12++;
                    if(((today_stamp - 2629743*6) >= stamp) && ((today_stamp - 2629743*3) < stamp))
                        f4_6++;
                    if(((today_stamp - 2629743*3) >= stamp) && ((today_stamp - 2629743*1) < stamp))
                        f1_3++;
                }
            }
        }

        
        System.out.println("1-3 months: "+ f1_3);
        System.out.println("4-6 months: "+ f4_6);
        System.out.println("7-12 months: "+ f7_12);
        System.out.println("<12 months: "+ f12);
    
    }

    // gives a random date between 2017/2021
    public static Dates random(){
        Dates random = new Dates(
            2021,
            (int)(Math.random()*12 +1),
            (int)(Math.random()*28+1),
            (int)(Math.random()*24),
            (int)(Math.random()*59),
            (int)(Math.random()*59));


        return random;
    }
}
