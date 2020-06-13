package com.facebook;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyAutomationScript {

   @Test
   public void verifyValidLogin() throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
      ChromeOptions opt = new ChromeOptions();
      opt.addArguments("--disable-notifications");
      WebDriver driver = new ChromeDriver(opt);
      driver.manage().window().maximize();
      //driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      driver.get("http://www.facebook.com");


      LoginPage login = new LoginPage(driver);

      login.enterUsername();
      Thread.sleep(1000);
      login.enterPassword();
      Thread.sleep(1000);
      login.clickOnLoginButton();
      Thread.sleep(5000);

//      String expectedPageTitle = "Facebook";
//      String actualPageTitle = driver.getTitle().toString();
//      System.out.println("Expected Title is:"+expectedPageTitle);
//      System.out.println("Actual Title is:"+actualPageTitle);
//      Assert.assertEquals(expectedPageTitle,actualPageTitle);


      PostArticlePage post = new PostArticlePage(driver);

      post.clickOnPostSection();
      Thread.sleep(5000);
      post.enterPost();
      Thread.sleep(5000);
      post.clickOnPostButton();
      Thread.sleep(5000);
//      post.clickOnPrivacy();
//      Thread.sleep(5000);


      //driver.quit();

   }

}
