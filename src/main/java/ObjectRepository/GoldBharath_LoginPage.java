package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_LoginPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations   
	
	     @FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement EnterYourNumberEdt;
		 
		 @FindBy (xpath = "//button[.='Login']")private WebElement LoginBtn;
		 
		 @FindBy (xpath = "//span[.='Register']")private WebElement RegisterLnk;
		 
	//Creating A Constructor To Initialize These WebElements	
		 
		 public GoldBharath_LoginPage(WebDriver driver)
		 {
			 PageFactory.initElements(driver,this);
		 }
   //Using Getters To Get Those WebElements
		 
		 public WebElement getEnterYourNumberEdt() 
		    {
				return EnterYourNumberEdt;
			}	
			public WebElement getLoginBtn() {
				return LoginBtn;
			}
			public WebElement getRegisterLnk() {
				return RegisterLnk;
			}
			
   //Creating Business Libraries To Perform The Action What We Need
			

		public void loginOperation(String pnum)
		   {
			EnterYourNumberEdt.sendKeys(pnum);
			 LoginBtn.click(); 
		   }
}