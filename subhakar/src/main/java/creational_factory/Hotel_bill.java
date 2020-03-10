package creational_factory;

abstract class Hotel_bill {
	protected double price;  
    abstract void getprice();
    public void calculateBill(int gst){  
        System.out.println(price*gst);  
    }  

}
