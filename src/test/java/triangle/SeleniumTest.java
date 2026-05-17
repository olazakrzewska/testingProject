package triangle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {

    @Test
    void testTriangleUI() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080");

        Thread.sleep(1000);

        driver.findElement(By.name("a")).sendKeys("3");
        Thread.sleep(500);

        driver.findElement(By.name("b")).sendKeys("4");
        Thread.sleep(500);

        driver.findElement(By.name("c")).sendKeys("5");
        Thread.sleep(500);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1500);

        String page = driver.getPageSource();

        assertTrue(page.contains("Perimeter"));

        driver.quit();
    }

    @Test
    void testInvalidTriangle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080");
        Thread.sleep(1000);

        driver.findElement(By.name("a")).sendKeys("1");
        Thread.sleep(500);
        driver.findElement(By.name("b")).sendKeys("2");
        Thread.sleep(500);
        driver.findElement(By.name("c")).sendKeys("10");
        Thread.sleep(500);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);

        String page = driver.getPageSource();

        assertTrue(page.contains("Invalid triangle"));

        driver.quit();
    }

    @Test
    void testExactValues() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080");
        Thread.sleep(1000);

        driver.findElement(By.name("a")).sendKeys("3");
        Thread.sleep(500);
        driver.findElement(By.name("b")).sendKeys("4");
        Thread.sleep(500);
        driver.findElement(By.name("c")).sendKeys("5");
        Thread.sleep(500);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);

        String text = driver.findElement(By.tagName("body")).getText();

        assertTrue(text.contains("Perimeter: 12"));
        assertTrue(text.contains("Area: 6"));

        driver.quit();
    }
}