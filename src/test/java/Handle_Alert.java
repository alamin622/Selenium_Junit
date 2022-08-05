import org.junit.Assert;
import org.openqa.selenium.By;

public class Handle_Alert extends setup{
    public void handleAlert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id(("promtButton"))).click();
        driver.switchTo().alert().sendKeys("Fahim");
        Thread.sleep(10000);
        driver.switchTo().alert().accept();
        String text = driver.findElement(By.id("promptResult")).getText();
        Assert.assertTrue(text.contains("Abeer"));
    }
}
