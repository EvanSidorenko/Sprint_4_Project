package ru.qa_scooter.praktikum_services.webtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;

public class CheckTextInDropDownList {
    //1. Тест на проверку текста ответа на первый вопрос

    @RunWith(Parameterized.class)
    public static class Parameters1 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters1( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"0", "0"}
            };

        }

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }


        private WebDriver driver;
        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }
    //2. Тест на проверку текста ответа на второй вопрос

    @RunWith(Parameterized.class)
    public static class Parameters2 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters2( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"1", "1"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }

    //3. Тест на проверку текста ответа на третий вопрос
    @RunWith(Parameterized.class)
    public static class Parameters3 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters3( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"2", "2"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }

    //4. Тест на проверку текста ответа на четвертый вопрос
    @RunWith(Parameterized.class)
    public static class Parameters4 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters4( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"3", "3"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }

    //5. Тест на проверку текста ответа на пятый вопрос

    @RunWith(Parameterized.class)
    public static class Parameters5 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters5( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"4", "4"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

    //6. Тест на проверку текста ответа на шестой вопрос
    @RunWith(Parameterized.class)
    public static class Parameters6 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters6( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"5", "5"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }
    //7. Тест на проверку текста ответа на седьмой вопрос
    @RunWith(Parameterized.class)
    public static class Parameters7 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters7( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"6", "6"}
            };

        }
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

    //8. Тест на проверку текста ответа на восьмой вопрос
    @RunWith(Parameterized.class)
    public static class Parameters8 {

        private final String headingNumber;
        private final String panelNumber;


        public Parameters8( String headingNumber, String panelNumber) {
            this.headingNumber = headingNumber;
            this.panelNumber = panelNumber;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"7", "7"}
            };

        }

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }
        private WebDriver driver;

        @Test
        public void checkTextInDropDownList() {

            MainPage objMainPage = new MainPage(driver);

            //Главная страница:
            objMainPage.clickCookieButton();
            objMainPage.clickArrowInDropDownList(headingNumber);
            String actualText = objMainPage.getTextInDropDownList(panelNumber);
            String expectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

            //Сравнить ожидаемый и полученный текст:
            Assert.assertEquals(expectedText, actualText);
            System.out.println(actualText);

        }

        @After
        public void tearDown() {
            driver.quit();
        }

    }
}
