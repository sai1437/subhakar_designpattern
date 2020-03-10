package strategy_pattern;

public class Context {  
	  
    private Calculator c;  
    
    public Context(Calculator c){  
       this.c = c;  
    }  

    public float perform_op(float num1, float num2){  
       return c.operations(num1, num2);  
    }  
}