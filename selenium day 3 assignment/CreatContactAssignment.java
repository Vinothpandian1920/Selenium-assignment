package week3.day4selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatContactAssignment {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		// launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//  Enter UserName 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		// Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		  // Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		  //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//5. Click on contacts Button
		  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 //6. Click on Create Contact
		   driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		 // 7. Enter FirstName Field Using id Locator
		   driver.findElement(By.id("firstNameField")).sendKeys("pandian");
		 
		 // 8. Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("vinoth");
		 // 9. Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("p");
		 //10. Enter LastName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("v");
		 // 11. Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Teasting Dept");
		 //12. Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Testing field is my work");
		 // 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vinothpandian555@gmail.com");
		 //14. Select State/Province as NewYork Using Visible Text
		 WebElement findElement1= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		  Select state=new Select(findElement1);
		  state.selectByVisibleText("New York");
		 // 15. Click on Create Contact
		 driver.findElement(By.className("smallSubmit")).click();
		 //16. Click on edit button 
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		  //17. Clear the Description Field using .clear
		 driver.findElement(By.name("description")).clear();
		 //18. Fill ImportantNote Field with Any text
		 driver.findElement(By.name("importantNote")).sendKeys("vinoth like RE bike");
		 // 19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// 20. Get the Title of Resulting Page.
		 System.out.println(driver.getTitle());
		 driver.close();

	}

}
