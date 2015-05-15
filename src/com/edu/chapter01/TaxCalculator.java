package com.edu.chapter01;

public class TaxCalculator {

	public double calculate(double taxableIncome) {
		// TODO Auto-generated method stub
		if(isIncomeIn30PercentTaxRange(taxableIncome))
			return deduct30PercentAbove10Lacs(taxableIncome) + calculate(1000000);
		
		if (isIncomeIn20PercentTaxRange(taxableIncome)) 
			return deduct20PercentAbove5Lacs(taxableIncome) + calculate(500000);
		
		return (taxableIncome / 10);
	}

	protected double deduct20PercentAbove5Lacs(double taxableIncome) {
		// TODO Auto-generated method stub
		return (taxableIncome - 500000) * .20;
	}

	private boolean isIncomeIn20PercentTaxRange(double taxableIncome) {
		// TODO Auto-generated method stub
		return false;
	}

	protected double deduct30PercentAbove10Lacs(double taxableIncome) {
		// TODO Auto-generated method stub
		return (taxableIncome - 1000000) * .30;
	}

	private boolean isIncomeIn30PercentTaxRange(double taxableIncome) {
		// TODO Auto-generated method stub
		return false;
	}

}
