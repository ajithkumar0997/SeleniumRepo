package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMEtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://acme-test.uipath.com/login");
	       driver.manage().window().maximize();
	       WebElement mailid=driver.findElement(By.id("email"));
	       mailid.sendKeys("kumar.testleaf@gmail.com");
	       WebElement password=driver.findElement(By.id("password"));
	       password.sendKeys("leaf@12");
	       WebElement loginbtn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	       loginbtn.click();
	       String Title=driver.getTitle();
			System.out.println(Title);
			WebElement logoutbtn=driver.findElement(By.linkText("Log Out"));
			logoutbtn.click();
			driver.close();
			

		}
		
	}


