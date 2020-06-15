package com.facebook;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyLogin {

   @Test
   public void LoginTest() throws InterruptedException {

      //setting the path of chrome driver executable

      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

      //using chrome options to disable unwanted notifications
      ChromeOptions opt = new ChromeOptions();
      opt.addArguments("--disable-notifications");

      //Launch the chrome browser
      WebDriver driver = new ChromeDriver(opt);

      //Maximizing the window
      driver.manage().window().maximize();


      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

      //Enter the url
      driver.get("http://www.facebook.com");


      LoginPage login = new LoginPage(driver);

      login.enterUsername();
      Thread.sleep(1000);
      login.enterPassword();
      Thread.sleep(1000);
      login.clickOnLoginButton();
      Thread.sleep(5000);

//      WORKING ON ASSERTION

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


      //close the browser
      driver.close();

   }

}
