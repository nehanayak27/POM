package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentDetailAddstdPage {
	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.XPATH, using="//*[text()='Add Student']")
	private WebElement addstudentbuton;
	
	public StudentDetailAddstdPage(RemoteWebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=wait;
	}
	
	public void addstduentbutton()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(addstudentbuton)).click();
	
	}
	
	
	
}
