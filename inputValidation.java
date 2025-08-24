/**
 * Verify Age field accepts only numeric input.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class inputValidation1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.calculator.net/carbohydrate-calculator.html");

        WebElement age = driver.findElement(By.id("cage"));
        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));

        // Enter invalid input (non-numeric)
        age.clear();
        age.sendKeys("test");

        // Click Calculate
        calculate.click();

        // Locate error message
        WebElement findError = driver.findElement(By.xpath("//*[contains(text(),'Please provide an age between 18 and 80.')]"));

        // Print result
        if (findError.isDisplayed()) {
            System.out.println("Test Passed: Error message displayed for invalid input.");
        } else {
            System.out.println("Test Failed: No error message for invalid input.");
        }

        driver.quit();

    }
}
