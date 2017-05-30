package com.pack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Admin on 25.05.2017.
 */
public class NewProj {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,50);
    }

    @Test
    public void TestOpenGoogle() {
        driver.get("http://litecart.com/admin/");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin");
        driver.findElement(By.cssSelector("#box-login button")).click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=appearance]")).click();
        driver.findElement(By.cssSelector("#main h1")).click();

        driver.findElement(By.cssSelector("a[href*=logotype]")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-product_groups a")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-option_groups")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-manufacturers")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-suppliers")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-delivery_statuses")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-sold_out_statuses")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-quantity_units")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("a[href*=countries]")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("a[href*=currencies]")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("#doc-newsletter")).click();
        driver.findElement(By.tagName("h1"));

        driver.findElement(By.cssSelector("a[href*=geo_zones]")).click();
        driver.findElement(By.tagName("h1"));

        driver.quit();
    }

    @After
    public void stop(){
    }
}




