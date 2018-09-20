package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get("https://demoqa.com/registration/");
		String url = driver.getCurrentUrl();
		System.out.println("The URL is ====+" +url);
		String title = driver.getTitle();
		System.out.println("The title is = " +title);
		System.out.println(driver.getPageSource());
		driver.get("https://demoqa.com/registration/");
		driver.findElement(By.id("name_3_firstname")).sendKeys("Manoj");
		driver.findElement(By.linkText("Home")).click();
		
	}

}
