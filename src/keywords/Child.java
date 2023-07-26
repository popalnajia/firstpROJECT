package keywords;



public class Child extends Parent{

	
public void mul(int x,int y) {
		
	  z = x*y;
		System.out.println("mul :" +z);
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20 , b = 10;
		 
		Child obj = new Child();
		obj.add(a, b);
        obj.sub(a, b);
		obj.mul(a, b);
		
		
}
}
	
	
	
	
	
	
	
	

