package testWebsite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert() ;
	String myURL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	
	

	@BeforeTest

	public void beforeStart() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(myURL);
		driver.manage().window().maximize();

	}
}
