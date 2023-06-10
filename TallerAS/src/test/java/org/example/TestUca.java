package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestUca {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /*@Test
    public void escribirEnLaBarraDeBusqueda() {
        WebElement barra = driver.findElement(By.name("q"));
        barra.click();
        barra.sendKeys("UCA");
    }*/

    @Test
    public void hacerLogin() {
        WebElement userInput = driver.findElement(By.id("user-name"));
        userInput.click();
        userInput.sendKeys("standard_user");

        WebElement passInput = driver.findElement(By.id("password"));
        passInput.click();
        passInput.sendKeys("secret_sauce");

        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();

        WebElement addInput1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addInput1.click();

        WebElement addInput2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addInput2.click();

        WebElement cartInput = driver.findElement(By.id("shopping_cart_container"));
        cartInput.click();

        WebElement deleteInput1 = driver.findElement(By.id("remove-sauce-labs-backpack"));
        deleteInput1.click();

        WebElement deleteInput2 = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        deleteInput2.click();

        WebElement checkoutInput = driver.findElement(By.id("checkout"));
        checkoutInput.click();

    }
}
