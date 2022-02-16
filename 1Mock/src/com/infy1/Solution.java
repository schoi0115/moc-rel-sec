package com.infy1;

import java.util.*;
//DO NOT MODIFY THE CODE PROVIDED TO YOU

class Solution {
	public double calculateBillAmount(String[] availJewelArr, int[] availPriceArr, String[] purchasedJewelsArr,
			int[] purchasedQuantityArr) {

		double billAmount = 0.0;
		// Implement your logic here
		for (int x = 0; x < purchasedJewelsArr.length; x++) {
			boolean found = false;
			for (int i = 0; i < availJewelArr.length; i++) {
				if (purchasedJewelsArr[x].equals(availJewelArr[i])) {
					billAmount += purchasedQuantityArr[x] * availPriceArr[i];
					found = true;
				}

			}
			if (!found) {
				billAmount = -1.0;
				break;
			}

		}
		if (billAmount > 20000.0) {
			billAmount = billAmount - (billAmount * 3 / 100);
		}

		return billAmount;

	}

}
