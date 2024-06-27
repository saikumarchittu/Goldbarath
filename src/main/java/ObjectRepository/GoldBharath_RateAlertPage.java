package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_RateAlertPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "//select[@formcontrolname='order_type']") private WebElement OrderTypeDropDown;
	
	@FindBy (xpath = "//option[.='Select']") private WebElement SelectOpt;
	
	@FindBy (xpath = "//option[.='Spot Gold']") private WebElement SpotGoldOpt;
	
	@FindBy (xpath = "//option[.='Spot Silver']") private WebElement SpotSilverOpt;
	
	@FindBy (xpath = "//input[@formcontrolname='book_rate']") private WebElement RateEdt;
	
	@FindBy (xpath = "//button[.=' Create Rate Alert']") private WebElement CreateRateAlertBtn;

	//Creating A Constructor To Initialize These WebElements
	
	public GoldBharath_RateAlertPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Using Getters To Get Those WebElements
	
	public WebElement getOrderTypeDropDown() 
	{
		return OrderTypeDropDown;
	}
	public WebElement getSelectOpt() 
	{
		return SelectOpt;
	}
	public WebElement getSpotGoldOpt() 
	{
		return SpotGoldOpt;
	}
	public WebElement getSpotSilverOpt() 
	{
		return SpotSilverOpt;
	}
	public WebElement getRateEdt() 
	{
		return RateEdt;
	}
	public WebElement getCreateRateAlertBtn() 
	{
		return CreateRateAlertBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
	
	
}
