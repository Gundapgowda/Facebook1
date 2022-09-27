package com.assignment.Calculatorsum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("email")).sendKeys("8892727174");
		//pass
		driver.findElement(By.id("pass")).sendKeys("18181818");
		//login
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(30000);
		System.out.println("Hi, Welcome to automation testing");
		//Thread.sleep(3000);
		//driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
