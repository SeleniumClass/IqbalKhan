package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PHPtravelPageFactory {
	
	
	WebDriver driver; //declare which is intialization
	public PHPtravelPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(how = How.XPATH, using= "(//* [contains (@id, 'li_myaccount')])[2]")
	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using= "(//* [contains(text(), 'Login')])[2]")
	private WebElement login;
	
	@FindBy(how = How.XPATH, using = "//* [contains(@name, 'username')]")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//* [contains(@name, 'password')]")
	private WebElement password;
	
	
	@FindBy(how = How.XPATH, using = "(//* [contains(text(), 'Login')])[5]")
	private WebElement loginbtn;
	
	
	@FindBy(how = How.XPATH, using = "(//* [contains(text(), 'Flights')])[1]")
	private WebElement flights;
	
	@FindBy(how = How.XPATH, using = " (//ins[contains(@class, 'iCheck-helper')])[2]")
	private WebElement roundtrip;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'form-control fs12 class')]")
	private WebElement firsttab;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(), 'First')])[1]")
	private WebElement selectFirst;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@class, 'select2-input')])[2]")
	private WebElement selectJFK;
	
//	@FindBy(how = How.XPATH, using = "(//*[contains(@class, 'select2-input')])[2]")
//	private WebElement inputJFK;
	@FindBy(id = "s2id_location_from")
	private WebElement departureCity;
	
	@FindBy (xpath = "(//input[contains(@class,'select2-input')])[2]")
	private WebElement inputDepartureCity;
	
//	@FindBy(how = How.XPATH, using = " (//*[contains(@class, 'select2-input')])[2]")
//	private WebElement inputMCO;
	@FindBy(id = "s2id_location_to")
	private WebElement arrivalCity;
	
	@FindBy (xpath = "(//input[contains(@class,'select2-input')])[2]")
	private WebElement inputArrivalCity;
	
	@FindBy (xpath = "//div[contains(@class,'select2-result-label')]")
	private WebElement clickCity;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'form-control input-lg departureTime')]")
	private WebElement depart;
	
	@FindBy(how = How.XPATH, using = " //*[contains(@class, 'form-control input-lg arrivalTime')]")
	private WebElement arrive;
	
	@FindBy(how = How.XPATH, using = "  //*[contains(@name, 'totalManualPassenger')]")
	private WebElement tpassanger;

	@FindBy(how = How.XPATH, using = "  //*[contains(@class, 'btn-danger btn btn-lg btn-block pfb0')]")
	private WebElement serchbtn;
	
//	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'form-control fs12 class')]")
//	private WebElement firsttab;
//	
//	@FindBy(how = How.XPATH, using = "(//*[contains(text(), 'First')])[1]")
//	private WebElement selectFirst;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@name, 'madult')]")
	private WebElement selectadult;
	@FindBy(how = How.XPATH, using = "//*[contains(@name, 'mchildren')]")
	private WebElement selectChildren;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@id, 'sumManualPassenger')]")
	private WebElement selectDone;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search-button')]")
	private WebElement search;
	
	
	
	
	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getFlights() {
		return flights;
	}

	public WebElement getRoundtrip() {
		return roundtrip;
	}

	public WebElement getFirsttab() {
		return firsttab;
	}

	
	public WebElement getSelectJFK() {
		return selectJFK;
	}

//	public WebElement getInputJFK() {
//		return inputJFK;
//	}
	public WebElement getDepartureCity() {
		//departureCity.click();
		return departureCity;
	}
	
	public WebElement getInputDepartureCity() {
		return inputDepartureCity;
	}

//	public WebElement getInputMCO() {
//		inputMCO.clear();
//		return inputMCO;
//	}
	public WebElement getArrivalCity() {
		//arrivalCity.click();
		return arrivalCity;
	}
	
	public WebElement getInputArrivalCity() {
		return inputArrivalCity;
	}
	
	public WebElement getClickCity() {
		return clickCity;
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getArrive() {
		return arrive;
	}

	public WebElement getTpassanger() {
		return tpassanger;
	}

	public WebElement getSerchbtn() {
		return serchbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectFirst() {
		return selectFirst;
	}

	public WebElement getSelectadult() {
		return selectadult;
	}

	public WebElement getSelectChildren() {
		return selectChildren;
	}

	public WebElement getSelectDone() {
		return selectDone;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
	
	
	
	
	
}
