package ru.qa_scooter.praktikum_services.webtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;

public class CheckTextInDropDownListTest {
    private WebDriver driver;
    @Test
    public void checkTextInDropDownList() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage objMainPage = new MainPage(driver);

        //Главная страница:
        objMainPage.clickCookieButton();
        objMainPage.clickArrowInDropDownList();
        String actualText = objMainPage.getTextInDropDownList();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        //Сравнить ожидаемый и полученный текст:
        Assert.assertEquals(expectedText, actualText);

    }
    @After
    public void teardown() {
        driver.quit();
    }

}
