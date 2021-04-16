package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentLoginPage {
	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.ID, using="userName")
	private WebElement username;
	
	@FindBy(how=How.ID, using="password")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[text()='Login']")
	private WebElement submit;
	
	public StudentLoginPage(RemoteWebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=wait;
		
	}
	
	public void clicksubmit()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	
	}
	
	
	
	
}
