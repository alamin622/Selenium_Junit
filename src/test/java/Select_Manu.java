import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Select_Manu extends setup {
    @Test
    public void selectManu() {
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByValue("5");
        Select cars = new Select(driver.findElement(By.id("cars")));
        if (cars.isMultiple()) {
            cars.selectByValue("volvo");
            cars.selectByValue("audi");
        }

    }
}
