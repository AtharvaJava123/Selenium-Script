package Selenium3.Selenium3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Comprehensive5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073077\\Desktop\\msedgedriver.exe");
		  
	      WebDriver driver=new EdgeDriver();
	      
	      driver.get("https://www.eazydiner.com/");
	     
          driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	     try {
           if(driver.findElement(By.id("webpush-onsite")).isDisplayed()) {
    	       driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
    	       driver.findElement(By.id("allow")).click();
    	       driver.switchTo().defaultContent(); 
           }
           }
           catch (Exception e){
        	   
           } 
	      
		
	     
	    driver.findElement(By.xpath("//div[@class='swiper-slide meal_boxes-2 inline-block padding-r-10 swiper-slide-next'  ] ")).click();
	    
	    Select obj1=new Select(driver.findElement(By.id("res_sort")));
	    obj1.selectByValue("cost-asc");
	    
	    driver.findElement(By.xpath("//div[@class='filter_toogle']")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[1]/div/div[3]/div[2]/div[1]/a")).click();
	    
	    driver.findElement(By.id("amount")).sendKeys("100");
	    
	    driver.findElement(By.xpath("//*[@id=\"checkoutForm\"]/div[2]/button")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	      
		       
	    driver.findElement(By.id("fname")).sendKeys("Atharva");
	    driver.findElement(By.id("lname")).sendKeys("Tekade");
	    
	    driver.findElement(By.xpath("//div[@class='close pointer']")).click();
	    
	    driver.findElement(By.xpath("//div[@data-tab='menus']")).click();
	   
	    
	    driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();
	    
	    driver.findElement(By.xpath("//a[@id='login-btn']")).click();
	    
	    String number="7507616674";
	    if(number!="7507616074") {
	    	System.out.println("Invalid number");
	    	
	    	driver.findElement(By.xpath("//a[@class='goto_signup']")).click();
	    	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Atharva");
	    	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Tekade");
	    	driver.findElement(By.xpath("//input[@name='int-tel1']")).sendKeys("7507616074");
	    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("atharva@gmail.com");
	    	driver.findElement(By.xpath("//div[@class='slider']")).click();
	    	/*driver.findElement(By.xpath("//input[@id='signup-date']")).click();
	    	driver.findElement(By.xpath("//td[@class='dp_current']")).click();
	    	
	    	*/
	    
	    	
	    }else {
	    driver.findElement(By.xpath("//*[@id=\"form-mobile\"]/div[1]/div/input")).sendKeys("7507616074");
	    
	    }
	    
	}
	
	
}
