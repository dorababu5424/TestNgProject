package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import config.ReadProperities;

public class BaseClass {
	
	public static WebDriver driver;
	public ReadProperities Rp;
	
	
	@BeforeClass
	private void SetUp() throws IOException {
		// TODO Auto-generated method stub
		Rp = new ReadProperities();
		
		
		System.setProperty("webdriver.chrome.driver",Rp.ReadData("ChromePath"));
		driver = new ChromeDriver();
		driver.get(Rp.ReadData("URL"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	private void TearDown() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	
	
	
}
