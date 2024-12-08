package javanewproject.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
    WebDriver driver;

    @Given("I open Google homepage")
    public void i_open_google_homepage() {
        driver = new ChromeDriver();  // Initialize WebDriver (make sure to set up the driver correctly)
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        // Implement the search functionality here
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("q")).submit();
    }

    @Then("I click the BMW Canada link")
    public void i_click_the_bmw_canada_link() {
        // Implement clicking the BMW Canada link here
        driver.findElement(By.partialLinkText("BMW Canada")).click();
    }

    @Then("I wait for {int} seconds")
    public void i_wait_for_seconds(Integer seconds) throws InterruptedException {
        // Implement waiting for a specific number of seconds
        Thread.sleep(seconds * 1000);
    }
}
