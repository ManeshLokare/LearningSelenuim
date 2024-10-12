package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BrowserLaunch {


    @Test ()
    public void chrome_browser()
    {
        System.out.println("Launch Chrome Browser");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println("Launched Browser Successfully");

    }

    @Test
    public void edge_browser()
    {
        System.out.println("Launch Edge Browser");
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println("Launched Browser Successfully");
    }

    @Test
    public void firefox_browser()
    {
        System.out.println("Launch Firefox Browser");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println("Launched Browser Successfully");
    }








}
