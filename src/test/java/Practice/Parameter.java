package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	
	
	public void parameterclickhere(RemoteWebDriver driver)
	{
		for(int i=1;i<3;i++)
		{		
			//driver.findElement(By.xpath("//*[@onclick='showStudentMarks("+i+")']")).click();
			driver.findElement(By.name("telugu-marks")).sendKeys("78");
			driver.findElement(By.name("hindi-marks")).sendKeys("87");
			driver.findElement(By.name("english-marks")).sendKeys("67");
			driver.findElement(By.name("maths-marks")).sendKeys("77");
			driver.findElement(By.name("science-marks")).sendKeys("89");
			driver.findElement(By.name("social-marks")).sendKeys("86");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			driver.findElement(By.id(""));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter p=new Parameter();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://twhyderabad.github.io/demo_site/");
		//driver.findElement(By.id("Name")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
		
		
	}

}
