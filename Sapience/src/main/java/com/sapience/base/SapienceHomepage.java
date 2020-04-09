package com.sapience.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SapienceHomepage{
	
	@Test
	
	public void runhomepage(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("//button[contains(@class,'navbar-toggler mega-nav-toggler')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='filterIcon']//span[@class='icon magnifying-glass']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter search text']")).sendKeys("nandhaa",Keys.ENTER);
		driver.findElement(By.xpath("(//li[@class='search-item']//span)[2]")).click();
		
		Thread.sleep(3000);
		
		Calendar cal = Calendar.getInstance();
		   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		   System.out.println("Today's date is "+dateFormat.format(cal.getTime()));
		   cal.add(Calendar.DATE, -1);
		   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime())); 
		/*Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		String today = df.format(date);
		int yesterday = Integer.parseInt(today) - 1;
		System.out.println(yesterday);*/
		driver.findElement(By.xpath("//span[contains(@class,'icon ic-calander')]")).click();
		driver.findElement(By.xpath("//div[@class='calendar left']/div/input[@class='input-mini form-control active']")).clear();
		
		driver.findElement(By.xpath("//div[@class='calendar left']/div/input[@class='input-mini form-control active']")).sendKeys(String.valueOf(dateFormat.format(cal.getTime())));
		driver.findElement(By.xpath("//div[@class='calendar left']/div/input[@class='input-mini form-control active']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='calendar right']/div/input")).click();
		driver.findElement(By.xpath("//div[@class='calendar right']/div/input")).clear();
		
		driver.findElement(By.xpath("//div[@class='calendar right']/div/input")).sendKeys(String.valueOf(dateFormat.format(cal.getTime())));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='SUBMIT']")).click();
		WebElement worktime = driver.findElement(By.xpath("(//span[@ng-reflect-count-from='0'])[1]"));
		   String work = worktime.getText();
		 System.out.println("Work Time :" + work+"hrs");
		 WebElement worktimeloss = driver.findElement(By.xpath("(//span[@ng-reflect-count-from='0'])[2]"));
		 String timeloss = worktimeloss.getText();
		 System.out.println("WORK TIME LOSS :" + timeloss+"hrs");
		 WebElement attendance = driver.findElement(By.xpath("(//span[@ng-reflect-count-from='0'])[3]"));
		 String attend = attendance.getText();
		 System.out.println("ATTENDANCE :" + attend+"%");
		 
		/*List<WebElement> li = driver.findElementsByXPath("//table[@class='table-condensed']//tr/td");
		
		for (WebElement webelement : li) {
			String text = webelement.getText();
			//System.out.println(text);
			if(webelement.getText().equals(yesterday)){
				webelement.click();
				break;
			}
			
		}
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}*/
		
		
	}

}
