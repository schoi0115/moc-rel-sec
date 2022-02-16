package com.moc2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Model modelobj = new Model(23534, 35000.0);
		AdMovies admoviesobj = new AdMovies("PRIVATE", modelobj, 10.0, 'A');
		System.out.println("Quotation Amount: " + admoviesobj.calculateQuotationAmount());
	}

}
