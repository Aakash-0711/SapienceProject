package com.sapience.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SapienceLogin {
	
	
	Properties prop=new Properties();
	public void login(WebDriver driver) throws IOException{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='un']")).sendKeys("Murugavelv@Softcrylic.co.in");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("MyPa55W0rd");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}
	
	
	
	
	
	

}
