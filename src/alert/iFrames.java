package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

		// Switch to first iframe and click button
		driver.switchTo().frame("iframe1");
		WebElement button1 = driver.findElement(By.id("buttonInFirstFrame"));
		button1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		// Switch to second iframe and click button
		driver.switchTo().frame("iframe2");
		WebElement button2 = driver.findElement(By.id("buttonInSecondFrame"));
		button2.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		// Click back button
		driver.findElement(By.id("backButton")).click();

		driver.quit();
	}

}
