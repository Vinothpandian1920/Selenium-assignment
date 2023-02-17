package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyClassTest {

	public static void main(String[] args) {
		//launch chrome browser
				ChromeDriver driver=new ChromeDriver();
				//launch the url
				driver.get ("https:tamilmatrimony.in");
				// maximize the window
				driver.manage().window().maximize();
				// manage the action time
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Select the  matrimony profinle for your self
				WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
				 Select findSelf=new   Select(findElement);
                 findSelf.selectByVisibleText("Myself");
                 //Enter the name
                 driver.findElement(By.className("hp-regform-txtfield")).sendKeys("pandian");
              //click on gender
                 driver.findElement(By.xpath("//input[@id='gendermale']")).click();
                 // select birth date
                 WebElement findElement1 = driver.findElement(By.id("DOBDAY"));
         		Select selectDate=new Select(findElement1);
         		selectDate.selectByIndex(22);
         		 // select birth month
                WebElement findElement2 = driver.findElement(By.id("DOBMONTH"));
        		Select selectMonth=new Select(findElement2);
        		selectMonth.selectByIndex(7);
        		 // select birth year
                WebElement findElement3 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
        		Select selectYear=new Select(findElement3);
        		selectYear.selectByVisibleText("1999");
        		//select your relegion
        		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
        		Select selectRelegion=new Select(findElement4 );
        		selectRelegion.selectByVisibleText("Hindu");
        		// select mother tonguecx
        		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
        		Select selectMotherToung=new Select(findElement5);
        		selectMotherToung.selectByVisibleText("Tamil");
        		// selsect your country
        		WebElement findElement6 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
        		Select selectCountry=new Select(findElement6);
        		selectCountry.selectByVisibleText("India");
        		// enter mobile number
        		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9940810382");
        		//enter  emailid
        		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("vinoth555@gmail.com");
        		// close the browser
        		driver.close();
        		
        		
        		
         		
	}

}
