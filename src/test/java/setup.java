import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;


public class setup {
    WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headed");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }


    @After
    public void closeDriver(){
       // driver.close();
    }

}
