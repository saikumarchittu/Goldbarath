package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_MarginPage {
	
	 //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//label[.='Select Type']") private WebElement SelectTypeOpt;
	
	@FindBy (xpath = "//select[@class='my-select-gold']") private WebElement MySelectGoldDropDown;
	
	@FindBy (xpath = "//option[.='Select']") private WebElement SelectOpt;
	
	@FindBy (xpath = "//option[.='Gold Margin']") private WebElement GoldMarginOpt;
	
	@FindBy (xpath = "//option[.='Silver Margin']") private WebElement SilverMarginOpt;
	 
//    @FindBy (xpath = "(//div[@class='ng-star-inserted'])[2]") private WebElement IntrestedPage;
//    
//    @FindBy (xpath = "//p[.='Total Margin : 0 ']") private WebElement TotalMarginOpt;
//    
//    @FindBy (xpath = "//p[.='Used Margin : 0']") private WebElement UsedMarginOpt;
//    
//    @FindBy (xpath = "//p[.='Available Margin : 0 ']") private WebElement AvailableMarginOpt;
//    
//    @FindBy (xpath = "//p[.='Fixed Margin : 0 ']") private WebElement FixedMargingOpt;
//    
//    @FindBy (xpath = "//p[.='Creadit Margin : 0 ']") private WebElement CreaditMarginOpt;
//    
//    @FindBy (xpath = "//p[.='Free Margin : 0 ']") private WebElement FreeMarginOpt;
    
	
	//Creating A Constructor To Initialize These WebElements
	
    public GoldBharath_MarginPage(WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
	}

    //Using Getters To Get Those WebElements
    
	public WebElement getSelectTypeOpt() 
	{
		return SelectTypeOpt;
	}
	public WebElement getMySelectGoldDropDown() 
	{
		return MySelectGoldDropDown;
	}
	public WebElement getSelectOpt() 
	{
		return SelectOpt;
	}
	public WebElement getGoldMarginOpt() 
	{
		return GoldMarginOpt;
	}
	public WebElement getSilverMarginOpt() 
	{
		return SilverMarginOpt;
	}
    
	//Creating Business Libraries To Perform The Action What We Need
    
}
