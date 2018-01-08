package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.11.122:8080/grid/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sxzhz");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.className("login_btn")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
