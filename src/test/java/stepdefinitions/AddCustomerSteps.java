package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddCustomerSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the add customer page")
    public void user_is_on_the_add_customer_page() {
        driver.get("http://example.com/add-customer");
    }

    @When("User enters customer details {string} and {string}")
    public void user_enters_customer_details(String name, String email) {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement emailField = driver.findElement(By.id("email"));
        nameField.sendKeys(name);
        emailField.sendKeys(email);
    }

    @And("User clicks on add customer button")
    public void user_clicks_on_add_customer_button() {
        WebElement addCustomerButton = driver.findElement(By.id("addCustomerButton"));
        addCustomerButton.click();
    }

    @Then("Customer should be added successfully")
    public void customer_should_be_added_successfully() {
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        String message = successMessage.getText();
        Assert.assertEquals(message, "Customer added successfully");
        driver.quit();
    }
}
