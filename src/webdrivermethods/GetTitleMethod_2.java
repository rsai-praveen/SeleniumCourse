package webdrivermethods;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetTitleMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome_driver = new SafariDriver();
		
		chrome_driver.get("https://www.adactinhotelapp.com/");
		String title=chrome_driver.getTitle();
		System.out.println(title);
		chrome_driver.quit();
	}

}
