import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Write_TextBox extends setup {
    @Test
    public void writeText() {
        driver.get("https://demoqa.com/text-box");
        WebElement txtFirstname = driver.findElement(By.cssSelector("input"));
        txtFirstname.sendKeys("Abeer");
    }
}
