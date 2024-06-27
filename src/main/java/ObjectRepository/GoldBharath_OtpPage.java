package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_OtpPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	 @FindBy (xpath = "(//input[@type='text'])[1]")private WebElement OtpVerificationEdt;
	 
	//Creating A Constructor To Initialize These WebElements
	 
	 public GoldBharath_OtpPage(WebDriver driver) 
	 {
	    PageFactory.initElements(driver,this);	 
	 }

	//Using Getters To Get Those WebElements
	 
	public WebElement getOtpVerificationEdt() {
		return OtpVerificationEdt;
	}
	
	 //Creating Business Libraries To Perform The Action What We Need
	
	public void enterOtp(String validotp)
	   {
		OtpVerificationEdt.sendKeys(validotp);
	   }
}
