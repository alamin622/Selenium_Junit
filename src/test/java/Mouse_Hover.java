import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover extends setup{
    @Test
    public void hover() {
        driver.get("https://green.edu.bd/");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.className("dropdown-toggle"));
        actions.moveToElement(element).perform();

//        List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),\"About Us\")]"));
//        actions.moveToElement(list.get(2)).perform();

    }
}
