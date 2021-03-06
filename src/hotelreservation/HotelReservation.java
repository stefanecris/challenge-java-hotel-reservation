package hotelreservation;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class HotelReservation {
    
    private static Hotel lakewoodHotel, bridgewoodHotel, ridgewoodHotel;
    
    public static void main(String[] args) {
        
        String clientType = args[0].substring(0, args[0].length() - 1);
        
        if(clientType.equals("Regular")){
            lakewoodHotel = new Hotel("Lakewood", 3, 110, 90);
            bridgewoodHotel = new Hotel("Bridgewood", 4, 160, 60);
            ridgewoodHotel = new Hotel("Ridgewood", 5, 220, 150);
        }else if(clientType.equals("Rewards")){
            lakewoodHotel = new Hotel("Lakewood", 3, 80, 80);
            bridgewoodHotel = new Hotel("Bridgewood", 4, 110, 50);
            ridgewoodHotel = new Hotel("Ridgewood", 5, 100, 40);
        }
        
        calculateTotalForEachHotel(args);
        
        String cheapestHotel = cheapestHotel();
        
        System.out.println(cheapestHotel);
        
    }
    
    public static void calculateTotalForEachHotel(String[] args){
        lakewoodHotel.calcTotal(args);
        bridgewoodHotel.calcTotal(args);
        ridgewoodHotel.calcTotal(args);
    }
        
    public static String cheapestHotel(){
        Hotel cheapest = lakewoodHotel;
        
        if(bridgewoodHotel.getTotal() < cheapest.getTotal()){
            cheapest = bridgewoodHotel;
        }else if(bridgewoodHotel.getTotal() == cheapest.getTotal()){
            if(bridgewoodHotel.getRating() > cheapest.getRating()){
                cheapest = bridgewoodHotel; 
            }
        }
        
        if(ridgewoodHotel.getTotal() < cheapest.getTotal()){
            cheapest = ridgewoodHotel;
        }else if(ridgewoodHotel.getTotal() == cheapest.getTotal()){
            if(ridgewoodHotel.getRating() > cheapest.getRating()){
                cheapest = ridgewoodHotel; 
            }
        }
        
        return cheapest.getName();
    }
    
}
