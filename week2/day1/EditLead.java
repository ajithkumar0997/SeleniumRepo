package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
	      FirstName.sendKeys("Ajith");
	      WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
	      LastName.sendKeys("kumar");
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
		      WebElement Edit=driver.findElement(By.linkText("Edit"));
		      Edit.click();
		      WebElement UpdateDescription=driver.findElement(By.id("updateLeadForm_description"));
		     UpdateDescription.clear();
		      WebElement Importantnotes=driver.findElement(By.id("updateLeadForm_importantNote"));
		     Importantnotes.sendKeys("SeleniumLearning");
		     WebElement UpdateLead=driver.findElement(By.className("smallSubmit"));
		      UpdateLead.click();
			String Title=driver.getTitle();
			System.out.println(Title);
	}

}
