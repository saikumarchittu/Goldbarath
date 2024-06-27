package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class BusinessKycPage {

	 //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations   
	   
	@FindBy (xpath = "//select[@class='my-select']") private WebElement SelectTypeDropDown;
	
	@FindBy (xpath = "//option[.='Proprietor']") private WebElement PropretorOption; 
	
	@FindBy (xpath = "//option[.='LLP']") private WebElement Llpoption;
	
	@FindBy (xpath = "//option[.='Pvt LTD']") private WebElement PvtLtdoption;
	
	@FindBy (xpath = "//option[.='LTD']") private WebElement LtdOption;
	
	@FindBy (xpath = "//input[@formcontrolname='proprietor_name']") private WebElement ProprietorNameEdt;
	
	@FindBy (xpath = "//input[@formcontrolname='proprietor_pan']") private WebElement ProprietorPanEdt;
	
	@FindBy (xpath = "//input[@formcontrolname='proprietor_pan_image']") private WebElement UploadPanImg;
	
	@FindBy (xpath = "//input[@formcontrolname='proprietor_gst']") private WebElement ProprietorGstEdft;
	
	@FindBy (xpath = "//input[@formcontrolname='proprietor_gst_image']") private WebElement UploadProprietorGstImg;
	
	@FindBy (xpath = "//input[@formcontrolname='bank_name']") private WebElement properitorBankName;
	
	@FindBy (xpath = "//input[@formcontrolname='account_number']") private WebElement ProperitorAccountNumberEdt;
	
	@FindBy (xpath = "//input[@formcontrolname='ifsc_code']") private WebElement IfscCodeEdt;
	
	@FindBy (xpath = "//input[@formcontrolname='account_holder_name']") private WebElement AccountHoldernameEdt;
	
	@FindBy (xpath = "//button[.='Submit']") private WebElement SubmitBtn;
	
    @FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GooglePlayLnk;
	
	@FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStroreLnk;
	
	@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement Xyug;
     
	@FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement Linkeinlnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLnk;
	
	//Creating A Constructor To Initialize These WebElements
	
	public BusinessKycPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
   
	//Using Getters To Get Those WebElements
	
	public WebElement getSelectTypeDropDown() 
	{
		return SelectTypeDropDown;
	}
	public WebElement getPropretorBtn() 
	{
		return PropretorOption;
	}
	public WebElement getLlpBtn() 
	{
		return LtdOption;
	}
	public WebElement getPvtLtdBtn() 
	{
		return PvtLtdoption;
	}
	public WebElement getLtdBtn() 
	{
		return LtdOption;
	}
	public WebElement getProprietorNameEdt() 
	{
		return ProprietorNameEdt;
	}
	public WebElement getProprietorPanEdt() 
	{
		return ProprietorPanEdt;
	}
	public WebElement getUploadPanImg() 
	{
		return UploadPanImg;
	}
	public WebElement getProprietorGstEdft() 
	{
		return ProprietorGstEdft;
	}
	public WebElement getUploadProprietorGstImg() 
	{
		return UploadProprietorGstImg;
	}
	public WebElement getProperitorBankName() 
	{
		return properitorBankName;
	}
	public WebElement getProperitorAccountNumberEdt() 
	{
		return ProperitorAccountNumberEdt;
	}
	public WebElement getIfscCodeEdt() 
	{
		return IfscCodeEdt;
	}
	public WebElement getAccountHoldernameEdt() 
	{
		return AccountHoldernameEdt;
	}
	public WebElement getSubmitBtn() 
	{
		return SubmitBtn;
	}
	public WebElement getGooglePlayLnk() 
	{
		return GooglePlayLnk;
	}
	public WebElement getAppStroreLnk() 
	{
		return AppStroreLnk;
	}
	public WebElement getXyug() 
	{
		return Xyug;
	}
	public WebElement getFacebookLnk() 
	{
		return FacebookLnk;
	}
	public WebElement getInstagramLnk() 
	{
		return InstagramLnk;
	}
	public WebElement getLinkeinlnk() 
	{
		return Linkeinlnk;
	}
	public WebElement getTwitterLnk() 
	{
		return TwitterLnk;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
}