package iterator;

public class IteratorPattern {
	public static void main(String[] args) {  
        Collections c = new Collections();  
          
        for(Iterator iter = c.getIterator(); iter.hasNext();){  
            String name = (String)iter.next();  
            System.out.println("sweet : " + name);  
         }      
  }  

}
