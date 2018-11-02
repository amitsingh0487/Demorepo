package com.Omnient.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Raftbasic\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
    /*driver.findElement(By.name("proceed")).click();
    Alert alert = driver.switchTo().alert();
    String popuptext = alert.getText();
    if(popuptext.equals("Please enter a valid user name")) {
    	System.out.println("Test case passed");
    }else {
    	System.out.println("Test case fsiled");
    }
    System.out.println(popuptext);
    alert.accept();*/
    driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("amitsingh0487");
    driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("20121965");
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
    driver.findElement(By.id("passwordNext")).click();
    System.out.println(driver.getTitle());
   //driver.findElement(By.xpath("")).;
    
   
    
    
    driver.quit();

	}

}
