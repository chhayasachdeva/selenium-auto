package com.automation;

import org.junit.gen5.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.gen5.api.Assertions.assertEquals;


public class BrowserCommands {
private final static String URL="https://www.naturalpartners.com";

    public static void main(String[] args) {
//verifyPageTitle();
verifyCurrentURL();viewPageSource();
    }


   static void  verifyPageTitle(){
        WebDriver webDriver =new Browser().openApplication(URL);
        String pageTitle =webDriver.getTitle();
        System.out.println(pageTitle);
        String expectedTitle="Wholesale Vitamins, Wholesale Supplements From Natural Partners";
        assertEquals(expectedTitle,pageTitle);
        //get current URL
      String currentUrl=webDriver.getCurrentUrl();
        webDriver.close();


     }

    static void  verifyCurrentURL(){
        WebDriver webDriver =new Browser().openApplication(URL);
        String pageTitle =webDriver.getTitle();
        System.out.println(pageTitle);
        String expectedTitle="Wholesale Vitamins, Wholesale Supplements From Natural Partners";
        assertEquals(expectedTitle,pageTitle);
        //get current URL
        String currentUrl=webDriver.getCurrentUrl();
        System.out.println(currentUrl+"CurrentURL");
        webDriver.close();


    }

    static void  viewPageSource(){
        WebDriver webDriver =new Browser().openApplication(URL);
        String pageTitle =webDriver.getTitle();
        System.out.println(pageTitle);
        String expectedTitle="Wholesale Vitamins, Wholesale Supplements From Natural Partners";
        assertEquals(expectedTitle,pageTitle);
        //get current URL
        String pageSource=webDriver.getPageSource();

        pageSource.contains("https");
        System.out.println(pageSource + "pageSource");
        webDriver.close();


    }

}
