package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// : Navigation
		WebDriver safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("https://www.adactinhotelapp.com/");
		safari_driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		safari_driver.navigate().back();
		Thread.sleep(1000);
		safari_driver.navigate().forward();
		Thread.sleep(1000);
		safari_driver.navigate().refresh();
		Thread.sleep(1000);
		safari_driver.navigate().to("https://www.fb.com");
		URL url=new URL("https://www.gmail.com");
		safari_driver.navigate().to(url);
		safari_driver.quit();
		//navigate.to method follows method overloading concept

	}

}
