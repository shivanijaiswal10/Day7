package Trophy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		

}
	@Test
	public void TaseCase1() throws InterruptedException {
	    
			WebElement ball= driver.findElement(By.id("draggable"));
			Thread.sleep(2000);
			
			WebElement area = driver.findElement(By.id("dropzone2"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.dragAndDrop(ball, area ).build().perform();
		
			WebElement ball1= driver.findElement(By.id("dropzone2"));
			 Thread.sleep(2000);
			 WebElement area1 = driver.findElement(By.id("droppable"));
			 
			 Actions act1 = new Actions(driver);
			 act.dragAndDrop(ball1, area1 ).build().perform();
			 
			 Thread.sleep(3000);
			 driver.close();
			 
			 

		}


	}



