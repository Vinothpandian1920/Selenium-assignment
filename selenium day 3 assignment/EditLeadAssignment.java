package week3.day4selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadAssignment {

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
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("vinoth");
		//	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='vinoth']")).click();	
		// Verify title of the page
		System.out.println(driver.getTitle());
		//Click Edit
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("testleaf");
		//Click Update
		driver.findElement(By.className("smallSubmit")).click();
		//Confirm the changed name appears
		
		// Close the browser (Do not log out)
		driver.close();

	}

}
