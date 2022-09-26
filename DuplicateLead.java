package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter CompanyName Field Using id Locator
		//Enter FirstName Field Using id Locator
		//Enter LastName Field Using id Locator
		//Enter FirstName(Local) Field Using id Locator
		//Enter Department Field Using any Locator of Your Choice
		//Enter Description Field Using any Locator of your choice 
		//Enter your email in the E-mail address Field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vikram");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description added successfully");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("demo1@gmail.com");

		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();

		//Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		//Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");

		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());

	}

}
