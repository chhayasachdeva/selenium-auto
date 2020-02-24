package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BrowserNavigationCommands {
    static void browsernavigation() {
        WebDriver webDriver = new Browser().openApplication("https://www.naturalpartners.com");
       // WebDriver webdriverToolsQA= new Browser().openApplication("https://www.toolsqa.com");
        System.out.println(webDriver.getCurrentUrl());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/ul/li[1]/a")).click();
        webDriver.navigate().back();
       webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().forward();

        webDriver.navigate().refresh();
        webDriver.close();

        //WebElement nutritionalSupplements =webDriver.findElement(By.linkText("/us/browse/nutritional-supplements/_/N-102458"));
        //nutritionalSupplements.click();
        //System.out.println(webdriverToolsQA.getCurrentUrl());



    }

    public static void main(String[] args) {
        browsernavigation();
    }
}


