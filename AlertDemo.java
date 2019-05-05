package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String val=driver.switchTo().alert().getText();
		System.out.println("value:"+val);
		
		driver.switchTo().alert().sendKeys("Go");
	}
}
