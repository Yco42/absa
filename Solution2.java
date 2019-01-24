package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCase1() throws Exception {
    driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add User'])[1]/preceding::td[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Name'])[1]/preceding::button[1]")).click();
    driver.findElement(By.name("FirstName")).click();
    driver.findElement(By.name("FirstName")).clear();
    driver.findElement(By.name("FirstName")).sendKeys("FName1");
    driver.findElement(By.name("LastName")).clear();
    driver.findElement(By.name("LastName")).sendKeys("LName1");
    driver.findElement(By.name("UserName")).clear();
    driver.findElement(By.name("UserName")).sendKeys("User1");
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("Pass1");
    driver.findElement(By.name("optionsRadios")).click();
    new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Sales Team");
    new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Customer");
    new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Admin");
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("admin@mail.com");
    driver.findElement(By.name("Mobilephone")).clear();
    driver.findElement(By.name("Mobilephone")).sendKeys("082555");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Name'])[1]/preceding::button[1]")).click();
    driver.findElement(By.name("FirstName")).click();
    driver.findElement(By.name("FirstName")).clear();
    driver.findElement(By.name("FirstName")).sendKeys("FName2");
    driver.findElement(By.name("LastName")).clear();
    driver.findElement(By.name("LastName")).sendKeys("LName2");
    driver.findElement(By.name("UserName")).clear();
    driver.findElement(By.name("UserName")).sendKeys("User2");
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("Pass2");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Role'])[2]/preceding::input[1]")).click();
    driver.findElement(By.name("RoleId")).click();
    new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Customer");
    driver.findElement(By.name("RoleId")).click();
    driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("cusomter@mail.com");
    driver.findElement(By.name("Mobilephone")).clear();
    driver.findElement(By.name("Mobilephone")).sendKeys("083444");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::button[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
