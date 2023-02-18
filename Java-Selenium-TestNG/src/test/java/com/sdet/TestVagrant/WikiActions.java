package com.sdet.TestVagrant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sdet.commons.Commons;

public class WikiActions {
	public static WebDriver driver = null;

	public static boolean launchBrowser(String url) {
		driver = Commons.getWebDriver();
		driver.get(url);
		return true;
	}

	public static boolean movieReleaseDate() {
		WebElement releaseDate = driver.findElement(By.xpath(WikiHomePage.Release_Date));
		System.out.println(releaseDate.getText());
		String expected = "Release date\r\n" + "17 December 2021";
		String actual = driver.findElement(By.xpath(WikiHomePage.Release_Date)).getText();
		Assert.assertNotNull(actual, expected);
		return true;
	}

	public static boolean movieCountry() {
		WebElement releaseCountry = driver.findElement(By.xpath(WikiHomePage.Country));
		System.out.println(releaseCountry.getText());
		String expected = "Country India";
		String actual = driver.findElement(By.xpath(WikiHomePage.Country)).getText();
		Assert.assertEquals(actual, expected);
		return true;

	}
}
