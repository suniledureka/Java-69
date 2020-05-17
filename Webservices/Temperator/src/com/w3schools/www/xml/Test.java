package com.w3schools.www.xml;

public class Test {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap soap = locator.getTempConvertSoap();
		
		String cel = "106";
		String fah = soap.celsiusToFahrenheit(cel);
		System.out.println(cel+"C = "+fah+"F");
	}
}
