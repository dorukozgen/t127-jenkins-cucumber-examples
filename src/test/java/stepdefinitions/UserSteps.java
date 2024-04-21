package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

public class UserSteps {

    @Given("User opens the website")
    public void user_opens_the_website() {
        System.out.println("User opens the website");
    }

    @Given("User enters correct username and password")
    public void user_enters_correct_username_and_password() {
        System.out.println("User enters correct username and password");
    }

    @Given("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("User should be logged in successfully");
    }

    @Given("User enters incorrect username and password")
    public void user_enters_incorrect_username_and_password() {
        System.out.println("User enters incorrect username and password");
    }

    @Given("User should not be logged in successfully")
    public void user_should_not_be_logged_in_successfully() {
        System.out.println("User should not be logged in successfully");
        Assertions.fail("User should not be logged in successfully");
    }
}
