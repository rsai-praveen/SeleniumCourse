package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetCurrtentUrlMethod_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver safari_driver = new SafariDriver();
		
		safari_driver.get("https://www.adactinhotelapp.com/");
		
		System.out.println(safari_driver.getCurrentUrl()); // to get the current url page which has currently focused
		safari_driver.quit();

	}

}
