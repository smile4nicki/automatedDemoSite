package com.cog.automatedExercises.AutomatedChallenge1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoSite {
	WebDriver driver;

	@BeforeClass
	public static void initial() {
		System.out.println("first");
	}

	@AfterClass
	public static void end() {
		System.out.println("last");
	}
	
	@Before
	public void setup() { // setup is naming convention
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() throws InterruptedException { // teardown is naming convention
		System.out.println("After");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test 
	public void addUser() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Nichola");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("helloworld");
		driver.findElement(By.name("FormsButton2")).click();
	}
	
}