package Automation.OzSale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount {

    public WebDriver driver;

    @Test
    public void createAccount(){
        driver = new ChromeDriver();

        // Get the link of the website
        driver.get("https://www.ozsale.com.au/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Login")));

        driver.findElement(By.linkText("Login")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@name, 'firstName')]"));
        firstName.sendKeys("Shubham");
        WebElement lastName = driver.findElement(By.xpath("//input[contains(@name, 'lastName')]"));
        lastName.sendKeys("Sah");
        WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'email')]"));
        email.sendKeys("shubhamsah086@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[contains(@name, 'password')]"));
        password.sendKeys("Whysoserious123");

        WebElement signUp = driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
        signUp.click();
    }
}
