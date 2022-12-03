package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    //Создаем переменную driver
    private WebDriver driver;

    //Конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    //Главная страница:
    //Локаторы полей//

    // Кнопка "Заказать" в хедере
    private By buttonOrderInHeader = By.cssSelector(".Button_Button__ra12g");

    // Стрелка на выпадающем списке
    private By arrow = By.className("accordion__button");

    //Ответ на первый вопрос в выпадающем списке
    private By textInFirstQuestion = By.xpath(".//p[text() = 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

    //Кнока куки "Да все привыкли"

    private By cookieButton = By.cssSelector(".App_CookieButton__3cvqF");


    //Методы//

    // Кликнуть на кнопку "Заказать"
    public void clickOrderButtonInHeader() {
        driver.findElement(buttonOrderInHeader).click();
    }

    //Кликнуть на стрелку в выпадающем списке
    public void clickArrowInDropDownList() {
        driver.findElement(arrow).click();
    }

    //Получить текст первого вопроса
    public String getTextInDropDownList() {
        return driver.findElement(textInFirstQuestion).getText();
    }

    //Кликнуть на кнопку куки "Да все привыкли"
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
}
