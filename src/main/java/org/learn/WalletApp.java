package org.learn;

public class WalletApp {

	public static void main(String[] args) {
		Funder funder = new AccountBank();
		System.out.println("Fondear la cuenta con: "+funder.fund());
	}
}
