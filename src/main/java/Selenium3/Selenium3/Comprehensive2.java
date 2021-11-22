package Selenium3.Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Comprehensive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073077\\Desktop\\msedgedriver.exe");
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://www.eazydiner.com/");
	     
	    
	    driver.get("https://www.eazydiner.com/"); 
	    
	  
	    
	    driver.findElement(By.xpath("//span[text()='Book a Table']")).click();

	    
	    driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
	    driver.findElement(By.xpath("//input[@id='guest_name']")).sendKeys("Siddharth Mote");
	    driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("8312364876");
	    
	    driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("Siddharthmote45@gmail.com");
	
	    driver.findElement(By.xpath("//*[@id='checkout-button']")).click();
	   	

	}

}
