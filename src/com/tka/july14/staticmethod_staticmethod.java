package com.tka.july14;

public class staticmethod_staticmethod {
	static double balance= 1000;
	static void bankbalance(int amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
			
		}
		else {
			balance-=amount;
			System.out.println(" successfully withdraw .remaining balance= "+balance);
		}
	}
}

