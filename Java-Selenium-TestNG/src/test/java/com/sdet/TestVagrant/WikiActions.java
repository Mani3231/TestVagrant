package com.sdet.TestVagrant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		System.out.println("Realese date : " + releaseDate.getText());
		return true;
	}

	public static boolean movieCountry() {
		WebElement releaseCountry = driver.findElement(By.xpath(WikiHomePage.Country));
		System.out.println("Realese Country : " + releaseCountry.getText());
		return true;

	}
}
