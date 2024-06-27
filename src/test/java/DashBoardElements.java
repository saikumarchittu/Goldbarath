import org.testng.annotations.Test;
import GenericUtility.Base;
import ObjectRepository.DashBoardPage;


public class DashBoardElements extends Base{
    @Test
	public void performAllOperations() throws Exception {
		DashBoardPage dp=new DashBoardPage(driver);
		dp.dashboardAllActions(driver);
	}
}
