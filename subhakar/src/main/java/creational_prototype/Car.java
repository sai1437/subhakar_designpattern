package creational_prototype;

public class Car implements Prototype {
	
	   private int id;  
	   private String name;  
	   private int petrol_capacity;
	   private int engine_model;
	   
	   public Car(){  
           System.out.println(" car details ");  
           System.out.println("---------------------------------------------");  
           System.out.println("id"+"\t"+"name"+"\t"+"petrol_capacity"+"\t"+"engine_model");  
     
}  
	   public  Car(int id, String name,int petrol_capacity,int engine_model) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.petrol_capacity = petrol_capacity;  
	        this.engine_model = engine_model;  
	    
	    }  
	      
	  public void showRecord(){  
	          
		  System.out.println(id+"\t"+name+"\t"+petrol_capacity+"\t"+engine_model);
	   }  
	  
	 
	    public Prototype getClone() {  
	          
	        return new Car(id,name,petrol_capacity,engine_model);  
	    } 
	    

	
}
