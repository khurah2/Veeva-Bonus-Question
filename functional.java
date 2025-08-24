/**
 * Verify calculator loads successfully in Chrome.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functional1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.calculator.net/carbohydrate-calculator.html");

        if(driver.getTitle().contains("Carbohydrate Calculator")) {
            System.out.println("Test Passed: Page loaded successfully");
        } else {
            System.out.println("Test Failed: Page did not load");
        }

        driver.quit();
    }
}
