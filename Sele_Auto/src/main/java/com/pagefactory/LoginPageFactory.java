package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


//@author Iqbal



//Login function xpath

public class LoginPageFactory {
	
WebDriver driver; //initiation
	public LoginPageFactory(WebDriver driver) {
		
	this.driver = driver;	
	PageFactory.initElements(driver, this);
		
		}
		
	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'ui-button-text')])[5]")
	private WebElement myAccount;

	@FindBy (how = How.XPATH, using = "//*[contains  (@name, 'email_address')]")
	private WebElement emailAddress;
	
	@FindBy (how = How.XPATH, using= "//*[contains  (@name, 'password')]")
	private WebElement password;
	
	@FindBy (how = How.XPATH, using= "(//*[contains  (text(), 'Sign In')])[2]")
	private WebElement signIn;
			
	@FindBy (how = How.XPATH, using= "(//*[contains  (@class, 'headerNavigation')])[2]")
	private WebElement catalog;
	
	@FindBy (how = How.XPATH, using= "//*[contains  (text(), 'new products')]")
	private WebElement newProduct;
	
	@FindBy (how = How.XPATH, using= "(//strong[contains  (text(), '1')])[1]")
	private WebElement page;
		
	@FindBy (how = How.XPATH, using= "//strong[contains  (text(), '10')]")
	private WebElement disPlay;
	
	// All getter methods
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getCatalog() {
		return catalog;
	}

	public WebElement getNewProduct() {
		return newProduct;
	}

	public WebElement getPage() {
		return page;
	}

	public WebElement getDisPlay() {
		return disPlay;
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

