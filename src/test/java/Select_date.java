import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Select_date extends setup {

    @Test
    public void selectDate() throws InterruptedException {
        driver.get("https://demoqa.com/date-picker");
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.id("datePickerMonthYearInput")));
//        actions.click();
//        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);
//        Thread.sleep(3000);
//        actions.sendKeys("07-12-2018");
//        actions.sendKeys(Keys.TAB);
//        actions.build().perform();

        Actions actions = new Actions(driver);
        WebElement txt = driver.findElement(By.id("datePickerMonthYearInput"));
//         actions.moveToElement(txt).
//                doubleClick().click().
//                sendKeys(Keys.BACK_SPACE).
//                keyDown(Keys.BACK_SPACE).
//                keyUp(Keys.BACK_SPACE).
//        perform();
        txt.sendKeys(Keys.CONTROL + "a");
        txt.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        txt.sendKeys("02/02/2012");
        txt.sendKeys(Keys.ENTER);
    }
}
