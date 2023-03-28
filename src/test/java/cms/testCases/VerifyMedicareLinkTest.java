package cms.testCases;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cms.util.Log;

import cms.Base.TestBase;
import cms.pages.VerifyMedicareLink;






public class VerifyMedicareLinkTest extends TestBase {
	
			
		
		VerifyMedicareLink verifyMedicareLink;
		
		//Logger log = (Logger) LogManager.getLogger(LoginPageTest.class);
		
		
		
		public VerifyMedicareLinkTest(){
			super();
			
		}
		
		

	@BeforeMethod
	public void setUp(){
		DOMConfigurator.configure("log4j.xml");
//		log.info("****************************** Starting test cases execution  *****************************************");
		
		
		initialization();
		
		verifyMedicareLink = new VerifyMedicareLink();
		Log.startTestCase("VerifyMedicareLinkTest");
		
		
		Log.info("entering application URL");
//		log.warn("Hey this just a warning message");
//		log.fatal("hey this is just fatal error message");
//		log.debug("this is debug message");
	}

	@Test(priority=1)
	public void clickMedicareLinkTest(){
		
		
		Log.info("****************************** starting test case *****************************************");
		Log.info("****************************** click on Medicare Link  *****************************************");
		
		 verifyMedicareLink.clickMedicareLink();
	
	}
	@Test(priority=2)
	public void MedicarePageTitleTest(){
		verifyMedicareLink.clickMedicareLink();
		
		Log.info("****************************** starting test case *****************************************");
		Log.info("****************************** loginPageTitleTest *****************************************");
		
		String title = verifyMedicareLink.validateMedicarePageTitle();
		Assert.assertEquals(title,"Medicare | CMS");
	}

	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		Log.info("****************************** Browser is closed *****************************************");

	}


}
