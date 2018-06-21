package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazan_project {
	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\15164\\eclipse-workspace\\Sele_Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		driver.findElement(By.xpath("(//*[@ class='nav-line-2'])[7]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-a'])[4]")).click();
		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath(" (//*[@ class='nav-a'])[5]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-a'])[6]")).click();

		System.out.println(driver.getTitle());
		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-a'])[7]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-a'])[8]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-line-2'])[3]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-line-2'])[4]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.findElement(By.xpath("(//*[@ class='nav-line-2'])[5]")).click();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.quit();

	}
}