package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_Chartpage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "(//select[@class='my-select'])[1]") private WebElement MySelectDropDown;
	
	@FindBy (xpath = "(//option[.='Select'])[1]") private  WebElement Select1Opt;
	
	@FindBy (xpath = "//option[.='15 Minute']") private WebElement Minute15Opt;
	
	@FindBy (xpath = "//option[.='30 Minute']") private WebElement Minute30Opt;
	
	@FindBy (xpath = "//option[.='1 Day']") private WebElement Day1Opt;
	
	@FindBy (xpath = "(//select[@class='my-select'])[2]") private WebElement MySelect1DropDown;
	
	@FindBy (xpath = "(//option[.='Select'])[2]") private WebElement SelectOpt;
	
	@FindBy (xpath = "//option[.='Gold (24Carat)']") private WebElement Gold24Carat;
	
	@FindBy (xpath = "//option[.='Gold (22Carat)']") private WebElement Gold22CaratOpt;
	
	@FindBy (xpath = "//option[.='Silver']") private WebElement SilverOpt;
	
	//Creating A Constructor To Initialize These WebElement
	
	public GoldBharath_Chartpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

    //Using Getters To Get Those WebElements
	
	public WebElement getMySelectDropDown() 
	{
		return MySelectDropDown;
	}
	public WebElement getSelect1Opt() 
	{
		return Select1Opt;
	}
	public WebElement getMinute15Opt() 
	{
		return Minute15Opt;
	}
	public WebElement getMinute30Opt() 
	{
		return Minute30Opt;
	}
	public WebElement getDay1Opt() 
	{
		return Day1Opt;
	}
	public WebElement getMySelect1DropDown() 
	{
		return MySelect1DropDown;
	}
	public WebElement getSelectOpt() 
	{
		return SelectOpt;
	}
	public WebElement getGold24Carat() 
	{
		return Gold24Carat;
	}
	public WebElement getGold22CaratOpt() 
	{
		return Gold22CaratOpt;
	}
	public WebElement getSilverOpt() 
	{
		return SilverOpt;
	}
	
	//Business Library	
}
