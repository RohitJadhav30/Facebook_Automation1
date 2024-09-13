package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
    public WebDriver driver;

    @Test
    public void login() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("8805503582");
        driver.findElement(By.id("pass")).sendKeys("rohit@2000");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void signUp() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Rohit");
        driver.findElement(By.name("lastname")).sendKeys("Jadhav");
        driver.findElement(By.name("reg_email__")).sendKeys("cilop48680@esterace.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Test@1234");
        driver.findElement(By.id("day")).click();
        driver.findElement(By.xpath("//*[@id=\"day\"]/option[30]")).click();
        driver.findElement(By.id("month")).click();
        driver.findElement(By.xpath("//*[@id=\"month\"]/option[4]")).click();
        driver.findElement(By.id("year")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[25]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}

