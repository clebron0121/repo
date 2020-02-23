package testing1;

import org.testng.annotations.Test;

import com.pages.home;
import com.pages.idMAN;

import Common.browsers;

import org.testng.annotations.DataProvider;

public class NegTest extends browsers {
  @Test(dataProvider = "signIn")
  public void f(String n, String s) {
	  home hm = new home(driver);
		hm.clickSignin();

		idMAN email = new idMAN(driver);
		email.enterEmail(n);
		email.clickCont();
  }

  @DataProvider
  public Object[][] signIn() {
    return new Object[][] {
      new Object[] { "abc123@gmail.com", "a" },
      new Object[] { "derfg3456@gmail.com", "b" },
    };
  }
}
