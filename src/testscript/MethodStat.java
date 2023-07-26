package testscript;

public class MethodStat {

	public static void main(String[] args) {
		
		Tiger.roar();
		Tiger cat = new Tiger();
		cat.eat();// object of method
		
	}
	}	
      class Tiger{
    	public void eat() { // non static
    	System.out.println("Tiger eats");	
    	
    		
    	} 
    	  
    	public static void roar() {// static methos
    		System.out.println("Tiger roar");	
    		
    		
    	}
    	
    	  
      
      
}


