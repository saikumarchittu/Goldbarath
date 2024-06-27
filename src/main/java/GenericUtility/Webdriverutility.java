package GenericUtility;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;


    public class Webdriverutility {

	public void maximizewindow(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	public void minimizewindow(WebDriver driver) 
	{
		driver.manage().window().minimize();
	}
	public void back(WebDriver driver) 
	{
		Navigation n=driver.navigate();
		n.back();
	}
	public void Forward(WebDriver driver) 
	{
		Navigation n=driver.navigate();
		n.forward();
	}
	public void refresh(WebDriver driver) 
	{
		Navigation n=driver.navigate();
		n.refresh();
	}
	public void thread(WebDriver driver) throws Exception 
	{
		Thread.sleep(2000);
	}
	public void waitforloadelements(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void waitforelementstovisible(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void handleDropDown(WebElement element,int index) 
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void handleDropDown(WebElement element,String value) 
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	public void handleDropDown(String text,WebElement element) 
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void mouseoveraction(WebDriver driver,WebElement element) 
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void doubleclickaction(WebDriver driver)
	{
	    Actions act=new Actions(driver);
	    act.doubleClick().perform();
	}
	public void doubleclickaction(WebDriver driver,WebElement element) 
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void rightclickaction(WebDriver driver) 
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	public void rightclickaction(WebDriver driver,WebElement element) 
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void draganddropaction(WebDriver driver,WebElement srcelement,WebElement targetelement)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, targetelement);
	}
    public void movetocrosswebpage(WebDriver driver,int xoffset,int yoffset)
    {
    	Actions act=new Actions(driver);
    	act.moveByOffset(xoffset, yoffset).click().perform();
    }
    public void scrolldown(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,1200);");
    }

    public void scrolldown6(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,1300);");
    }
    public void scrolldown1(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,200);");
    }
    public void scrolldown2(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,700);");
    }
    public void scrolldown3(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,500);");
    }
    public void scrolldown4(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,2000);");
    }
    public void scrolldown7(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,1000);");
    }
    
    public void scrolldown5(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,1000);");
    }
    public void scrollup(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,-5000);");
    }
    public void scrollup1(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,-800);");
    }
    public void scrollup2(WebDriver driver) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,-1200);");
    }
    public void scrolldown(WebDriver driver,WebElement element) 
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	int y=element.getLocation().getY();
    	jse.executeScript("window.scrollBy(0,"+y+"):",element);
    }
    public void acceptalert(WebDriver driver)
    {
    	driver.switchTo().alert().accept();
    }
    public void cancelalert(WebDriver driver) 
    {
    	driver.switchTo().alert().dismiss();
    }
    public void sendTexttoAlert(WebDriver driver,String text)
    {
     driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertText(WebDriver driver) 
    {
    return driver.switchTo().alert().getText();
    }
    public void handleFrame(WebDriver driver,int indexid) 
    {
    	driver.switchTo().frame(indexid);
    }
    public void handleFrame(WebDriver driver,String nameorid)
    {
    	driver.switchTo().frame(nameorid);
    }
    public void handleFrame(WebDriver driver,WebElement element)
    {
      driver.switchTo().activeElement();
    }
    public void switchToParentFrame(WebDriver driver) 
    {
    	driver.switchTo().parentFrame();
    }
    public void switchToDefaultPage(WebDriver driver)
    {
    	driver.switchTo().defaultContent();
    }
    public void switchToWindow(WebDriver driver,String partialWinTitle)
    {
    	Set<String> allwindos=driver.getWindowHandles();
    	for(String winid:allwindos) 
    	{
    		String currentTitle=driver.switchTo().window(winid).getTitle();
    		if(currentTitle.contains(partialWinTitle)) {
    			break;
    		}
    	}
    }
//    public void switchtoWindow(WebDriver driver)
//    {
//    	String parentid=driver.getWindowHandle();
//    	Set<String> childid=driver.getWindowHandles();
//    	 for(String allid:childid) {
//    		if(!allid.equals(parentid)) {
//    			driver.switchTo().window(allid);
//    		}
//    	} 
//    }
    public void switchtochildWindow(WebDriver driver,String ParentWindow,Set<String> childWindowSet)
    {
    	  	 for(String allid:childWindowSet) {
    		if(!allid.equals(ParentWindow)) {
    			driver.switchTo().window(allid);
    		}
    	} 
    }
    
    
    public void switchToParentwindow(WebDriver driver,String ParentWindow) {
    	driver.switchTo().window(ParentWindow);
    }
    public String takeScreenShot(WebDriver driver,String methodName) throws Exception
    {
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File(".\\Screenshots\\"+methodName+".png");
    	Files.copy(src, dest);
		return dest.getAbsolutePath();
    }
    }