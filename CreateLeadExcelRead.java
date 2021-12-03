package week5.day2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class CreateLeadExcelRead extends BaseClass{

	@Test(dataProvider ="sendData")
	public void createLead(String CompanyName, String Name, String initial, String phNo) {
		System.out.println("Create Lead class");
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(initial);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		System.out.println("End of Create Lead class");
}

@DataProvider(name="sendData")
private String[][] sendData() {
	// Assigning data to the 2D string array
	String [][] data= new String[3][4];
	//row 1- data
	data[0][0] ="Testleaf";
	data[0][1]= "Hari";
	data[0][2]="R";
	data[0][3]="98";
	
	//row2- data
	data[1][0] ="Testleaf";
	data[1][1]= "Babu";
	data[1][2]="M";
	data[1][3]="99";
	
	//row3- data
	data[2][0] ="CTS";
	data[2][1]= "Gomathi";
	data[2][2]="S";
	data[2][3]="98";
			
	return data;
	
}

}






