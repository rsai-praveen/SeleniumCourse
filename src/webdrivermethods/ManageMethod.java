package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// manage: options
		/*
		 * 
		 */
		WebDriver safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("https://www.adactinhotelapp.com/");
		Thread.sleep(3000);
		safari_driver.quit();
		
		
	}
	

}
