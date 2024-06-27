package ObjectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Base;
import GenericUtility.Webdriverutility;


public class DashBoardPage extends Base{
	@FindBy (xpath = "//button[.=' Register ']")private WebElement register;
	@FindBy (xpath = "//button[.='Login']")private WebElement login;
	@FindBy (xpath = "//li[.='About Us']")private WebElement aboutus;
	@FindBy (xpath = "//li[.=' Booking ']")private WebElement booking;
	@FindBy (xpath = "//li[.=' Chart ']")private WebElement chart;
	@FindBy (xpath = "//li[.=' Live Rates ']")private WebElement liverates;
	@FindBy (xpath = "//li[.=' Locate Us ']")private WebElement locate;
	@FindBy (xpath = "//li[.=' Margin ']")private WebElement margin;
	@FindBy (xpath = "//li[.=' Privacy Policy ']")private WebElement privacypolicy;
	@FindBy (xpath = "//li[.='Products']")private WebElement products;
	@FindBy (xpath = "//li[.=' Rate Alert ']")private WebElement rate;
	@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement xyug;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getLogin() {
		return login;
	}	
	public WebElement getAboutus() {
		return aboutus;
	}
	public WebElement getBooking() {
		return booking;
	}
	public WebElement getChart() {
		return chart;
	}
	public WebElement getPrivatepolicy() {
		return privacypolicy;
	}
	 public WebElement getLiverates() {
			return liverates;
		}
	 public WebElement getLocate() {
			return locate;
		}
	 public WebElement getMargin() {
			return margin;
		}
	 public WebElement getProducts() {
			return products;
		}
	 public WebElement getRate() {
			return rate;
		}
	public WebElement getPrivacypolicy() {
		return privacypolicy;
	}
	public WebElement getXyug() {
		return xyug;
	}
	public void clickregister() {
		register.click();
	}
	public void clicklogin() {
		login.click();
	}
	public void clickRegister(WebDriver driver) throws Exception {
	     Webdriverutility wu=new Webdriverutility();
		wu.scrolldown(driver);
		wu.thread(driver);
		register.click();
		}
	public void dashboardAllActions(WebDriver driver) throws Exception {
		Webdriverutility wu=new Webdriverutility();
		Thread.sleep(2000);
		liverates.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Live Rates");
		Thread.sleep(2000);
		aboutus.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "About Us");
		Thread.sleep(2000);
		products.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Products");
		Thread.sleep(2000);
		locate.click();
		Thread.sleep(4000);
		wu.waitforloadelements(driver);
		wu.takeScreenShot(driver, "Locate Us");
		Thread.sleep(2000);
		privacypolicy.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Privacy_Policy");
		Thread.sleep(2000);
	    chart.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Chart");
		Thread.sleep(5000);
	    margin.click();
		Thread.sleep(1000);
		wu.takeScreenShot(driver, "Margin");
		Thread.sleep(5000);
		rate.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Rate_Alert");
		Thread.sleep(2000);
		booking.click();
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "Booking");
		
		
		
    }
//	public void clickbooking(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//        booking.click();
//        wu.takeScreenShot(driver, "booking");
//        wu.thread(driver);
//	}
//	public void clickChart(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		chart.click();
//		wu.takeScreenShot(driver, "Chart");
//		wu.thread(driver);
//	}
//	public void clickliveRates(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		liverates.click();
//		wu.takeScreenShot(driver, "Live Rates");
//		wu.thread(driver);
//	}
//	public void clickLocateUs(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		locate.click();
//		wu.thread(driver);
//		wu.takeScreenShot(driver, "Locate Us");
//		wu.thread(driver);
//	}
//	public void clickMargin(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		margin.click();
//		wu.takeScreenShot(driver, "Margin Page");
//		wu.thread(driver);
//	}
//	public void clickPrivacyPolicy(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//	    privacypolicy.click();
//		wu.takeScreenShot(driver, "Privacy_Policy");
//		wu.thread(driver);
//	}
//	public void clickProducts(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		products.click();
//		wu.takeScreenShot(driver, "Products");
//		wu.thread(driver);
//	}
//	public void clickRateAlert(WebDriver driver) throws Exception {
//		Webdriverutility wu=new Webdriverutility();
//		rate.click();
//		wu.takeScreenShot(driver, "Rate_Alert");
//		wu.thread(driver);
//	}
}