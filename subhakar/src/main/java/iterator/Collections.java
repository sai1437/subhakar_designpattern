package iterator;

public class Collections {
	public String sweets[]={"kaja", "gilebi","gulab jammu","halva"};   
    
	public Iterator getIterator() {  
	        return new CollectionsIterate() ;  
	    }  
	    private class CollectionsIterate implements Iterator{  
	        int i;  
	         
	        public boolean hasNext() {  
	            if (i<sweets.length){  
	                return true;  
	            }  
	            return false;  
	        }  
	      
	        public Object next() {  
	            if(this.hasNext()){  
	                return sweets[i++];  
	            }  
	            return null;      
	        }  
	    }  
	}  


