package creational_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Totalbill {
	public static void main(String args[])throws IOException{  
	      System.out.print("Enter the name of order for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String ordername=br.readLine();  
	      System.out.print("Enter the gst for bill will be calculated: ");  
	      int gst1=Integer.parseInt(br.readLine());  
	  
	      Hotel_bill h = Getmenu.getmenu(ordername);  
	  
	       System.out.print("Bill amount for "+ordername+" of  "+gst1+" units is: ");  
	           h.getprice();  
	           h.calculateBill(gst1);  
	            }  

}
