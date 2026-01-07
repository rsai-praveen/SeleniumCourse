package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetpageSourceMethod_4 {

	public static void main(String[] args) {
		// getPageSource : String
		WebDriver safari_driver = new SafariDriver();
		
		safari_driver.get("https://www.adactinhotelapp.com/");
		
		System.out.println(safari_driver.getCurrentUrl()); // to get the current url page which has currently focused
		safari_driver.quit();
	}

}
