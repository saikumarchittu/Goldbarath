package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_manageDistributorPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//input[@placeholder='Search']") private WebElement SearchBar;
	@FindBy (xpath = "(//input[@role='switch'])[2]") private WebElement SwitchBtn;
	@FindBy (xpath = "(//i[@class='fa fa-pencil'])[2]") private WebElement PencilEditBtn;
	@FindBy (xpath = "(//i[@class='fa fa-eye'])[2]") private  WebElement EyeBtn;
	@FindBy (xpath = "//button[@class='logout']") private WebElement LogoutBtn;
	@FindBy (xpath = "(//a[@class='ng-star-inserted'])[1]") private WebElement PreviousBtn;
	@FindBy (xpath = "(//a[@class='ng-star-inserted'])[2]") private WebElement NextBtn;
	@FindBy (xpath = "(//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted'])[1]") private WebElement VerticalIcon;
	@FindBy (xpath = "//span[.='Dashboard']") private WebElement DashBoardBtn;
	@FindBy (xpath = "//span[.='Distributor Manage Order']") private WebElement DistributorManageOrderBtn;
	
	//Creating A Constructor To Initialize These WebElements
	
	public GoldBharath_manageDistributorPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Using Getters To Get Those WebElements
	
	public WebElement getSearchBar() 
	{
		return SearchBar;
	}
	public WebElement getSwitchBtn() 
	{
		return SwitchBtn;
	}
	public WebElement getPencilEditBtn() 
	{
		return PencilEditBtn;
	}
	public WebElement getEyeBtn() 
	{
		return EyeBtn;
	}
	public WebElement getLogoutBtn() 
	{
		return LogoutBtn;
	}
	public WebElement getPreviousBtn() 
	{
		return PreviousBtn;
	}
	public WebElement getNextBtn() 
	{
		return NextBtn;
	}
	public WebElement getVerticalIcon() 
	{
		return VerticalIcon;
	}

	public WebElement getDashBoardBtn() 
	{
		return DashBoardBtn;
	}

	public WebElement getDistributorManageOrderBtn() 
	{
		return DistributorManageOrderBtn;
	}
	
	
	//Creating Business Libraries To Perform The Action What We Need
	
	
	
}
