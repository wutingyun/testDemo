package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test02 {

	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //调用chrome驱动
		
		WebDriver driver=new ChromeDriver();//打开chrome浏览器，创建谷歌实体
		driver.get("http://192.168.11.122:8080/grid/login"); //让浏览器访问义乌网格
		driver.manage().window().maximize();
		Thread.sleep(1000);//线程休息1s
		
		driver.findElement(By.id("username")).clear(); //找到用户名元素，并清空
		driver.findElement(By.id("username")).sendKeys("sxzhz");//找到用户名元素，并输入用户名
		Thread.sleep(1000);
		driver.findElement(By.id("password")).clear();//找到密码元素，并清空
		driver.findElement(By.id("password")).sendKeys("123456");//找到密码元素，并输入密码
		Thread.sleep(1000);
		driver.findElement(By.className("login_btn")).click(); //找到登录按钮元素，并点击
		Thread.sleep(5000);
		driver.close();//关闭浏览器
	}
}
