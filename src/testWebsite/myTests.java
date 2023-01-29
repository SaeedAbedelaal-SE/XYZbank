package testWebsite;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class myTests extends parameters {

//	@Test(priority = 2, groups = { "Customer" })
//
//	public void loginAsCustomer() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//
//	}
//
//	@Test(priority = 2, groups = { "Manager" })
//
//	public void loginAsManeger() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
//
//	}

//	@Test(priority = 3, groups = { "Manager" })
//
//	public void Add_Customer() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		Random random = new Random();
//		int number = random.nextInt(100);
//		String convertInt = String.valueOf(number);
//
//		int number1 = random.nextInt(100);
//		String convertInt1 = String.valueOf(number1);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("user");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
//				.sendKeys("AsCustomer" + convertInt);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
//				.sendKeys(convertInt1 + convertInt1 + convertInt1);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
//
//		String alertMessege = driver.switchTo().alert().getText();
//		System.out.println(alertMessege);
//		boolean check = alertMessege.contains("added");
//		softassert.assertEquals(check, true);
//		softassert.assertAll();
//
//		driver.switchTo().alert().accept();
//		
//		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("user");
//		List<WebElement> users = driver.findElements(By.xpath("//tbody/tr"));
//		
//		System.out.println("**************************");
//		System.out.println(users.size());
//		System.out.println("**************************");
//
//	}

	
	
//	@Test()
//	
//	public void test_money() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//		
//		Select mySelect = new Select(driver.findElement(By.xpath("//*[@id=\"userSelect\"]")));
//		mySelect.selectByVisibleText("Ron Weasly");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("500");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("250");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//		
//		
//		String myBalance = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
//		int myNewBalance = Integer.parseInt(myBalance);
//		
//		softassert.assertEquals(myNewBalance, 250);
//		
//		
//		softassert.assertAll();
//		
//		
//		
//	}
	
	@Test()
	public void sum_of_balances() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		
		Thread.sleep(2000);
		Select selectName = new Select(driver.findElement(By.xpath("//*[@id=\"userSelect\"]")));
		selectName.selectByVisibleText("Ron Weasly");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		
		
		
		Select RonNum = new Select(driver.findElement(By.xpath("//*[@id=\"accountSelect\"]")));
		RonNum.selectByVisibleText("1007");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("100");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		
		String bal1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();		
		System.out.println("**************************");
		System.out.println(bal1);
		System.out.println("**************************");
		int balOne = Integer.parseInt(bal1);

		
		
		Thread.sleep(1000);
		RonNum.selectByVisibleText("1008");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("300");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		String bal2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();		
		System.out.println("**************************");
		System.out.println(bal2);
		System.out.println("**************************");
		
		int balTwo = Integer.parseInt(bal2);
		
		
		Thread.sleep(1000);
		RonNum.selectByVisibleText("1009");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		
		String bal3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();		
		System.out.println("**************************");
		System.out.println(bal3);
		System.out.println("**************************");
		int balThree = Integer.parseInt(bal3);
		
		
		double fullBalance = balOne + (balTwo*1.24) + (balThree * 0.012) ;
		
		System.out.println("*************************");
		System.out.println("fullBalance = " + fullBalance);
		System.out.println("*************************");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
