package testscript;

public class ReturnValue {

	public static void main(String[] args) {
		int z = Mymethod(78,97);
		System.out.println(z);
		System.out.println(Mymethod(3,8));
		System.out.println(Ourmethod(9));
	}
   
	
	public static int Mymethod (int x, int y) {
		
		return y*x;
		//second exm//
}

    static int Ourmethod(int y) {
    	
    	return 8+y;
    	
    	
    	
    }
}