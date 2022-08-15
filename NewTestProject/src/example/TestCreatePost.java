package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestCreatePost {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        //options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        WebElement enter = driver.findElement(By.xpath(".//ul [@class=\"s-do\"]/li[2]"));
        enter.click();
        WebElement name = driver.findElement(By.xpath(".//input[@id='user']"));
        name.sendKeys("VeraGrom");
        WebElement password = driver.findElement(By.xpath(".// input [@name='password']"));
        password.sendKeys("y%qXHvn2^M=diG9");
        WebElement login = driver.findElement(By.xpath(".//button [@ name='action:login']"));
        login.click();
        //WebElement create_post = driver.findElement(By.xpath(".//span[@class='s-header-item-post--long']"));
       // create_post.click();
       // WebElement create_post = driver.findElement(By.xpath(".//ul [@class=\"s-do\"]/li[4]"));
       // create_post.click();

       // WebElement create_post = driver.findElement(By.xpath(".//div[@class=\"s-header-extra__menu-icon\"]/ul/li[1]"));
      //  create_post.click();

driver.quit();



    }
}
