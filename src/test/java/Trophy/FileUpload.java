package Trophy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		

}
	@Test
	public void TastCase1() {
		driver.findElement(By.xpath("//input[@name='input4[]']")).sendKeys("C:\\Users\\shiva\\OneDrive\\Documents\\download.jpg");
	    driver.findElement(By.xpath("//span[text()='Upload']")).click();
//		driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));
	}
}

