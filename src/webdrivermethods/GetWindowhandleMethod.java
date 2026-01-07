package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetWindowhandleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver safari_driver = new SafariDriver();
		
		safari_driver.get("https://www.adactinhotelapp.com/");
		
		System.out.println(safari_driver.getWindowHandle()); //:<string>this will retrieve window id of which webdriver focus is in form of hex decimal format
		//safari_driver.quit();
		//safari_driver.close();
		safari_driver.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		Thread.sleep(3000);
		System.out.println(safari_driver.getWindowHandles()); // : set<strings>this will retrieve window id of which webdriver focus is in form of hex decimal format
	}

}
