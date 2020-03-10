package facade_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facade {
	private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
          
            System.out.print("  1. dairymilk.   \n");  
            System.out.print("  2. kitkat.  \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            Bakery bk=new Bakery();  
              
            switch (choice) {  
            case 1:  
                {   
                  bk.dm();  
                    }  
                break;  
       case 2:  
                {  
                  bk.kk();        
                    }  
                break;    
         
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  

}
