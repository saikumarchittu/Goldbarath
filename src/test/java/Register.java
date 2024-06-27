import org.testng.annotations.Test;
import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.DashBoardPage;
import ObjectRepository.GoldBharath_Register;

public class Register extends Base{

	@Test
	public void createRegister() throws Exception {
		DashBoardPage dp=new DashBoardPage(driver);
		Webdriverutility wu=new Webdriverutility();
		GoldBharath_Register gr=new GoldBharath_Register(driver);
		dp.clickregister();
		gr.EnterRegisterDetails(driver);
		wu.thread(driver);
		gr.EnterBusinessAddress(driver);
	}
}