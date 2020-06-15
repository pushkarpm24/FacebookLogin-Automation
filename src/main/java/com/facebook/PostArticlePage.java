package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class PostArticlePage {

        WebDriver driver;

        //using by class
        By postSection = By.xpath("/html/body");
        By postArticle = By.xpath("/html/body");
        By privacy = By.xpath("//div[@id='u_4b_a']");
        By postButton = By.xpath("//span[contains(text(),'Post')]");


        //constructor
       public PostArticlePage(WebDriver driver)
       {
           this.driver = driver;
       }

        public void clickOnPostSection()
        {
            driver.findElement(postSection).click();
        }

        public void enterPost()
        {
            driver.findElement(postArticle).sendKeys("pperforming first selenium automation script...");
        }

        public void clickOnPrivacy()
        {
            driver.findElement(privacy).click();
        }

        public void clickOnPostButton()

        {
            driver.findElement(postButton).click();
        }




    }
