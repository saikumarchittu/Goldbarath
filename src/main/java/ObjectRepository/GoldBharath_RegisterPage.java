package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_RegisterPage {

	     //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
		 @FindBy (xpath = "//input[@formcontrolname='businessName']")private WebElement BuisnessNameEdt;
		 
		 @FindBy (xpath = "//input[@formcontrolname='personName']")private WebElement PersonFullNameEdt;
		 
		 @FindBy (xpath = "//input[@formcontrolname='email']")private WebElement EmailEdt;
		 
		 @FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement PhoneNumberEdt;
		 
		 @FindBy (xpath = "//input[@formcontrolname='establishedDate']")private WebElement ShopEstablishDate;
		 
		 @FindBy (xpath = "//input[@formcontrolname='pincode']")private WebElement PincodeEdt;
		 
		 @FindBy (xpath = "(//input[@formcontrolname='circle'])[4]")private WebElement CircleCheckBox;
		 
		 @FindBy (xpath = "//textarea[@formcontrolname='businessAddress']")private WebElement BuisinessAddressEdt;
		 
		 @FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterBtn;
		 
		 
		 //Creating A Constructor To Initialize These WebElements
		 
		 public GoldBharath_RegisterPage(WebDriver driver)
		 {
			 PageFactory.initElements(driver,this);
		 }
		 
		 
		 //Using Getters To Get Those WebElements
		 
		 public WebElement getBuisnessNameEdt() {
				return BuisnessNameEdt;
			}


			public WebElement getPersonFullNameEdt() {
				return PersonFullNameEdt;
			}


			public WebElement getEmailEdt() {
				return EmailEdt;
			}


			public WebElement getPhoneNumberEdt() {
				return PhoneNumberEdt;
			}


			public WebElement getShopEstablishDate() {
				return ShopEstablishDate;
			}


			public WebElement getPincodeEdt() {
				return PincodeEdt;
			}


			public WebElement getCircleCheckBox() {
				return CircleCheckBox;
			}


			public WebElement getBuisinessAddressEdt() {
				return BuisinessAddressEdt;
			}


			public WebElement getRegisterBtn() {
				return RegisterBtn;
			}
			
			
			//Creating Business Libraries To Perform The Action What We Need
			
		
		    public void givingUserDetails(String bname,String pname,String pemail,String pnum,String dat,String pin)
		    {
		    	BuisnessNameEdt.sendKeys(bname);
				PersonFullNameEdt.sendKeys(pname);
				EmailEdt.sendKeys(pemail);
				PhoneNumberEdt.sendKeys(pnum);
				ShopEstablishDate.sendKeys(dat);
				PincodeEdt.sendKeys(pin);
		    }
		 


		public void givingBuisnessAddress(String badd) {
			CircleCheckBox.click();
			BuisinessAddressEdt.sendKeys(badd);
			RegisterBtn.click();
		 }
}
