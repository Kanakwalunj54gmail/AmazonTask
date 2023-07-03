package seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//titan
		driver.findElement(By.linkText("Analogue")).click();
		driver.findElement(By.linkText("Leather")).click();
		driver.findElement(By.linkText("Titan")).click();
		driver.findElement(By.linkText("25% off or more")).click();
		driver.findElement(By.linkText("Karishma Analog Champagne Dial Men's Watch")).click();
		driver.close();
		

	}

}
