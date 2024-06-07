package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Element {

    WebDriver driver;

    public Element(WebDriver driver){
        this.driver=driver;

    }

    public void UserNamePassword(String UserName,String Password) throws InterruptedException {
        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);

    }
    public void Login() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);

    }
    public void successfullyOnProductsPage() throws InterruptedException {
        System.out.println("successfully login");

    }

    public void BackPack() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='add-to-cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='back-to-products']")).click();

    }
    public void BikeLight() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='add-to-cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='back-to-products']")).click();

    }
    public void AddTocartMultipleProducts() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        Thread.sleep(1000);
//        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
//        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//Button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();


    }
    public void ShoppingCartContainer() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Asm");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Faisal");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("1207");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small']")).click();
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();



    }


}
