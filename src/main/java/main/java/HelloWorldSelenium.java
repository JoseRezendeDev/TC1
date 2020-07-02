package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
    public static void main(String[] args) {
        String userPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", userPath + "/lib/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(userPath + "/seleniumJavaTest.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("nome")).sendKeys("Jose Rezende");
        driver.findElement(By.id("rg")).sendKeys("11222333-0");
        driver.findElement(By.id("cpf")).sendKeys("111.222.333-44");
        driver.findElement(By.id("endereco")).sendKeys("Rua Selenium Java");
        driver.findElement(By.id("dataNascimento")).sendKeys("25/06/2020");
        driver.findElement(By.linkText("Link para Google")).click();
    }
}
