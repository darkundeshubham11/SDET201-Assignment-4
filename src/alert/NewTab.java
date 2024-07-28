package alert;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

		// Click on ElementalSelenium link to open new tab
		driver.findElement(By.linkText("Elemental Selenium")).click();

		// Switch to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		// Interact with elements in the new tab
		WebElement emailField = driver.findElement(By.id("emailField"));
		emailField.sendKeys("test@example.com");
		WebElement dropdown = driver.findElement(By.id("dropdownId"));
		dropdown.click();
		dropdown.findElement(By.xpath("//option[. = 'Python']")).click();
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);

		// Switch back to the original tab
		driver.switchTo().window(tabs.get(0));

		// Enter credentials and login
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("testUser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("testPassword");
		driver.findElement(By.id("loginButton")).click();

		driver.quit();
	}
}
