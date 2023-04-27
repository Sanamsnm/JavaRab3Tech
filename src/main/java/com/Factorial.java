package com;

public class Factorial {
		
	
		public int fact(int num){
			
			if(num<0){
				throw new ArithmeticException();
				
			}		
			int fact=1;
			
			for(int i=1;i<=num;i++){
				
				fact=fact*i;		
				
			}		
			return fact;		
		}	
		
	}

