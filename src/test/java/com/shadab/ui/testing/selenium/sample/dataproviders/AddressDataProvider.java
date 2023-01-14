package com.shadab.ui.testing.selenium.sample.dataproviders;

import org.testng.annotations.DataProvider;

public class AddressDataProvider {

	@DataProvider(name = "addressDataProvider")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Shadab", "India", "SRE" }, { "Ram", "UK", "Harington" },
				{ "Shyam", "USA", "San Jose" } };
	}

}
