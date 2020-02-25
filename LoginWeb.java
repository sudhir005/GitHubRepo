package com.onlineBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) 
	{
		System.out.println("Hello");

		//  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		//  WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        
                system.out.println("Welcome back")
		driver.get("https://www.google.com/")
        }

}


