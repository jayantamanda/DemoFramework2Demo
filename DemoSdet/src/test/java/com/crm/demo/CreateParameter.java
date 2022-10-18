package com.crm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateParameter {
	@Test
	public void method() {
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		
		WebDriver driver;
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();		
			 }
		 else if(BROWSER.equalsIgnoreCase("msedge"))
		 {
             WebDriverManager.edgedriver().setup();
             driver=new EdgeDriver();
				
			 }
		 
		 else {
			 driver=new ChromeDriver();		
			 }
		 String URL=System.getProperty("url");
		 driver.get(URL);
		 String USERNAME=System.getProperty("username");
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 String PASSWORD=System.getProperty("password");
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 driver.findElement(By.id("submitButton")).click();
}
}