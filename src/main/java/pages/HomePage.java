package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /**Constructor*/
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**Variables*/
    String baseURL = "http:\\google.pl";

    /**Page Methods*/
    @Step("open google main page step")
    public HomePage openGoogle() {
        driver.get(baseURL);
        return this;
    }
}