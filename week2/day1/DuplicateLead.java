package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
	      WebElement Leadlink=driver.findElement(By.linkText("Leads"));
	      Leadlink.click();
	      WebElement CreateLeadlink=driver.findElement(By.linkText("Create Lead"));
	      CreateLeadlink.click();
	      WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
	      CompanyName.sendKeys("Fern Software");
	      WebElement FirstName=driver.findElement(By.id("createLeadForm_firstName"));
	      FirstName.sendKeys("Ajithkumar");
	      WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
	      LastName.sendKeys("Shanmugam");
	      WebElement Firstnamelocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	      Firstnamelocal.sendKeys("S");
	      WebElement Department=driver.findElement(By.id("createLeadForm_departmentName"));
	      Department.sendKeys("EEE");
	      WebElement Description=driver.findElement(By.id("createLeadForm_description"));
	      Description.sendKeys("SeleniumLearning");
	      WebElement Email=driver.findElement(By.id("createLeadForm_primaryEmail"));
	      Email.sendKeys("sriharajith04@gmail.com");
	      WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	      Select statename=new Select(State);
			statename.selectByVisibleText("New York");
			WebElement CreateLead=driver.findElement(By.className("smallSubmit"));
		      CreateLead.click();
			String Title=driver.getTitle();
			System.out.println(Title);
			WebElement duplicateLeadlink=driver.findElement(By.linkText("Duplicate Lead"));
		      duplicateLeadlink.click();
		      WebElement updateCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		      updateCompanyName.clear();
		      updateCompanyName.sendKeys("Quantum");
		      WebElement UpdateFirstName=driver.findElement(By.id("createLeadForm_firstName"));
		      UpdateFirstName.clear();
		      UpdateFirstName.sendKeys("AK");
		      WebElement updateLead=driver.findElement(By.className("smallSubmit"));
		      updateLead.click();
		      
		      
		      
		      
	}

}
