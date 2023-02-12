package week3.day4selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeAssignment {

	public static void main(String[] args) {
		// launch the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		// load the url
		driver.get("https://acme-test.uipath.com/login");
				//2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");		
		//3. Enter Password as "leaf@12"
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	//	4. Click login button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	//	5. Get the title of the page and print
		String text= driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
	//	6. Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	//	7. Close the browser (use -driver.close())
		driver.close();
	}

}
