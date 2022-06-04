import java.util.*;
import java.util.Date;

public class Orders {
    public static void main(String[] args) {

        List<Order> list_orders = new ArrayList<Order>();

        Dates year[] = {
        new Dates(2022, 3, 15, 00, 00, 00),
        new Dates(2022, 2, 15, 00, 00, 00),
        new Dates(2022, 1, 15, 00, 00, 00),
        new Dates(2021, 12, 15, 00, 00, 00),
        new Dates(2021, 11, 15, 00, 00, 00),
        new Dates(2021, 10, 15, 00, 00, 00),
        new Dates(2021, 9,15, 00, 00, 00),
        new Dates(2021, 8, 15, 00, 00, 00),
        new Dates(2021, 7, 15, 00, 00, 00),
        new Dates(2021, 6, 15, 00, 00, 00),
        new Dates(2021, 5, 15, 00, 00, 00),
        new Dates(2021, 4, 15, 00, 00, 00),
        };        
        System.out.println(year[1].toString());
        //Creates 10000 random orders with 12 items each
        
        for(int i = 0; i <= 9999; i++){
            Order order = new Order("Francisco", 963474765, "UA", random());
            
            //Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, random());
            for(int j = 0; j < year.length; j++ ){
                Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, year[j]); 
                order.add_item(x38randoms);   
            }  
            /*
            for(int j = 0; j <= 11; j++ ){
                Item x38randoms = new Item(14, 23, 38, "rand product", "Fruta", 15, 1, random());    
            } 
            */

            list_orders.add(order);
        }
        
        
        //Receive the inputs
        String start[] = args[0].split(" ");
        String start_date[] = start[0].split("-");
        String start_hour[] = start[1].split(":");
        Dates startdate = new Dates(Integer.parseInt(start_date[0]), Integer.parseInt(start_date[1]), Integer.parseInt(start_date[2]), Integer.parseInt(start_hour[0]), Integer.parseInt(start_hour[1]), Integer.parseInt(start_hour[2]));
        
        String finish[] = args[1].split(" ");
        String finish_date[] = finish[0].split("-");
        String finish_hour[] = finish[1].split(":");
        Dates finishdate = new Dates(Integer.parseInt(finish_date[0]), Integer.parseInt(finish_date[1]), Integer.parseInt(finish_date[2]), Integer.parseInt(finish_hour[0]), Integer.parseInt(finish_hour[1]), Integer.parseInt(finish_hour[2]));

        //Search in interval
        int f1_3=0;
        int f4_6=0;
        int f7_12=0;
        int f12=0;
        Date today = new Date();
        long today_stamp = today.getTime()/1000; //Date.getTime returns a timestamp in ms we want s

        Iterator<Order> iterator_order = list_orders.iterator();
        while (iterator_order.hasNext()){
            Order order = iterator_order.next();
            if(order.getdate().between(startdate, finishdate)){
                Iterator<Item> iterator_item = order.getItems().iterator();
                while(iterator_item.hasNext()){
                    Item item = iterator_item.next();
                    long dif = today_stamp - (int)item.getDate().getTimestamp();

                    if(dif <= 2629743*3)
                        f1_3++;
                    if((dif <= 2629743*6) && (dif > 2629743*3))
                        f4_6++;
                    if((dif <= 2629743*12) && (dif > 2629743*6))
                        f7_12++;
                    if((dif >= 2629743*12))
                        f12++;
                }
            }
        }

        System.out.println("1-3 months: "+ f1_3);
        System.out.println("4-6 months: "+ f4_6);
        System.out.println("7-12 months: "+ f7_12);
        System.out.println("<12 months: "+ f12);
    
    }

    // gives a random date
    public static Dates random(){
        Dates random = new Dates(
            (int)(Math.random()*1 +2021),
            (int)(Math.random()*12 +1),
            (int)(Math.random()*27+1),
            (int)(Math.random()*22 + 1 ),
            (int)(Math.random()*59),
            (int)(Math.random()*59));
        return random;
    }
}
