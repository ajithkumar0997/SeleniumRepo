package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().window().maximize();
       String title=driver.getTitle();
       System.out.println(title);
       String url = driver.getCurrentUrl();
       System.out.println(url);
	}

}
