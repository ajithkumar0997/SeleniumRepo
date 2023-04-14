package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.leafground.com/button.xhtml");
	     WebElement clickbtn=driver.findElement(By.id("j_idt88:j_idt90"));
	     clickbtn.click();
	     
	     
	}

}
