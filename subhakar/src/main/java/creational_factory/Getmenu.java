package creational_factory;

public class Getmenu {
	 public static Hotel_bill getmenu(String order){  
         if(order == null){  
          return null;  
         }  
       if(order.equalsIgnoreCase("Dosa")) {  
              return new Dosa();  
            }   
        else if(order.equalsIgnoreCase("Upma")){  
             return new Upma();  
         }    
   return null;  

}
}
