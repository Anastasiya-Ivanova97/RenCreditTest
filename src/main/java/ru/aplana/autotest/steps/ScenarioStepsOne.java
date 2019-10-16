package ru.aplana.autotest.steps;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import io.qameta.allure.Step;
import ru.aplana.autotest.pages.DepositPage;
import ru.aplana.autotest.pages.MainPage;

public class ScenarioStepsOne {

        MainPage mainPage = new MainPage();
        DepositPage depositPage = new DepositPage();


    @Когда("выбрано меню с параметром String (.*)")
    @Step("выбрано меню с параметром {def}")
    public void chooseMenuItem(String def) {
        mainPage.chooseElement(def);
    }

    @Когда("выбрана валюта с параметром String (.*)")
    @Step("выбрана валюта {def}")
    public void chooseCorrectCurrency(String def) {
        depositPage.chooseCurrency(def);
    }

    @Когда("введена сумма вклада (.*)")
    @Step("введена сумма вклада {sum}")
    public void fillSum(String sum) {
        depositPage.fillForm(depositPage.getInputAmount(),sum);
    }

    @Когда("выбран срок вклада (.*)")
    @Step("выбран срок вклада {months}")
    public void selectPeriod(String months) {
        depositPage.selectCorrectPeriod(months);
    }


    @Когда("введено ежемесячное пополнение (.*)")
    @Step("введено ежемесячное пополнение {sum}")
    public void getMonthlyPayment(String sum) {
        depositPage.fillForm(depositPage.getInputReplenish(),sum);
    }

    @Когда("поставлена галочка Ежемесячная капитализация")
    @Step("поставлена галочка Ежемесячная капитализация")
    public void getCap() {
        depositPage.click(depositPage.getCap());
    }

    @Когда("поставлена галочка Частичное снятие")
    @Step("поставлена галочка Частичное снятие")
    public void getPart() {
        depositPage.click(depositPage.getPartial());
    }

    @Тогда("проверяется процентная ставка с параметром (.*)")
    @Step("проверяется процентная ставка с параметром {rate}")
    public void checkRate(String rate) {
        depositPage.checkParameter(depositPage.getRate(),rate);
    }

    @Тогда("проверяется итоговая сумма к снятию (.*)")
    @Step("проверяется итоговая сумма к снятию {totalSum}")
    public void checkTotalSum(String totalSum) {
        depositPage.checkParameter(depositPage.getResult(),totalSum);
    }

    @Тогда("проверяется пополнение (.*)")
    @Step("проверяется пополнение {rep}")
    public void checkReplenishment(String rep) {
        depositPage.checkParameter(depositPage.getReplenish(),rep);
    }

    @Тогда("проверяются начисленные проценты с параметром (.*)")
    @Step("проверяются начисленные проценты с параметром {p}")
    public void checkEarned(String p) {
        depositPage.checkParameter(depositPage.getEarned(),p);
    }

}
