package com.easytrack.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignModule {
	
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("CampaignModule created",true);
	}
	

}
