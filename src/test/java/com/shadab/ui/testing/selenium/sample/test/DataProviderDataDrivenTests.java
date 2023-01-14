package com.shadab.ui.testing.selenium.sample.test;

import org.testng.annotations.Test;

import com.shadab.ui.testing.selenium.sample.dataproviders.AddressDataProvider;

public class DataProviderDataDrivenTests {

	@Test(dataProvider = "addressDataProvider", dataProviderClass = AddressDataProvider.class)
	public void cityTest(String name, String country, String city) throws Exception {

		System.out.println("NAME:" + name);
		System.out.println("COUNTRY:" + country);
		System.out.println("CITY:" + city);

	}

}
