package Stepdefination;

import Core.Helper;
import POM.Element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static Stepdefination.SwagLabLoginStepdefs.driver;

public class AddToCartStepdefs {
    Element element;
    @Given("user in products page")
    public void BackPack() throws InterruptedException {
        Helper helper = new Helper();
        element=new Element(driver);
        System.out.println("successfuly landing on product page");
        element.BackPack();
    }


    @And("user will also choose Sauce Labs Bike Light")
    public void BikeLight() throws InterruptedException {
     element.BikeLight();

    }

    @And("user will add to cart his preferred more items from cart")
    public void AddTocartMultipleProducts() throws InterruptedException {
     element.AddTocartMultipleProducts();

    }

    @Then("user will go to cart section to checkout")
    public void ShoppingCartContainer() throws InterruptedException {
        element.ShoppingCartContainer();
    }
}
