package ru.qa_scooter.praktikum_services.webtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AboutRentPage;
import pageobjects.MainPage;
import pageobjects.ForWhoTheScooterPage;

@RunWith(Parameterized.class)
public class MakeOrderTest {

        private final String name;
        private final String soName;

        private final String address;

        private final String orderButtonClass;

        public MakeOrderTest(String name, String soName, String address,String orderButton ) {
            this.name = name;
            this.soName = soName;
            this.address = address;
            this.orderButtonClass = orderButton;
        }

        @Parameterized.Parameters(name = "{index}:Test with cssLocator: {3}")
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Леголас", "Гринлиф", "Лихолесье", ".Button_Button__ra12g"},
                    {"Арагорн", "Эллисар", "Минас Тирит", ".Button_Button__ra12g.Button_Middle__1CSJM"},
            };

        }

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void makeOrder() {

            MainPage obgLanding = new MainPage(driver);
            ForWhoTheScooterPage objOrderPage = new ForWhoTheScooterPage(driver);
            AboutRentPage objAboutRentPage = new AboutRentPage(driver);

            //Главная страница
            obgLanding.clickCookieButton();
            obgLanding.clickOrderButton(orderButtonClass);

            //Страница Для кого самокат
            objOrderPage.fillNameField(name);
            objOrderPage.fillSonameField(soName);
            objOrderPage.fillAddressField(address);
            objOrderPage.fillMetroStationField();
            objOrderPage.fillPhoneNumberField();
            objOrderPage.clickContinueButton();

            //Страница Про аренду
            objAboutRentPage.setDateInDataField();
            objAboutRentPage.clickRentPeriodField();
            objAboutRentPage.setRentPeriodInDropDownList();
            objAboutRentPage.clickBlackColourCheckBox();
            objAboutRentPage.textCommentForCourier();
            objAboutRentPage.clickMakeOrderButton();
            objAboutRentPage.clickYesButton();

            //Проверить получение текста "Заказ оформлен"
            String actualText = objAboutRentPage.checkTextOrderHasBeenPlaced();

            //Проверить, что текст на экране: "Заказ оформлен"
            String expectedText = "Заказ оформлен";

            //Сравнить полученный и фактический текст:
            Assert.assertEquals(expectedText, actualText);
        }

    @After
    public void teardown() {
        driver.quit();
    }

    }
