package com.masai;

import java.util.Scanner;

public class Demo {
	
	static void primeFac(int n) {
		
		if(n>=2 && n<=100) {
			boolean prime=true;
			System.out.println(1+" ");
			
			for(int i=2;i<=47;i++) {
				if(n%i==0) {
					for(int j=2;j<=i/2;j++) {
						if(i%j==0)
							prime=false;
					}
					if(prime)
						System.out.println(i+ " ");
					
					prime=true;
				}
			}
			
			for(int j=2;j<=n/2;j++) {
				if(n%j==0)
					prime=false;
			}
			if(prime)
				System.out.println(n+ " ");
			
			
		}
		else
			System.out.println("Invalid number");
		
		
	}
		 
	public static void main(String[] args) {
		
		Demo.primeFac(63);
	}

}
