package week1.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Tools\\chromedriver_win32\\chromedriver.exe");
	 WebDriver  driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
