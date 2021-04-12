import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDFC_Maven {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ekpoo\\\\Desktop\\\\TekArch\\\\Selenium\\\\DriverLinks\\\\chromedriver_win32\\\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/");
    }
}
