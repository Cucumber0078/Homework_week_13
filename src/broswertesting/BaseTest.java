package broswertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
        public static WebDriver driver;

        public void openBroswer(String baseUrl) {
            System.setProperty("webdriver.chrome.driver.", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            //Lunch Web Url
            driver.get(baseUrl);
            //maximise Windows
            driver.manage().window().maximize();
            //we give implicity time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }
        public void closeBroswer(){
            driver.close();
        }

    }
