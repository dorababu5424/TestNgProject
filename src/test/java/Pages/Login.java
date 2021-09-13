package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.BaseClassFinder;



public class Login {
	
	
	public WebDriver driver = TestCases.BaseClass.driver;
	
	public Login() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name ="email")
	private WebElement UserName;
	
	@FindBy(name ="password")
	private WebElement PassWord;
	
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement LoginButton;
	
	public  void SetUserName(String UName) {
		// TODO Auto-generated method stub
		UserName.sendKeys(UName);
	}
	
	public void SetPassword(String Passw) {
		
		PassWord.sendKeys(Passw);
	}
	
	public void LoginBttClick() {
		// TODO Auto-generated method stub
		
		LoginButton.click();

	}
	
	
}
