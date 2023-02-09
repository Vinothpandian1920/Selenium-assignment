package week3.day3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the screen
		driver.manage().window().maximize();
		//enter the user name 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//verify the page 
		String text= driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.partialLinkText("Creat")).click();
		//enter on company name as TCS
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		//enter the first name as Vinoth 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		// Enter the last name as S
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//Enter the first name local as Vinoth 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vinoth");
		//Enter the  last name local as S
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		//Enter the salutation as Mr
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		//Enter the title as Software Testing 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Testing");
		//Enter the Department as Testing Team
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Team");
		//Enter the Annual Revenue as100000 
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
		//Enter the SIC code as 628613
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("628613");
		//Enter the Description as Create a New Lead on New Person
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creat a New Lead on New Person");
		//Enter the number of employees as 200
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
		//Enter the Ticker Symbol as @@
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@@");
		//Enter the importantNote as nill
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nill");
		//Enter the area code as 123
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		//Enter the person ask for as vino
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("vino");
		//Enter the phone number as 9940810382 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9940810382");
		//Enter the Extension as 92
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("92");
		//enter the email address as vinothpandian555@gmail.com
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinothpandian555@gmail.com");
		//Enter the web url
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.vinoth.com/");
		//Enter the to name as pandian
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("pandian");
		//enter the attention name 
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vino");
		//Enter the Address line 1 as 5/114 c,south street, tirunelveli
		driver.findElement(By.name("generalAddress1")).sendKeys("5/114 c,south street, tirunelveli");
		//Enter the Adress line 2 as meerankulam and po
		driver .findElement(By.name("generalAddress2")).sendKeys("meerankulam and po");
		//enter the city name as Tirunelveli
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tirunelveli");
		//Enter the zip/postal code as 628613
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("628613");
		//Enetr the zip/postal code Extension
		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("92");
		//click the creat lead
		//driver.findElement(By.name("submitButton")).click();

	}

}
