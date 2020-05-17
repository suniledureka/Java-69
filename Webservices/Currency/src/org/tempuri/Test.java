package org.tempuri;

import java.math.BigDecimal;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) throws Exception{
		ConverterLocator locator = new ConverterLocator(); 
		ConverterSoap soap = locator.getConverterSoap();
		
		Calendar rateDate=Calendar.getInstance();
		System.out.println("Dollar Rate on "+rateDate.getTime());
		BigDecimal rate=soap.getConversionRate("USD", "INR", rateDate);
		System.out.printf("1 USD = %.2f INR",rate);
	}
}
