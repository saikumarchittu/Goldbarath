package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class GoldBharath_AdminDashBoard     {

    //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
    	
	@FindBy (xpath = "//span[.='Dashboard']") private WebElement DashBoardBtn;
    @FindBy (xpath = "//span[.='Manage Distributor']") private WebElement ManageDistributorBtn;
    @FindBy (xpath = "//span[.='Distributor Manage Order']") private WebElement DistributorManageOrderBtn;
    @FindBy (xpath = "//button[@class='logout']") private WebElement LogoutBtn;
    @FindBy (xpath = "//p[.=' Manage']") private WebElement ManageBtn;
    @FindBy (xpath = "(//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted'])[1]") private WebElement VerticalIcon;
    
    //Creating A Constructor To Initialize These WebElements
    
    public GoldBharath_AdminDashBoard(WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
    }

    //Using Getters To Get Those WebElements
    
	public WebElement getDashBoardBtn() 
	{
		return DashBoardBtn;
	}
	public WebElement getManageDistributorBtn() 
	{
		return ManageDistributorBtn;
	}
	public WebElement getDistributorManageOrderBtn() 
	{
		return DistributorManageOrderBtn;
	}
	public WebElement getLogoutBtn() 
	{
		return LogoutBtn;
	}
	public WebElement getManageBtn() 
	{
		return ManageBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
	
	
}
