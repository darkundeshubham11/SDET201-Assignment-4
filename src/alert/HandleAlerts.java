package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

		// Handle first alert
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		// Handle confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		alert = driver.switchTo().alert();
		alert.accept(); // or alert.dismiss() to cancel
		Thread.sleep(2000);

		// Handle prompt alert
		driver.findElement(By.id("promptBox")).click();
		alert = driver.switchTo().alert();
		alert.sendKeys("Test");
		alert.accept();
		Thread.sleep(2000);

		driver.quit();
	}

}
