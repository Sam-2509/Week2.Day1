package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karuppasamy");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganapathy");

		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sangar");

		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.className("inputBox")).sendKeys("Testing");

		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("This is a Automation Script");

		//Enter your email in the E-mail address Field 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("demotest@gmail.com");

		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		//Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//driver.findElement(By.linkText("This is a automation script")).clear();

		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is Checking for Important Note Field");

		//Click on update button 
		driver.findElement(By.name("submitButton")).click();

		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());

	}

}
