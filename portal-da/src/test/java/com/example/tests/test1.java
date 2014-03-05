package com.example.tests;

import java.util.regex.Pattern;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import abril.da.test.page.BasePage;
import abril.da.test.page.login.LoginPage;
import abril.da.test.steps.LoginSteps;
import abril.da.test.steps.SelecionarContextoSteps;

public class test1 extends BasePage{
//  private WebDriver driver;
//  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

//  @Before
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "http://qa.dra.scipioneatica.com.br/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }

  @Test
  public void test8AdminUsuarioTelefones() throws Exception {
	  
	LoginSteps loginSteps = new LoginSteps();
	loginSteps.doLogin();
	
	SelecionarContextoSteps selecionarContextoSteps = new SelecionarContextoSteps();
	selecionarContextoSteps.selectContexto("Ática");
	
	
	
    driver.get(baseUrl + "/Usuarios/Cadastrar");
    
    driver.findElement(By.id("usu_NOM_USUARIO_USU")).clear();
    driver.findElement(By.id("usu_NOM_USUARIO_USU")).sendKeys("w1");
    
    driver.findElement(By.id("usu_NOM_SOBRENOME_USU")).clear();
    driver.findElement(By.id("usu_NOM_SOBRENOME_USU")).sendKeys("w1111");

    driver.findElement(By.id("usu_DSC_EMAIL_USU")).clear();
    driver.findElement(By.id("usu_DSC_EMAIL_USU")).sendKeys("email@email.com");

    
    driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).clear();
    driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys("11");
    driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys(Keys.UP);
    driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).clear();
    driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys("30212121");
    driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys(Keys.TAB);
    driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys("11");
    driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys(Keys.UP);
    driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys("999989389");
    driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys(Keys.TAB);

    
    driver.findElement(By.id("btnRight")).click();
      
    driver.findElement(By.id("usu_DSC_LOGIN_USU")).sendKeys("usuario");
    driver.findElement(By.id("CBContexto_DDD_L_LBI3T0")).click();
    driver.findElement(By.cssSelector("div.linha > input[type=\"button\"]")).click();
    driver.findElement(By.id("btnSalvar")).click();

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresentxxx(By by) {
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
