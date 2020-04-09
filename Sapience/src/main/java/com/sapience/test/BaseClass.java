package com.sapience.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sapience.base.SapienceHomepage;
import com.sapience.base.SapienceLogin;

public class BaseClass {
	public ChromeDriver driver;
	Properties prop=new Properties();
	SapienceLogin login = new SapienceLogin();
	SapienceHomepage homepage= new SapienceHomepage();
	@BeforeMethod
	public void openbrowser() throws IOException{
		FileInputStream ip= new FileInputStream("D:\\Aakash_Workspace1\\Sapience\\src\\main\\java"
				+ "\\com\\sapience\\utils\\config.properties");
		prop.load(ip);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
	        driver=new ChromeDriver();	
		}
		driver.get(prop.getProperty("url"));
	   driver.manage().window().maximize();
	}
	
   @Test
   
   public void exceutionsteps() throws IOException, InterruptedException{
	   login.login(driver);
	   homepage.runhomepage(driver);
	   
   }
   @AfterMethod
   public void close(){
  	 driver.close();
   }
}
