package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBankClassTest {

	public static void main(String[] args) {
		// launch the browser
			ChromeDriver driver=new ChromeDriver();
		//launch the url
		driver.get ("https://uibank.uipath.com/register-account");
		// maximize the window
		driver.manage().window().maximize();
		// manage the action time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// enter your name
		driver.findElement(By.id("firstName")).sendKeys("vinoth");
		// enter tytle
		WebElement findElement = driver.findElement(By.xpath("//select[@id='title']"));
		 Select selectTitle=new   Select(findElement);
		 selectTitle.selectByVisibleText("Mr");
		 //enter intial
		 driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("S");
		 // Enter your last name
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("pandian");
		 // select Gender
		 WebElement findElement2 = driver.findElement(By.xpath("//select[@id='sex']"));
		 Select selectGender=new Select(findElement2);
		 selectGender.selectByVisibleText("Male");
		 // select employement status
		 WebElement findElement3 = driver.findElement(By.xpath("//select[@id='maritalStatus']"));
		 Select selectStatus=new   Select(findElement3);
		 selectStatus.selectByVisibleText("Single");
		 // enter un
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinoth");
		 // enter password
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vinoth@123");
		 // enter emailid
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinoth555@gmail.com");
		 // close the browser
		 driver.close();
		 
		 
		 
		

	}

}
