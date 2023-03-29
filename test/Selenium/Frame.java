import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Frame
{
    static RemoteWebDriver driver;
    public static void main(String[] args) throws InterruptedException
    {
        System.out.print("\n1 - Chrome, 2 - Firefox, 3 - Edge, 4 - Safari \nPlease select a option 1 to 4 driver to perform automation:");

        Scanner input1 = new Scanner(System.in);
        int selectBrowser = input1.nextInt();

        if (selectBrowser == 1)
        {
            driver = new ChromeDriver();
        }
        else if (selectBrowser == 2)
        {
            driver = new FirefoxDriver();
        }
        else if (selectBrowser == 3)
        {
            driver = new EdgeDriver();
        }
        else if (selectBrowser == 4)
        {
            driver = new SafariDriver();
        }

        BrowserCommands obj = new BrowserCommands();
        obj.code();
    }

    public void frameCode() throws InterruptedException
    {
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/checkboxradio/");

        // Frame can be switched using Index, ID/Name and WebElement

        WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(frame);

        Thread.sleep(2000);
        WebElement radio = driver.findElement(By.xpath("//label[@for='radio-1']"));
        radio.click();

        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.xpath("//label[@for= 'checkbox-1']"));
        checkbox.click();

    }
}
