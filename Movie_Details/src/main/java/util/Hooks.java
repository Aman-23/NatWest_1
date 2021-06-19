package util;

import java.io.IOException;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	@Before
	public  void setUpBrowser() throws IOException {
		initialization();
	}
	
	@After
	public void deriver_close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
