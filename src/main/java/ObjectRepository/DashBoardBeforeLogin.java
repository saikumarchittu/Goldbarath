package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardBeforeLogin {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	 @FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterBtn;
			
	 @FindBy (xpath = "//button[.='Login']")private WebElement LoginBtn;
	 
	 //Create a constructor to initialize these WebElements
	 
	 public DashBoardBeforeLogin(WebDriver driver) 
	 {
			PageFactory.initElements(driver,this);
	 }
		
    //Using Getters To Get Those WebElements
		
     public WebElement getRegisterBtn() 
     {
		 return RegisterBtn;
	 }
	 public WebElement getLoginBtn() 
	 {
		 return LoginBtn;
	 }
	 
	 //Business Library
}
