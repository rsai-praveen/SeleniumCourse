package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class GetMethod_1 {

	public static void main(String[] args) throws InterruptedException {
		// in industry "driver" is used as object creation instead i used "chromedriver"
		//RemoteWebDriver chrome_driver=new  ChromeDriver();//working
		WebDriver safari_driver = new SafariDriver();
		
		// if "ChromeDriver" is used as reference then the script works only for the chrome browser so we use RemoteDriver/Webdriver as reference.
		
		safari_driver.get("https://www.adactinhotelapp.com/");
		
		
		// url should contain https/http
		
		safari_driver.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		Thread.sleep(3000);
				
		safari_driver.close();
		//close method is used to close the window/tab of browser
		//chrome_driver.quit();
		
		// Close() => it closes 1 window or tab & it will not kill driver executable
		//Quit() => it  closes all windows/tabs and it will kill driver executable
	}

}
