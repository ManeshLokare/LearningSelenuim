package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex_001 {
    public static void main(String[] args) {

//        System.out.println("Launch Chrome Browser");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");

//        System.out.println("Launch Firefox Browser");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://app.vwo.com");

          System.out.println("Launch Edge Browser");
          WebDriver driver = new EdgeDriver();
          driver.get("https://app.vwo.com");

//        driver.close();
         System.out.println("Launched Browser Successfully");

    }
}
