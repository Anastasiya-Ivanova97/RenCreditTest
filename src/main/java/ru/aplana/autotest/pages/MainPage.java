package ru.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{
    @FindBy(xpath = "//div[@class='services services_main']")
    WebElement mainBox;

    public void chooseElement(String name) {
        WebElement element = driver.findElement(By.xpath("//div[@class='service__title-text' and text()="+name+"]/preceding-sibling::a"));
        click(element);
    }
}
