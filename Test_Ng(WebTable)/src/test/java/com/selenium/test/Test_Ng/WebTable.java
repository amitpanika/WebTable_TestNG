package com.selenium.test.Test_Ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	@Test
	public void Table() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\HP\\eclipse-workspace\\Test_Ng(WebTable)\\samplttable.html");
        
        String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println("text");
        
        // Find total row in webTable.
        List<WebElement> roeList = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("rows:" + roeList.size());
        
        // Find total column in webTable.
        List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("column:" + columnList.size());
			
		}
	}

	


