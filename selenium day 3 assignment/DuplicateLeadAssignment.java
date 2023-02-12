package week3.day4selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadAssignment {

	public static void main(String[] args) {
		// launch the browser
		ChromeDriver driver=new ChromeDriver();
		//launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the window
		driver.manage().window().maximize();
		// set action time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// enter the UN as Demosalesmanager
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			// Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		  // Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		  //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//   Click on find Leads 
		driver.findElement(By.linkText("Find Leads")).click();
		//click on email
		driver.findElement(By.linkText("Email")).click();
		//Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("vinothpandian555@gmail.com");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//	Capture name of First Resulting lead
		//Click First Resulting lead
 		driver.findElement(By.xpath("//a[text()='vinoth']")).click();	
     	//		Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
    	//	Verify the title as 'Duplicate Lead'
		String text=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
	    //		Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
	     //		Confirm the duplicated lead name is same as captured name
		
		driver.close();
	//	17	Close the browser (Do not log out)
		

	}

}
