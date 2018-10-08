package genericFunctions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import objectRepo.Or;
import runClass.*;

public class gfunctions extends browserlaunch{
	Or o = new Or();
	
	public void click(String ele){
		try {
			if(driver.findElement(Or.name).isDisplayed()){
				driver.findElement(Or.name).click();
				System.out.println(o.sample);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
     public static void radiobutton_mail_select(){
    	
    	
    	 WebElement mailRB = driver.findElement(By.id("sex-0"));
    	 mailRB.click();
    	 
     }
     
     public static void Checkbox_manual(){
  
    	 WebElement mcheck = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
    	 if(!mcheck.isSelected()){
    		 mcheck.click();
    	 }
     }
    		 
    	 public static void Checkbox_automation(){
     
        	 WebElement autocheck = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        	 if(!autocheck.isSelected()){
        		 autocheck.click();
        	 }
    	 
     }
    	 
    	 public static void dropdown_Continents(){
    	     
        	 WebElement ddcontinet = driver.findElement(By.name("continents"));
        	 Select sel = new Select(ddcontinet);
        	 sel.selectByVisibleText("Asia");
    	 }
public static void dropdown_Cammand(){
    	     
        	 WebElement ddCommand = driver.findElement(By.name("selenium_commands"));
        	 Select sel = new Select(ddCommand);
        	 sel.deselectByIndex(3);
    	 }
}