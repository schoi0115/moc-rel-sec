package com.moc2;

//DO NOT MODIFY THE CODE PROVIDED TO YOU

public class AdMovies extends AdAgencyService {
	private double noOfDaysOfShooting;
	private char typeOfAdMovie;

	public AdMovies(String customerType, Model model, double noOfDaysOfShooting, char typeOfAdMovie) {
		super(customerType, model);
		this.noOfDaysOfShooting = noOfDaysOfShooting;
		this.typeOfAdMovie = typeOfAdMovie;
//		System.out.println(validateTypeOfAdMovie());
	}

	@Override
	public String toString() {
		return "AdMovies(customerType: " + this.getCustomerType() + ", model: " + this.getModel()
				+ ", noOfDaysOfShooting: " + this.noOfDaysOfShooting + ", typeOfAdMovie: " + this.typeOfAdMovie + ")";
	}

	public double getNoOfDaysOfShooting() {
		return noOfDaysOfShooting;
	}

	// To Trainees
	public Boolean validateNoOfDaysOfShooting() {
		// Implement your logic here
		boolean shootingChecker = false;
		if (typeOfAdMovie == 'H' || typeOfAdMovie == 'A' || typeOfAdMovie == 'L') {
			shootingChecker = true;
		} else {
			return shootingChecker;
		}

		// Change the return statement accordingly
		return shootingChecker;

	}

	// To Trainees
	public Boolean validateTypeOfAdMovie() {
		// Implement your logic here
		boolean movieChecker = false;
		if (noOfDaysOfShooting > 2.0 && noOfDaysOfShooting < 100.0) {
			movieChecker = true;
		} else {
			return movieChecker;
		}

		// Change the return statement accordingly
		return movieChecker;

	}

	// To Trainees
	@Override
	public long calculateQuotationAmount() {

		// Implement your code
		int budget = 0;
		double tax = 0.0;
		double serviceCharge = 0.0;
		
			
				
		if (validateTypeOfAdMovie() && validateNoOfDaysOfShooting() & getModel().validateRemunerationPerDay()) {
			if (typeOfAdMovie == 'H') {
				budget = 2500000;
				serviceCharge = budget * (25.25 / 100);
			}
			if (typeOfAdMovie == 'A') {
				budget = 2000000;
				serviceCharge = budget * (17.5 / 100);
			}
			if (typeOfAdMovie == 'L') {
				budget = 1500000;
				serviceCharge = budget * (12.75 / 100);
			}
			if (getCustomerType().equalsIgnoreCase("Government")) {
				tax = 0.0;
			}
			if (getCustomerType().equalsIgnoreCase("Public")) {
				tax = 15.75;
			}
			if (getCustomerType().equalsIgnoreCase("Private")) {
				tax = 20.25;
			}
		}
		
		double cal = Math.floor(budget + getModel().getRemunerationPerDay() * getNoOfDaysOfShooting() + serviceCharge);
		System.out.println(tax);


		long totalBudget = (long) (cal+ (cal*tax/100));

		// Change the return statement accordingly
		return totalBudget;
	}
}