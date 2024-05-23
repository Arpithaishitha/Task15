package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args)
    {
        //Open the browser
        ChromeDriver chromedriver = new ChromeDriver();
        //Navigate to website
        chromedriver.get("https://google.com");
        //locate id
        By by = By.id("APjFqb");
        //find by element
        WebElement element = chromedriver.findElement(by);
        //search for Selenium Browser Driver
        element.sendKeys("Selenium Browser Driver");
        //click on enter
        element.sendKeys(Keys.ENTER);
    }



}
