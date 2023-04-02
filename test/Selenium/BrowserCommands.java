import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class BrowserCommands
{
    static RemoteWebDriver driver;
    public static void main(String[] args) throws InterruptedException

    {
        System.out.print("\n1 - Chrome, 2 - Firefox, 3 - Edge, 4 - Safari \nPlease select a option 1 to 4 driver to perform automation:");

        Scanner input1 = new Scanner(System.in);
        int selectBrowser = input1.nextInt();

        if(selectBrowser==1)
        {
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(option);
        }
        else if(selectBrowser==2)
        {
            driver =  new FirefoxDriver();
        }
        else if(selectBrowser==3)
        {
            driver =  new EdgeDriver();
        }
        else if(selectBrowser==4)
        {
            driver = new SafariDriver();
        }

        BrowserCommands obj = new BrowserCommands();
        obj.code();

        driver.close();

    }

    public void code() throws InterruptedException
    {

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/checkboxradio/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();

        String url = driver.getCurrentUrl();
        System.out.println("Current URL: "+url);

        String title = driver.getTitle();
        System.out.println("Page Title: "+title);

//        String  source = driver.getPageSource();
//        System.out.println("Page Source: "+source);

        String session = String.valueOf(driver.getSessionId());
        System.out.println("Session ID: "+session);

    }

}
