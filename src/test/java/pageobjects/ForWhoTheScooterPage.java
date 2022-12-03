package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ForWhoTheScooterPage {
    //Создаем переменную driver
    private WebDriver driver;

    //Конструктор
    public ForWhoTheScooterPage(WebDriver driver) {
        this.driver = driver;
    }
    //Форма "Для кого самокат":
    //Локаторы полей

    //Поле Имя
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");

    //Поле Фамилия
    private By sonameField = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле Адрес
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле Станция Метро
    private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

    // Номер телефона
    private By phoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Кнопка Далее
    private By continueButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");


    //Методы//

    //Заполнить поле имя
    public void fillNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void fillSonameField(String soName) {
        driver.findElement(sonameField).sendKeys(soName);
    }

    public void fillAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void fillMetroStationField() {
        driver.findElement(metroStationField).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void fillPhoneNumberField() {
        driver.findElement(phoneNumber).sendKeys("89995159939");
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

}
