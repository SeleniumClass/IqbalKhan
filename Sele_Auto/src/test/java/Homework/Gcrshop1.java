package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.LoginPageFactory;

public class Gcrshop1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15164\\git\\iqbal\\Sele_Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3");
		
		LoginPageFactory btn = new LoginPageFactory(driver);
		
		//whenever write above then there underline which is costructor then create constructor then 
		// constructor will creare in the pagefactory.
		//This is the pagefactorydriver. now we have to connect  with the chromedriver with the pagefactory driver.
		
		// to connect class using import Ctrl+Shift+O
		
		// NullPointerException error:  The reason this page is throwing NullPointerException erroris because 
		//the pageFactory does not have ability to controll chromedriver. so we need to connect chromedriver to
		// the pageFactory.
		
		btn.getMyAccount().click();
		btn.getEmailAddress().sendKeys("miqbalkhan41@yahoo.com");
		Thread.sleep(3000);
		btn.getPassword().sendKeys("12345");
		Thread.sleep(3000);
		btn.getSignIn().click();
		Thread.sleep(3000);
		btn.getCatalog().click();
		Thread.sleep(3000);
		btn.getNewProduct().click();
		Thread.sleep(3000);
		
		System.out.println("page number is:" + btn.getPage().getText() );
		System.out.println("Displaying product:" + btn.getDisPlay().getText());
		
				
				
		
		
	}
	
	
	

}
