package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Browser_Options {

    @Test
    public void browser_specific_options()
    {   // options to browsers ( EdgeOptions,FireFoxOptions, SafariOptions)
        // ChromeOptions -> It will help you set the browser
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // local-storage, download ?

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
      //  driver.manage().window().maximize();
      //  driver.navigate().to("https://vwo.com");
        driver.get("https://vwo.com");

    }



}
