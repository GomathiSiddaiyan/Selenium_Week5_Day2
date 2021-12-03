package week5.day2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
@Test(dependsOnMethods="week5.day1.CreateLead.createLead")
	public void editLead() throws InterruptedException {
		System.out.println("Edit lead class");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("End of Edit lead class");
}
}






