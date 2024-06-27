package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_DistributiorManageOrderPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations

	@FindBy (xpath = "//button[.='Buy Order']") private WebElement BuyOrderBtn;
	@FindBy (xpath = "//button[.='Book Order']") private WebElement BookOrderBtn;
	@FindBy (xpath = "//input[@placeholder='Search']") private WebElement SearchBar;
	@FindBy (xpath = "//button[@class='logout']") private WebElement LogoutBtn;
	@FindBy (xpath = "//span[.='Dashboard']") private WebElement DashBoardBtn;
	@FindBy (xpath = "//span[.='Manage Distributor']") private WebElement ManageDistributorBtn;
	@FindBy (xpath = "(//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted'])[1]") private WebElement VerticalIcon;
	@FindBy (xpath = "(//a[@class='ng-star-inserted'])[6]") private WebElement NextBtn;
	@FindBy (xpath = "(//a[@class='ng-star-inserted'])[1]") private WebElement PreviousBtn;
	 
	//Creating A Constructor To Initialize These WebElements
	
	public GoldBharath_DistributiorManageOrderPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Using Getters To Get Those WebElements
	
	public WebElement getBuyOrderBtn() 
	{
		return BuyOrderBtn;
	}
	public WebElement getBookOrderBtn() 
	{
		return BookOrderBtn;
	}
	public WebElement getSearchBar() 
	{
		return SearchBar;
	}
	public WebElement getLogoutBtn() 
	{
		return LogoutBtn;
	}
	public WebElement getDashBoardBtn() 
	{
		return DashBoardBtn;
	}
	public WebElement getManageDistributorBtn() 
	{
		return ManageDistributorBtn;
	}
	public WebElement getVerticalIcon() 
	{
		return VerticalIcon;
	}
	public WebElement getNextBtn() 
	{
		return NextBtn;
	}
	public WebElement getPreviousBtn() 
	{
		return PreviousBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need

}