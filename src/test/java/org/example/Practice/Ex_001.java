package org.example.Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_001 {
    @Description ("Check VWO login with un-register user")
    @Test
    public void test_loginNegative()  {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // find the element using locators....
       // enter username
        WebElement email_inputbox = driver.findElement(By.id("login-username"));
       email_inputbox.sendKeys("abc0097@gmail.com");
       // enter password
       WebElement password_inputbox= driver.findElement(By.id("login-password"));
       password_inputbox.sendKeys("123456");
       // click on sign in
        WebElement signin_button = driver.findElement(By.id("js-login-btn"));
        signin_button.click();
      // check error notification
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

       driver.quit();
    }





}
