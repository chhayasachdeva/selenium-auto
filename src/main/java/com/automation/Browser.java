package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static void main(String[] args) {
        Browser browser=new Browser();
        browser.openApplication("");
    }

    /**
     * Create new object and open browser
     * @return
     */
    public WebDriver openApplication(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\workspace\\selenium-auto\\etc\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // open application
        driver.get(url);
        return driver;
    }
}
