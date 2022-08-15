package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestMenu {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        //options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        //new faces, media, nature, food, travel, science, psychology, work, society, history, relationships

        WebElement new_faces = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[1]"));
        new_faces.click();
        WebElement media = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[2]"));
        media.click();
        WebElement nature = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[3]"));
        nature.click();
        WebElement food = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[4]"));
        food.click();
        WebElement travel = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[5]"));
        travel.click();
        WebElement science = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[6]"));
        science.click();
        WebElement psychology = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[7]"));
        psychology.click();
        WebElement job = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[8]"));
        job.click();
        WebElement society = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[9]"));
        society.click();
        WebElement history = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[10]"));
        history.click();
        WebElement relationships = driver.findElement(By.xpath(".//ul [@class=\"categories__list js--limited-list\"]/li[11]"));
        relationships.click();
        driver.get("https://www.livejournal.com/");
        driver.quit();
    }
}