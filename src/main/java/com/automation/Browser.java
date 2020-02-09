package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static void main(String[] args) {

        Browser browser=new Browser();
        browser.openApplication();
    }

    public WebDriver openApplication() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "\\etc\\chromedriver.exe");
        driver.get("https://www.dsw.com/en/us/");
        return driver;
    }
}
