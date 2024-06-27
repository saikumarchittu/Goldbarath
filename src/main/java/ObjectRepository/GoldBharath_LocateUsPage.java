package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_LocateUsPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//button[@aria-label='Zoom in']") private WebElement ZoomInBtn;
	
	@FindBy (xpath = "//button[@aria-label='Zoom out']") private WebElement ZoomOutBtn;
	
	//Creating A Constructor To Initialize These WebElements
	
	public GoldBharath_LocateUsPage(WebDriver Driver) 
	{
		PageFactory.initElements(Driver,this);
	}

	//Using Getters To Get Those WebElements
	
	public WebElement getZoomInBtn() 
	{
		return ZoomInBtn;
	}

	public WebElement getZoomOutBtn() 
	{
		return ZoomOutBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need

}
