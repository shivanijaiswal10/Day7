package Trophy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class instagramLogin {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");

}
	@Test
	public void TaseCase1() {
		driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("shivi");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("1234@45");
		
		driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();

	}
}
