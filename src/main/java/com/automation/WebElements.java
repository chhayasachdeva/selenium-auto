package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WebElements {
    static void WebElementsSendKeys() {
        WebDriver webDriver = new Browser().openApplication("https://www.naturalpartners.com");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Get the text value from link
//String Gettext =webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/ul/li[1]/a")).getText();
     //  System.out.println("Get text is "+ Gettext);

        // get the tag name
        /*String GetTagname =webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/ul/li[1]/a")).getTagName();
          System.out.println("Get Tag Name is "+ GetTagname);*/

          // Get the CSS Value
        //Get the attribute
        String GetAtrribute =webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/ul/li[1]/a")).getAttribute("xpath");
        System.out.println("Get Attribute Name is "+ GetAtrribute);
        //send the parameter by using send keys
        webDriver.findElement(By.id("userName")).sendKeys("wholesale01@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("Password@1");
         webDriver.findElement(By.linkText("Forgot password?")).click();
        //webDriver.findElement(By.xpath("/html/body/div[7]/div/form/div[3]/div[5]/input[3]")).click();
        webDriver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/form/div[4]/div/input[1]")).click();

        //check that field name display the correct value
        Boolean Status = webDriver.findElement(By.id("userName")).isDisplayed();
        System.out.println("Status is "+Status);
        //check the element is currently enabled
       Boolean Enabled= webDriver.findElement(By.id("userName")).isEnabled();
       System.out.println("Username is enabled"+Enabled);
        //webDriver.findElement(By.xpath("/html/body/div[7]/div/form/div[3]/div[1]/h2")).isDisplayed();
   //webDriver.close();
    }

    static void SelectCommand(){
        WebDriver webDriver = new Browser().openApplication("https://www.naturalpartners.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/ul/li[1]/a")).click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Boolean selected =webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/section/div[2]/div[4]/div/ul/li[1]/div/span/input")).isSelected();
     System.out.println("Checkbox is selected " + selected);
    }


    public static void main(String[] args) {
        WebElementsSendKeys();
        //SelectCommand();
    }
}
