package testing1;

import org.testng.annotations.Test;

import com.pages.home;
import com.pages.idMAN;
import com.pages.pass;

import Common.browsers;

public class Run extends browsers {

	@Test
	public void login() {

		home hm = new home(driver);
		hm.clickSignin();

		idMAN email = new idMAN(driver);
		email.enterEmail("shergirl2324@gmail.com");
		email.clickCont();

		pass pw = new pass(driver);
		pw.enterPass("girlpower454");
		pw.clickloginBt();
		
	}

}
