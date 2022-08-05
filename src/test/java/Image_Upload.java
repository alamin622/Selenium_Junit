import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Image_Upload extends setup{
    @Test
    public void imageUpload() {
        driver.get("https://demoqa.com/upload-download");
        WebElement uploadElement = driver.findElement(By.id("uploadFile"));
        uploadElement.sendKeys("C:\\ad.png");
        String text = driver.findElement(By.id("uploadedFilePath")).getText();
        Assert.assertTrue(text.contains("ad.png"));
    }
}
