package testscript;

import java.util.Scanner;

public class ScannerCalss {

	public static void main(String[] args) {
		
		
	float p,r,t,sinterest;
	Scanner  sc = new Scanner (System.in);
	System.out.println("Enter the principle value:");
	p = sc.nextFloat();
	System.out.println("Enter the fate of interest: "); 
	r = sc.nextFloat();	
	System.out.println("Enter period of time: ");	
	t = sc.nextFloat();	
	sc.close();	
	sinterest =(p*r*t)/100;
	System.out.println("simple interest:"+sinterest);	
		
		
	}

}
