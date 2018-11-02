package com.Omnient.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mybase {
	WebDriver driver;
	Properties prop;
	
	
	
	public Mybase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/Omnient/qa/config/config.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("url"));
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}
	public void Start() {
		String browserCall = prop.getProperty("browser");
		if(browserCall.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Raftbasic\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Lets Code It");
		}
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	}
	

}
