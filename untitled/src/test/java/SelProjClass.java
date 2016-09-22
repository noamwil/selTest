import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shaysa on 21/09/2016.
 */
public class SelProjClass
{
    WebDriver driver;
    int timeoutInSeconds = 30000;
    @Test
    public void selTest()
    {

        driver = new ChromeDriver();
        driver.navigate().to("http://www.gmail.com");

        PageObject pageObject = new PageObject(driver);
        String text = pageObject.ReadText();

        Assert.assertEquals(text,"Sign in","The action succeed");
        if(text.equals("Sign in"))
        {
            System.out.println("It equals");
        }




    }
}
