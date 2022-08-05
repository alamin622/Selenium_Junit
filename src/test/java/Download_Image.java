import org.junit.Test;
import org.openqa.selenium.By;

public class Download_Image extends setup{
    @Test

    public void downloadImage() {
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.id("downloadButton")).click();
    }
}
