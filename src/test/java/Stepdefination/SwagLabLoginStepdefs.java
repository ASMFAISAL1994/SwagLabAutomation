package Stepdefination;

import Core.Helper;
import POM.Element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SwagLabLoginStepdefs {
    public static WebDriver driver;

    Element element;


    @Given("base url of swag lab")
    public void baseUrl() {
        Helper helper = new Helper();
        driver=helper.browser();


    }

    @And("user will Give credentials of his {string}, {string}")
    public void userWillGiveCredentialsOfHis(String UserName, String Password) throws InterruptedException {
        element = new Element(driver);
       element.UserNamePassword(UserName, Password);

    }


    @And("user will click Login Button")
    public void Login() throws InterruptedException {
        element.Login();

    }

    @Then("user will successfully login to products page")
    public void successfullyOnProductsPage() throws InterruptedException {
        element.successfullyOnProductsPage();

    }



}
