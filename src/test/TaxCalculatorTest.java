package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.chapter01.TaxCalculator;

public class TaxCalculatorTest {

	@Test
	public void when_income_less_than_5Lacs_then_deducts_10_percent_tax() {
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double payableTax = taxCalculator.calculate(400000.00);
		assertTrue(40000 == payableTax);
		
		payableTax = taxCalculator.calculate(0);
		assertTrue(0 == payableTax);
		
		payableTax = taxCalculator.calculate(500000.00);
		assertTrue(50000 == payableTax);
	}
	
	@Test
	public void when_income_between_5Lacs_and_10Lacs_then_deducts_fifty_thousand_plus_20_percent_above_5lacs() {
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double payableTax = taxCalculator.calculate(900000.00);
		double expectedTaxForFirstFiveHundredThousand = 50000.00;
		double expectedTaxForReminder = 80000.00;
		double expectedTotalTax = expectedTaxForFirstFiveHundredThousand + expectedTaxForReminder;
		assertTrue(expectedTotalTax == payableTax);
	}
	
	@Test
	public void when_income_above_10Lacs_then_deducts_fifty_thousand_plus_20_percent_above_5lacs() {
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double payableTax = taxCalculator.calculate(1000000.00);
		double expectedTaxForNextFiveHundredThousand = 70000.00;
		double expectedTaxForReminder = 80000.00;
		double expectedTotalTax = expectedTaxForNextFiveHundredThousand + expectedTaxForReminder;
		assertTrue(expectedTotalTax == payableTax);
	}

}
