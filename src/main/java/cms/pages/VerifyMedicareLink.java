package cms.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Base.TestBase;


public class VerifyMedicareLink extends TestBase {
	
	
	
	@FindBy(css="#block-cms-evo-cmsglobalprimarymenu > ul > li:nth-child(1) > a")
	WebElement medicareLink;
	
	@FindBy(css="#password")
	WebElement password;
	
	
	
	//Initializing the Page Objects:
	public VerifyMedicareLink(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void clickMedicareLink(){
		
		medicareLink.click();
	}
	
	public String validateMedicarePageTitle(){
		return driver.getTitle();
				
	}
	
}
