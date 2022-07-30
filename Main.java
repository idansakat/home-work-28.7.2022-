import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
                /////////////sior 28.7.2022/////////////////////////
       // int x =5;
       // String y ="hodi";
       // Scanner scanner = new Scanner(System.in);
       //
       // var number = 2;
       // var lastname ="hoooodi";
       // var scanner1 = new Scanner(System.in);
       // number = 88;
       //
       // System.out.println( );
  ///הכנסת כרום דרייבר

        System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\sakid\\Desktop\\SELENIUM_VERSION\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new  ChromeDriver();

        //driver.manage().window().maximize();//////open windows is big size

        /////targil///
      //  driver.get("https://www.google.com/");///////get func driver--->open the site
      //  Thread.sleep(2000);///////wait between the next windows open
      // // driver.get("https://www.ebay.com//");///////get func driver--->open the site
      //  System.out.println(driver.getCurrentUrl());/////print amazon url page
      //  System.out.println(driver.getTitle());/////print amazon name title of the page
      //  System.out.println(driver.getPageSource());///print html code
//
      //  ////open ebay and enter to enter
      // // WebElement csBth = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
      // // csBth.click();
      //  ////open ebay and enter to enter////copy xpath
//
      //  WebElement searchBox = driver.findElement(By.name("weater"));
      //  searchBox.sendKeys(Keys.ENTER);
        //System.out.println(driver.getCurrentUrl());
        ///        Thread.sleep(3000);   ///wait 3 secend bettwen open the next windows


        ////targil youtub/////


        //driver.get("https://www.youtube.com/");
//
        //WebElement search = driver.findElement(By.name("search_query"));
        //search.sendKeys("baby shark");
        //Thread.sleep(3000);
        //search.sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        //driver.findElement(By.cssSelector("#video-title > yt-formatted-string")).click();
        //Thread.sleep(10000);
        //driver.quit();

        ///////home work 28.8.2022/////   site https://practice.automationtesting.in/  --->print shop    /////////

        driver.manage().window().maximize();//////open windows is big size
        driver.get("https://practice.automationtesting.in/");
        Thread.sleep(3000);
        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]"));
        myAccount.click();
        WebElement email = driver.findElement(By.id("reg_email"));
        email.sendKeys("idan1212@gmail.com");
        WebElement password = driver.findElement(By.id("reg_password"));
        password.sendKeys("Aa123456Aa!123456!");
        WebElement register = driver.findElement(By.name("register"));
        register.click();
        Thread.sleep(3000);
        WebElement shop = driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
        shop.click();
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}


