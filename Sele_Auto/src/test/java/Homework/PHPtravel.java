package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.PHPtravelPageFactory;

public class PHPtravel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15164\\git\\iqbal\\Sele_Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		
		
//		String homePage = driver.getCurrentUrl();
//		Assert.assertEquals("https://www.phptravels.net/", homePage);
		
		if (driver.getTitle().contains("PHPTRAVELS"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
		
		PHPtravelPageFactory btn = new PHPtravelPageFactory(driver);
		
		btn.getMyAccount().click();
		btn.getLogin().click();
		Thread.sleep(2000);
		btn.getEmail().sendKeys("miqbalkhan41@yahoo.com");
		Thread.sleep(2000);
		btn.getPassword().sendKeys("123456");
		Thread.sleep(2000);
		btn.getLoginbtn().click();
		btn.getFlights().click();
		btn.getRoundtrip().click();
		btn.getFirsttab().click();
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElement(By.name("cabinclass")));
		
		select.selectByValue("first");
		
		
		//WebElement selectclass = driver.findElement(By.xpath("(//*[contains(text(), 'FIRST')])[1]"));
		//selectclass.click();
		
		//double click
		
//		Actions action = new Actions(driver);
//		WebElement element=driver.findElement(By.xpath("//*[contains(text(), 'First')])[1]"));
//		action.moveToElement(element).perform();
//		action.doubleClick(element).perform();
		//btn.getSelectJFK().click();
		
		btn.getDepartureCity().click();
		btn.getInputDepartureCity().sendKeys("JFK");
		btn.getClickCity().click();
		btn.getArrivalCity().click();
		btn.getInputArrivalCity().sendKeys("MCO");
		btn.getClickCity().click();
		btn.getDepart().sendKeys("2018-06-21");
		btn.getArrive().sendKeys("2018-06-30");
		btn.getTpassanger().click();
		btn.getSelectadult().sendKeys("2");
		btn.getSelectChildren().sendKeys("1");
		btn.getSelectDone().click();
		btn.getSearch().click();
		btn.getSearch().click();
		
		
		
		
		
		
		

	}

}
