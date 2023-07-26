package testscript;

public class Constructor {
	         
	   String name;  // intializing value not return value 
	    Constructor(){ // call constructor
	   System.out.println("Call her  name"); 
	   name = "Najia"; // declear the value
	    }    
	   ////////////// parameterizled ////////////////////
	
	
	    /* String languages;
	     Constructor(String lang){
	    	languages = lang;
	    	System.out.println(languages + " Programming languages");
	    	 
	    	  }*/
	     
	////////// defulte constructor///////
	// int a ;
	// boolean b;
	
	
	     
	     public static void main(String[] args) {
		
        Constructor obj = new Constructor(); // creat an object and constructor call as well
        System.out.println("Her is  name: "+ obj .name);
	 
		/////////////// parameterized //////
		/*Constructor obj = new  Constructor("languages");
	    System.out.println("The name is " +obj.languages);
	    }*/
      // Constructor obj = new Constructor ();
      // System.out.println("Deafult value:");
      // System.out.println("a=" +obj.a);
      // System.out.println("b= " + obj.b); 
	     }
	     
	     
}