package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shiny");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edwin");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");	
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Module Lead for Regression Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shinye1989@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title of this webpage is " + title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement Company = driver.findElement(By.id("createLeadForm_companyName"));
		Company.clear();
		Company.sendKeys("ShearCompanies");
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.clear();
		FirstName.sendKeys("Viswa");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println("The title of this webpage is " + title1);
		
		
		
		
		
	}

}
