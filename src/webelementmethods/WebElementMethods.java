package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		WebDriver driver = new SafariDriver();
		// Access Url
		driver.get("https://demoqa.com/");
		//wait time for 2secs
		Thread.sleep(2000);
		//
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(3000);
		System.out.println("complete");
		driver.quit();
	}

}
