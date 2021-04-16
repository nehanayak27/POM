package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterStudentDetailPage {
	
	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.ID, using="name")
	private WebElement textbox;
	
	@FindBy(how=How.XPATH, using="//*[@id='class' and @class='btn btn-primary dropdown-toggle']")
	private WebElement dropdown;
	
	@FindBy(how=How.ID, using="roll-number")
	private WebElement rollno;
	
	@FindBy(how=How.XPATH, using="//*[text()='Female']")
	private WebElement gender;
	
	@FindBy(how=How.XPATH, using="//*[@type='submit']")
	private WebElement submit;
	
	@FindBy(how=How.XPATH, using="//*[@value='clear']")
	private WebElement clear;
	
	
	
	//create constructor method
	
	public EnterStudentDetailPage(RemoteWebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=wait;
		
	}
	
	//operational method
	
	public void entername(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(textbox)).sendKeys(x);
	
	}
	
	
	public void clickdropdown(String x)
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
		Select s=new Select(dropdown);
		s.selectByVisibleText(x);
		
	}
	
	public void enterollno(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(rollno)).sendKeys(x);
	
	}
	
	public void clickgender()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
	
	}
	
	public void clicksubmit()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	
	}
	public void clear()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(clear)).click();
	
	}
	
	

}
