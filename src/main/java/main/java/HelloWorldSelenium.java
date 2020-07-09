package main.java;

import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWorldSelenium {
    public static void main(String[] args) throws InterruptedException {
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
        driver.findElement(By.id("imagemCirculo")).click();
        driver.findElement(By.id("imagemCirculo")).isDisplayed();
        driver.findElement(By.id("dropDownNumeros")).isSelected();
        Select select = new Select(driver.findElement(By.id("dropDownNumeros")));
        select.selectByVisibleText("Brasil");
        String rg = driver.findElement(By.id("rg")).getText();
        if (rg.matches("^[0-9]")) {
            System.out.println("okay");
        } else {
            System.out.println("RG invalido");
        }
    }
}
