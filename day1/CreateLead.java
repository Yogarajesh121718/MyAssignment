package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yogarajesh");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamatchisundaram");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA_Lead");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf123@gmail.com");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am working in QA EXPLEO SOLUTIONS");

		WebElement sou = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select sol = new Select(sou);

		sol.selectByIndex(3);

		WebElement sta = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select sta1 = new Select(sta);

		sta1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
        System.out.println(title);

	}

}
