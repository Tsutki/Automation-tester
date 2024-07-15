package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration; // Add this import

import static org.testng.Assert.assertTrue;

public class PunchInSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration
        driver.get("http://example.com/dashboard"); // Replace with actual URL
    }

    @When("User performs PunchIn")
    public void user_performs_punch_in() {
        // Wait until the PunchIn button is visible and clickable
        WebElement punchInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("punchInButton")));
        punchInButton.click();
    }

    @Then("Toast message should be displayed saying {string}")
    public void toast_message_should_be_displayed_saying(String expectedMessage) {
        // Wait until the toast message is visible
        WebElement toastMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toastMessageId")));
        String actualMessage = toastMessageElement.getText();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}

