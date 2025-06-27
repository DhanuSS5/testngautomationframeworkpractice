package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {
	public WebDriver driver;
	public YoutubePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='search_query']")WebElement searchbar;
	@FindBy(xpath="//button[@aria-label='Search' and @class='ytSearchboxComponentSearchButton']")WebElement searchicon;
	@FindBy(xpath="//yt-formatted-string[text()='Videos']")WebElement videos;
	
	public boolean searchbarVisibility()
	{
		return searchbar.isDisplayed();
		//searchbar.sendKeys(search);
	}
	public void searchItem(String word)
	{
		searchbar.sendKeys(word);
	}
	public void searchIcon()
	{
		//searchbar.sendKeys("Music");
		searchicon.click();
	}
	public boolean isvideosButtonVisible()
	{
		return videos.isDisplayed();
	}
	
	
	

}
