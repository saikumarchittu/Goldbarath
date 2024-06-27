package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericUtility.Webdriverutility;

public class GoldBharath_AdminLoginPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//input[@placeholder='Enter User Name']") private WebElement UserNameEdt;
	
	@FindBy (xpath = "//input[@placeholder='Password']") private WebElement PasswordEdt;
	
	@FindBy (xpath = "//button[.='Login']") private WebElement LoginBtn;
	
	//Creating A Constructor To Initialize These WebElements
	
	public GoldBharath_AdminLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Using Getters To Get Those WebElements
	
	public WebElement getUserNameEdt() 
	{
		return UserNameEdt;
	}
	public WebElement getPasswordEdt() 
	{
		return PasswordEdt;
	}
	public WebElement getLoginBtn() 
	{
     	return LoginBtn;
	}
	
	public void loginGoldBharath(WebDriver driver, String UserName,String password) throws Exception 
	{
	   Webdriverutility wu=new Webdriverutility();
	   wu.thread(driver);
	   UserNameEdt.sendKeys(UserName);
	   Thread.sleep(2000);
	   PasswordEdt.sendKeys(password);
	   Thread.sleep(2000);
	   LoginBtn.click();
	}
	
	//Creating Business Libraries To Perform The Action What We Need
	
}
