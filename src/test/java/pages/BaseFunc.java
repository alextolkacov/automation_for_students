package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C://QA//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openPage(String url) {
        if (!url.contains("https://") && !url.contains("http://")) {
            url = "http://" + url;
        }
        driver.get(url);
        Cookie cookie = new Cookie("qa-mode", "true");
        driver.manage().addCookie(cookie);
    }

    public WebElement getElement(By locator) {
        Assertions.assertFalse(getAllElements(locator).isEmpty(), "Element is not found");
        return driver.findElement(locator);
    }

    public List<WebElement> getAllElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "Elements not found");
        return driver.findElements(locator);
    }

    public void waitForElemnt(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}
