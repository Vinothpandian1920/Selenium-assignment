package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookClassTest {

	public static void main(String[] args) {
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//launch the url
		driver.get ("https://www.facebook.com/");
		// maximize the window
		driver.manage().window().maximize();
		// manage the action time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// click on creat new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//enter first name as vinoth
		driver.findElement(By.name("firstname")).sendKeys("Pandian");
		//enyer the last name as pandian
		driver.findElement(By.name("lastname")).sendKeys("vinoth");
		// enter the phone number 
		driver.findElement(By.name("reg_email__")).sendKeys("9940810382");
		// enter the new passward
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vinoth1920");
		//select the date
		WebElement findElement = driver.findElement(By.name("birthday_day"));
		// syntax for select
		Select SelectName=new Select(findElement);
		SelectName.selectByIndex(22);
		// select month
		WebElement ele = driver.findElement(By.name("birthday_month"));
		Select name=new Select(ele);
		name.selectByValue("5");	
		// select year
		WebElement findElement2 = driver.findElement(By.name("birthday_year"));
		Select name2=new Select(findElement2);
		name2.selectByValue("2000");
		//click on gender
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		// close the browser
		driver.close();
		

	}

}
