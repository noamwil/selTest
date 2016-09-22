import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shaysa on 21/09/2016.
 */
public class PageObject
{
    WebDriver driver;
    String signInButtonExp = "signIn";
    public PageObject(WebDriver driver)
    {
        this.driver = driver;
    }

    public String ReadText()
    {
        WebElement element = driver.findElement(By.id(signInButtonExp));
        return  element.getAttribute("value");
    }
}
