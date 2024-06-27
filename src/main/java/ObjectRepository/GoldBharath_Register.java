package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericUtility.Excelutility;
import GenericUtility.Webdriverutility;

public class GoldBharath_Register {

	@FindBy (xpath = "//input[@formcontrolname='businessName']") private WebElement BusinessNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='personName']") private WebElement PersonNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='email']") private WebElement EmailEdt;
	@FindBy (xpath = "//input[@formcontrolname='phone']") private WebElement PhoneNumberEdt;
	@FindBy (xpath = "//input[@formcontrolname='establishedDate']") private WebElement DateEdt;
	@FindBy (xpath = "//input[@formcontrolname='pincode']") private WebElement PinCodeEdt;
	@FindBy (xpath = "(//input[@formcontrolname='circle'])[1]") private WebElement RadioBtn;
	@FindBy (xpath = "//button[.=' Register ']") private WebElement RegisterBtn;
	@FindBy (xpath = "//textarea[@formcontrolname='businessAddress']") private WebElement BusinessAddressEdt;
	
	public GoldBharath_Register(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getBusinessNameEdt() 
	{
		return BusinessNameEdt;
	}
	public WebElement getPersonNameEdt() 
	{
		return PersonNameEdt;
	}
	public WebElement getEmailEdt() 
	{
		return EmailEdt;
	}
	public WebElement getPhoneNumberEdt() 
	{
		return PhoneNumberEdt;
	}
	public WebElement getDateEdt() 
	{
		return DateEdt;
	}
	public WebElement getPinCodeEdt() 
	{
		return PinCodeEdt;
	}
	public WebElement getRegisterBtn() 
	{
		return RegisterBtn;
	}
	public WebElement getRadioBtn() 
	{
		return RadioBtn;
	}
	public WebElement getBusinessAddressEdt() 
	{
		return BusinessAddressEdt;
	}

	public void EnterRegisterDetails(WebDriver driver) throws Exception 
	{
		Webdriverutility wu=new Webdriverutility();
		wu.waitforloadelements(driver);
		Excelutility eu=new Excelutility();
		String BName=eu.getdataFromExcel("GoldBharath", 5, 2);
		String PName=eu.getdataFromExcel("GoldBharath", 6, 2);
		String emailid=eu.getdataFromExcel("GoldBharath", 7, 2);
		String Num=eu.getdataFromExcel("GoldBharath", 8, 2);
		String date=eu.getdataFromExcel("GoldBharath", 9, 2);
		String Pin=eu.getdataFromExcel("GoldBharath", 10, 2);
		
		
		BusinessNameEdt.sendKeys(BName);
        PersonNameEdt.sendKeys(PName);
        EmailEdt.sendKeys(emailid);
        PhoneNumberEdt.sendKeys(Num);
        DateEdt.sendKeys(date);
        PinCodeEdt.sendKeys(Pin);
        wu.scrolldown3(driver);
        RadioBtn.click();
        wu.thread(driver);
        wu.scrolldown3(driver);
       
	}
	public void EnterBusinessAddress(WebDriver driver) throws Exception {
		Webdriverutility wu=new Webdriverutility();
		Excelutility eu=new Excelutility();
		wu.waitforloadelements(driver);
		String Badd=eu.getdataFromExcel("GoldBharath", 11, 2);
		BusinessAddressEdt.sendKeys(Badd);
		wu.thread(driver);
		RegisterBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Register_Error_Msg");
	}
}