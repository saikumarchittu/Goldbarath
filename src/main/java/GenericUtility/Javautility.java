package GenericUtility;

import java.util.Date;
import java.util.Random;

public class Javautility {

	 public int getrandomnumber() {
		 Random r=new Random();
		 int random=r.nextInt(10000);
		 return random;
	 }
	 public String getsystemdate() {
		 Date d=new Date();
		 String value=d.toString();
		 return value;
	 }
	 public String getsysteminformat() {
		 Date d=new Date();
		 String[] date=d.toString().split(" ");
		 String currentDate=date[2];
		 String month=date[1];
		 String year=date[5];
		 String time=date[3].replace(":","_");
		 String dateinformat=currentDate+"_"+month+"_"+year+"_"+time;
		 return dateinformat;
	 }
}
