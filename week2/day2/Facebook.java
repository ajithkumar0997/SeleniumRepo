package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	       driver.get(" https://en-gb.facebook.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       WebElement createbtn= driver.findElement(By.linkText("Create new account"));
	       createbtn.click();
	       WebElement firstname= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	       firstname.sendKeys("srihar");
	       WebElement surname= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
	       surname.sendKeys("AK");
	       WebElement email= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	       email.sendKeys("sriharajith04@gmail.com");
	       WebElement verifyemail= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
	       verifyemail.sendKeys("sriharajith04@gmail.com");
	       WebElement newpassword= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
	       newpassword.sendKeys("sriharajith@04");
	       WebElement day=driver.findElement(By.id("day"));
	       Select dayoption=new Select(day);
	       dayoption.selectByVisibleText("21");
	       WebElement month=driver.findElement(By.id("month"));
	       Select monthoption=new Select(month);
	       monthoption.selectByVisibleText("Sep");
	       WebElement year=driver.findElement(By.id("year"));
	       Select yearoption=new Select(year);
	       yearoption.selectByVisibleText("1997");
	       WebElement Gender=driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	       Gender.click();
	       WebElement Signupbtn=driver.findElement(By.linkText("Sign Up"));
	       Signupbtn.click();
	}

}
