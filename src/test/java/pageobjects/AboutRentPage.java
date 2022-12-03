package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AboutRentPage {
    private WebDriver driver;

    //Конструктор
    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Страница Про аренду:
    //Локаторы полей//

    //Поле "Когда привезти самокат"
    private By calendarField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Поле "Срок аренды"
    private By periodField = By.xpath(".//div[@class = 'Dropdown-placeholder']");

    //Строка со сроком аренды
    private By firstRowInPeriodDropDownList = By.xpath(".//div[(@role = 'option') and (text() = 'сутки')]");

    //Чекбокс цвета самоката
    private By blackColourCheckBox = By.xpath(".//input[@id = 'black']");

    //Поле "Комментарий для курьера"
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    //Кнопка "Заказать"
    private By orderButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text() = 'Заказать')]");

    //Кнопка "Да"
    private By yesButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text() = 'Да')]");

    private By orderHasBeenPlacedText = By.xpath(".//div[(@class = 'Order_ModalHeader__3FDaJ') and (text() ='Заказ оформлен')]");
    //Методы//

    //Ввод даты
    public void setDateInDataField() {
        driver.findElement(calendarField).sendKeys("12.12.2022", Keys.ENTER);
    }

    //Кликнуть на поле Срок аренды
    public void clickRentPeriodField() {
        driver.findElement(periodField).click();
    }

    //Выбрать срок аренды в выподающем списке
    public void setRentPeriodInDropDownList() {
        driver.findElement(firstRowInPeriodDropDownList).click();
    }

    //Кликнуть на чекбокс с черным цветом самоката
    public void clickBlackColourCheckBox() {
        driver.findElement(blackColourCheckBox).click();
    }

    //Ввести комментарий для курьера
    public void textCommentForCourier() {
        driver.findElement(commentField).sendKeys("Комментарий");
    }

    //Кликнуть на кнопку "Заказать"

    public void clickMakeOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public String checkTextOrderHasBeenPlaced() {
        return driver.findElement(orderHasBeenPlacedText).getText();

    }


}
