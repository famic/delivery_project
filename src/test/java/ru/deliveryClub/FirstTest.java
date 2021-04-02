package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public  ChromeDriver driver;
    @Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/famich/Downloads/chromedriver");
         driver = new ChromeDriver();
         System.out.println("test start");
    }

    @Test
    public void firstTest() {

        driver.get("https://www.delivery-club.ru/moscow");

        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 25-45 минут! Delivery Club", title);


    }
    @After
    public void close(){
       System.out.println("test close");
       driver.quit();
    }
}

