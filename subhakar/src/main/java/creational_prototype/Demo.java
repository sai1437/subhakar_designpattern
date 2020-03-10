package creational_prototype;
	import java.io.BufferedReader;  
	import java.io.IOException;  
	import java.io.InputStreamReader;  
	  
	class Demo{  
	     public static void main(String[] args) throws IOException {  
	          
	        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
	        System.out.print("Enter car Id: ");  
	        int cid=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter car Name: ");  
	        String cname=br.readLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter petrol capacity: ");  
	        int p_c=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter engine model: ");  
	        int engine_m=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	           
	        Car c1=new Car(cid,cname,p_c,engine_m);  
	          
	        c1.showRecord();  
	        System.out.println("\n");  
	        Car c2=(Car) c1.getClone();  
	        c2.showRecord();  
	    }     
	}

