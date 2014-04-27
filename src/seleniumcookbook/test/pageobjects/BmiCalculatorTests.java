package seleniumcookbook.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import seleniumcookbook.test.pageobjects.*;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BmiCalculatorTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testBmiCalculation() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dl.dropbox.com/u/55228056/bmicalculator.html");
		//Create instance of BmiCalcPage and pass the driver
		BmiCalcPage bmiCalcPage = new BmiCalcPage(driver);
		//Enter Height & Weight
		bmiCalcPage.heightCMS.sendKeys("181");
		bmiCalcPage.weightKg.sendKeys("80");
		//Click on Calculate button
		bmiCalcPage.Calculate.click();
		//Verify Bmi & Bmi Category values
		assertEquals("24.4", bmiCalcPage.bmi.getAttribute("value"));
		assertEquals("Normal", bmiCalcPage.bmi_category.getAttribute("value"));
		//Close the Browser
		driver.close();
		fail("Not yet implemented");
	}
}
