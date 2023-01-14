package com.shadab.ui.testing.selenium.sample.test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDataDrivenTests {


	@Test
	@Parameters({"name","country","city"})
	public void cityTest(String name,String country,String city) throws Exception {

		System.out.println("NAME:"+name);
		System.out.println("COUNTRY:"+country);
		System.out.println("CITY:"+city);

	}

	

}
