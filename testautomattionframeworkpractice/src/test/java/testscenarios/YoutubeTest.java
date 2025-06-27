package testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.YoutubePage;

public class YoutubeTest extends Base {
	@Test
	public void youtubeSearch()
	{
		driver.navigate().to("https://www.youtube.com/");
		YoutubePage youtube=new YoutubePage(driver);
		boolean youtubevisiblevariable=youtube.searchbarVisibility();
		youtube.searchItem("TOMANDJERRY");
		Assert.assertTrue(youtubevisiblevariable);
		youtube.searchIcon();
		youtube.isvideosButtonVisible();
		
	}

}
