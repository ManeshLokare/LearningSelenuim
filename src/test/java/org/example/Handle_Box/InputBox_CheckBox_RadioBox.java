package org.example.Handle_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class InputBox_CheckBox_RadioBox {
    public static void main(String[] args) {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input Box
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();








    }
}