package ru.aplana.autotest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;
import java.util.function.Function;

public class DepositPage extends BasePage{
    @FindBy(xpath = "//div[@class='calculator__currency-content']")
    WebElement currencyRow;

    @FindBy(xpath = "//input[@name='amount']")
    WebElement inputAmount;

    @FindBy(xpath = "//input[@name='replenish']")
    WebElement inputReplenish;

    @FindBy(xpath = "//div[@class='range-scale__item range-scale__item_1' and text()='6']")
    public WebElement clickOnSelectPeriod;


    @FindBy(xpath = "//span[text()='Частичное снятие']")
    WebElement partial;

    @FindBy(xpath = "//span[text()='Ежемесячная капитализация']")
    WebElement cap;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    WebElement rate;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    WebElement earned;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    WebElement replenish;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    WebElement result;


    public void chooseCurrency(String name) {
        WebElement element = currencyRow.findElement(By.xpath(".//span[text()="+name+"]"));
        click(element);
    }

    public void fillForm(WebElement element, String keys) {
        click(element);
        element.sendKeys(Keys.chord(keys));
     }

     public void selectCorrectPeriod(String months) {
        WebElement element = driver.findElement(By.xpath("//div[@class='range-scale range-scale_item_6']/div[text()="+months+"]"));
        element.click();
     }

     public void checkParameter(WebElement element, String check) {
         Function<? super WebDriver, Object> isResultChanged = new ExpectedCondition<Object>() {
             @Override
             public Boolean apply(WebDriver webDriver) {
                 return element.getText().replaceAll("\\D","").equals(check.replaceAll("\\D",""));
             }
         };
         wait.until(isResultChanged);
         Assert.assertTrue(element.getText().replaceAll("\\D","").equalsIgnoreCase(check.replaceAll("\\D","")));
     }

    public WebElement getInputAmount() {
        return inputAmount;
    }

    public WebElement getClickOnSelectPeriod() {
        return clickOnSelectPeriod;
    }

    public WebElement getInputReplenish() {
        return inputReplenish;
    }

    public WebElement getPartial() {
        return partial;
    }

    public WebElement getCap() {
        return cap;
    }

    public WebElement getRate() {
        return rate;
    }

    public WebElement getEarned() {
        return earned;
    }

    public WebElement getReplenish() {
        return replenish;
    }

    public WebElement getResult() {
        return result;
    }
}
