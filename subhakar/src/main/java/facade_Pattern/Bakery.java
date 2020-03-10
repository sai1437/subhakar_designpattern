package facade_Pattern;

public class Bakery {
	 private Chocolate dairymilk;  
	    private Chocolate kitkat; 
	      
	    public Bakery(){  
	        dairymilk= new DairyMilk();  
	        kitkat=new KitKat();  
	   
	    }  
	    public void dm(){  
	        dairymilk.choconame();  
	        dairymilk.price();  
	    }  
	        public void kk(){  
	        kitkat.choconame();  
	        kitkat.price();  
	    }  

}
