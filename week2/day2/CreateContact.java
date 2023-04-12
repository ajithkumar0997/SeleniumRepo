package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       driver.manage().window().maximize();
	      WebElement UserName=driver.findElement(By.id("username"));
	      UserName.sendKeys("Demosalesmanager");
	      WebElement Password=driver.findElement(By.id("password"));
	      Password.sendKeys("crmsfa");
	      WebElement Loginbtn=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
	      Loginbtn.click();
	      WebElement CRMlink=driver.findElement(By.linkText("CRM/SFA"));
	      CRMlink.click();
	      WebElement contact=driver.findElement(By.linkText("Contacts"));
	      contact.click();
	      WebElement createContact=driver.findElement(By.linkText("Create Contact"));
	     createContact.click();
	     WebElement Fname=driver.findElement(By.id("firstNameField"));
	      Fname.sendKeys("Ajith");
	      WebElement Lastname=driver.findElement(By.id("lastNameField"));
	      Lastname.sendKeys("Kumar");
	      WebElement FNameLocal=driver.findElement(By.id("createContactForm_firstNameLocal"));
	      FNameLocal.sendKeys("A");
	      WebElement LNameLocal=driver.findElement(By.id("createContactForm_lastNameLocal"));
	      LNameLocal.sendKeys("K");
	      WebElement Department=driver.findElement(By.id("createContactForm_departmentName"));
	      Department.sendKeys("EEE");
	      WebElement Description=driver.findElement(By.id("createContactForm_description"));
	      Description.sendKeys("TestSelenium");
	      WebElement email=driver.findElement(By.id("createContactForm_primaryEmail"));
	      email.sendKeys("sriharajith04@gmail.com");
	      WebElement State=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	      Select statedropdown=new Select(State);
	      statedropdown.selectByVisibleText("New York");
	      WebElement Createbtn=driver.findElement(By.className("smallSubmit"));
	      Createbtn.click();
	      WebElement editlink=driver.findElement(By.linkText("Edit"));
	      editlink.click();
	      WebElement UpdateDescription=driver.findElement(By.id("updateContactForm_description"));
	      UpdateDescription.clear();
	      WebElement ImpNote=driver.findElement(By.id("updateContactForm_importantNote"));
	      ImpNote.sendKeys("TestSelenium");
	      WebElement Updatebtn=driver.findElement(By.xpath("//input[@value='Update']"));
	      Updatebtn.click();
	      String Title=driver.getTitle();
			System.out.println(Title);
	      
	     
	    		  
	}

}
