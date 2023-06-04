import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class WebSiteTest {
    WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by");
    }

    @Test
    public void testWebSite() {
        List<String> expectList = new ArrayList<>(Arrays.asList("Автомобильные шины", "Моторные масла", "Велосипеды", "Мангалы, грили, барбекю", "Палатки", "Спальные мешки",
                "Мобильные телефоны", "Массажеры и массажные кресла", "Пылесосы"));
        String items = "project-navigation__list project-navigation__list_secondary";
        List<WebElement> element = driver.findElements(By.className(items));
        List<String> actualItems = new ArrayList<>();
        for(WebElement list :element) {
            actualItems.add(list.getText());
        }
        System.out.println(actualItems);
        Collections.sort(expectList);
        Collections.sort(actualItems);
        Assertions.assertEquals(expectList, actualItems);
}
    @AfterEach
    public void end() {
        driver.quit();
    }

}