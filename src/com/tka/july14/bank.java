package com.tka.july14;

public class bank {
  
	
	static int balence=1000;
	void withdraw(int amount) {
		if(amount>balence) {
			System.out.println("insufficient balence");
		}
		else {
			balence-=amount;
			System.out.println("withdraw sucessfully new balence="+balence);
		}
	}
}
