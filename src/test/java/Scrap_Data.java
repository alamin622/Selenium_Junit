import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Scrap_Data extends setup{
    @Test
    public void webTables(){

        driver.get("https://demoqa.com/webtables");
        WebElement table = driver.findElement(By.className("rt-tbody"));
        List<WebElement> allRows = table.findElements(By.className("rt-tr"));
        int i=0;
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.className("rt-td"));
            for (WebElement cell : cells) {
                i++;
                System.out.println("num["+i+"] "+ cell.getText());

            }
        }
    }
}
