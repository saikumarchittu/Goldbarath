package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

     public class Base  
     {
     public ReadPropertyFile rp=new ReadPropertyFile();
     Propertyutility pu=new Propertyutility();
     public WebDriver driver;
     Webdriverutility wu=new Webdriverutility();
     public static WebDriver sdriver;
     
     
     @BeforeSuite
     public void bsconfig()  
     {
     	 System.out.println("===DB connection successfully===");
     } 
     @BeforeClass
     public void bcconfig() throws Exception
     {
     	 String BROWSER=pu.getDataFromproperty("browser");
     	 String URL=pu.getDataFromproperty("testurl");
     	 if(BROWSER.equals("Chrome"))
     	 {
     		 WebDriverManager.chromedriver().setup();
     		 driver=new ChromeDriver();
     		 System.out.println(BROWSER+"browser launched successfully");
     	 }
     	 else
     		 if(BROWSER.equals("Firefox")){
     		 WebDriverManager.firefoxdriver().setup();
     		 driver =new FirefoxDriver();
     		 System.out.println(BROWSER+"browser launched successfully");
     	 }
     		 else {
     			 System.out.println("invalid browser");
     		 }
     	 wu.maximizewindow(driver);
 		wu.waitforloadelements(driver);
 		sdriver=driver;
 		driver.get(URL);
     }
     @BeforeMethod
     public void bmconfig() throws Exception 
     {
    /*	 Excelutility eu=new Excelutility();
    	String UserName=eu.getdataFromExcel("Sheet2", 20, 2);
    	 String Password=eu.getdataFromExcel("Sheet2", 21, 2);
    	 
    	 GoldBharath_AdminLoginPage gba=new GoldBharath_AdminLoginPage(driver);
    	 gba.loginGoldBharath(driver, UserName,Password);
    	 */
    	 System.out.println("===launched Successfully===");
     }
     @AfterMethod
     public void amconfig() 
     {
    	 System.out.println("===Closed Successfully===");
     }
    @AfterClass
    public void acConfig() 
    {
    	driver.quit();
    	System.out.println("===Browser Closed Successfully===");
    }
    @AfterSuite
    public void asConfig() 
    {
    	System.out.println("===DB Connetion Closed Successfully===");
    }
} 