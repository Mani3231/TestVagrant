package com.sdet.Test;

import org.testng.annotations.Test;

import com.sdet.TestVagrant.WikiActions;

import utils.PropertyFilereader;

public class WikiTest {
	@Test
	public void verifyMovie() {
		if (WikiActions.launchBrowser(PropertyFilereader.getProperty("url"))) {
			if (WikiActions.movieReleaseDate()) {
				if (WikiActions.movieCountry()) {
				}
			}
		} else {
			System.out.println("Launch url failed");
		}
	}
}
