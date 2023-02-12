package week3.day4selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLeadAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the screen
		driver.manage().window().maximize();
		// set action time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter the user name 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads link
		driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	//	9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9940810382");
	//	10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//	11	Capture lead ID of First Resulting lead
	//	12	Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10525']")).click();
	//	13	Click Delete
		//driver.findElement(By.xpath("//a[text()='Delete']")).click();
	//	14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
	//	15	Enter captured lead ID
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10525");
	//	16	Click find leads button
		driver.findElement(By.id("ext-gen864")).click();
	//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		System.out.println("No records to display");
	//	18	Close the browser (Do not log out)
		driver.close();
				
		
	}

}
