package com.infy1;

import java.util.Scanner;


public class Tester {
	public static void main(String[] args) {
		String[] availJewelArr = {"Bentex","Silver","Gold","Platinum"};
		int[] availPriceArr ={20,50,2600,3000};
		
		String[] purchasedJewelsArr= {"Platinum"};
		int[] purchasedQuantityArr= {8};
		
		System.out.println("Bill Amount: "+new Solution().calculateBillAmount(availJewelArr,availPriceArr,purchasedJewelsArr,purchasedQuantityArr));
	}
}
