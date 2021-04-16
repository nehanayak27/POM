package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentMarksPage {

	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.NAME, using="telugu-marks")
	private WebElement telgumark;
	
	@FindBy(how=How.NAME, using="hindi-marks")
	private WebElement handimark;
	
	@FindBy(how=How.NAME, using="english-marks")
	private WebElement englishmark;
	
	@FindBy(how=How.NAME, using="maths-marks")
	private WebElement mathsmark;
	
	@FindBy(how=How.NAME, using="science-marks")
	private WebElement sciencesmark;
	
	@FindBy(how=How.NAME, using="social-marks")
	private WebElement socialsmark;
	
	@FindBy(how=How.XPATH, using="//*[@type='submit']")
	private WebElement submit;
	
	@FindBy(how=How.XPATH, using="//*[@value='clear']")
	private WebElement clear;
	
	
	
	public StudentMarksPage(RemoteWebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=wait;
		
	}
	
	public void telgu(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(telgumark)).sendKeys(x);
	
	}
	
	public void english(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(englishmark)).sendKeys(x);
	
	}
	
	public void handi(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(handimark)).sendKeys(x);
	
	}
	
	public void science(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(sciencesmark)).sendKeys(x);
	
	}
	public void social(String x)
	{
		
		wait.until(ExpectedConditions.visibilityOf(socialsmark)).sendKeys(x);
	
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
