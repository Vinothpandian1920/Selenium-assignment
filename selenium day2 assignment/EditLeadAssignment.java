package week3.day4selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//provide action time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the window
		driver.manage().window().maximize();
		//Enter the UN as Demosalesmanager
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(" Demosalesmanager");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter the passward 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click CRM/SFA line
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads link
		driver.findElement(By.linkText("Leads")).click();
		
          //  Click on Create Lead 
			driver.findElement(By.partialLinkText("Creat")).click();
			 // Enter CompanyName Field Using id Locator
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
			  //Enter FirstName Field Using id Locator
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
			  // Enter LastName Field Using id Locator
			  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pandian");
			  		  // Enter FirstName(Local) Field Using id Locator
			  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("V");
			  // Enter Department Field Using any Locator of Your Choice
			  driver.findElement(By.name("departmentName")).sendKeys("Testing Team");
			  // Enter Description Field Using any Locator of your choice 
			  driver.findElement(By.id("createLeadForm_description")).sendKeys("nill");
			  // Enter your email in the E-mail address Field using the locator of your choice
			  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinoth555@gmail.com");		  
			  // Select State/Province as NewYork Using Visible Text
			  WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			  Select SelectName=new Select(findElement);
			  SelectName.selectByVisibleText("New York");
			  // Click on Create Button
	 driver.findElement(By.name("submitButton")).click();
			  // Click on edit button
			  driver.findElement(By.xpath("//a[text()='Edit']")).click();
        //      17. Clear the Description Field using .clear()
			 driver.findElement(By.id("updateLeadForm_description")).clear();
	 // 18. Fill ImportantNote Field with Any text
			  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("vinoth like RE bike");
	//  19. Click on update button 
			  driver.findElement(By.className("smallSubmit")).click();
	//  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
			  System.out.println(driver.getTitle());

		
		
		
		
		
	
	}

}
