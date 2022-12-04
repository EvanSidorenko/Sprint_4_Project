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


    //Стрелка в выпадающем списке
    private String accordionHeading = "accordion__heading-";

    //Ответ на вопрос в выпадающем списке
    private String accordionPanel = "accordion__panel-";

    //Кнока куки "Да все привыкли"
    private By cookieButton = By.cssSelector(".App_CookieButton__3cvqF");



    //Методы//

    // Кликнуть на кнопку "Заказать"
    public void clickOrderButton(String buttonOrderClass) {
    driver.findElement(By.cssSelector(buttonOrderClass)).click();
    }

    //Кликнуть на стрелку в выпадающем списке
    public void clickArrowInDropDownList (String headingNumber) {
        driver.findElement(By.id(accordionHeading + headingNumber)).click();
    }

    //Получить текст первого вопроса
    public String getTextInDropDownList(String panelNumber) {
        return driver.findElement(By.id(accordionPanel + panelNumber)).getText();
    }

    //Кликнуть на кнопку куки "Да все привыкли"
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
}
