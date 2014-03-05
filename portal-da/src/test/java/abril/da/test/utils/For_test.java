package abril.da.test.utils;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class For_test {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.out.println("Iniciando Firefox");
    driver = new FirefoxDriver();
    baseUrl = "http://qa.dra.scipioneatica.com.br/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testWteste2() throws Exception {

	this.login();
    this.selectContexto();    
    this.cadastrarUsuario();

  }

  
  
  public void login(){
	   System.out.println("Efetuando Login");
	    driver.get(baseUrl + "/Login/LoginPrincipal");
	    driver.findElement(By.id("DSC_LOGIN_USU")).clear();
	    driver.findElement(By.id("DSC_LOGIN_USU")).sendKeys("editorial");
	    driver.findElement(By.id("DSC_SENHA_USU")).clear();
	    driver.findElement(By.id("DSC_SENHA_USU")).sendKeys("123");
	    driver.findElement(By.cssSelector("input.right")).click();
  }
  
  public void selectContexto(){
	  System.out.println("selecionando contexto");
	    driver.get(baseUrl + "/SelecionaContexto");
	    driver.findElement(By.cssSelector("td.dxic")).click();
	    driver.findElement(By.xpath("//*[text()=\"Ática\"]")).click();
	    driver.findElement(By.cssSelector("input.right")).click();
  }
  
  public void cadastrarUsuario() throws InterruptedException{
	  System.out.println("Cadastrando usuario");
	  driver.get(baseUrl+"Usuarios/Cadastrar");
	  
//	  while (driver.findElement(By.id("btnSalvar")) != null){
//		  Thread.sleep(100);
//	  }
	  
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("btnSalvar")));
	  waitForJQueryProcessing(driver, 60);
	  new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.id("usu_NOM_USUARIO_USU")));
	  new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("usu_NOM_USUARIO_USU")));
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("usu_NOM_USUARIO_USU")));
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("usu_NOM_SOBRENOME_USU")));
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("usu_DSC_EMAIL_USU")));
	  
	  preencheCamposCadastro();
	  selecionarDropStatus();
	  selecionarDropContexto();
	  selecionarDropPerfil();
	  
	  
	  driver.findElement(By.xpath(".//input[@type='button'][@value='Incluir']")).click();
	  
	  
//	  driver.findElement(By.xpath(".//*[text()='Cancelar']")).click();
//	  driver.findElement(By.id("btnSalvar")).click();
	  
	  

  }
  
  public void preencheCamposCadastro() throws InterruptedException{
	  System.out.println("preenchendo cadastro de usuario.........");
	  
//	  Thread.sleep(2000);
//	  WaitForModalPanel();

//	  WebDriver driver = null; // Assigned elsewhere
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("document.getElementById('usu_NOM_USUARIO_USU').setAttribute('value', '1111111111111')");
//	  js.executeScript("document.getElementById('usu_NOM_SOBRENOME_USU').setAttribute('value', '1111111111111')");
//	  js.executeScript("document.getElementById('usu_DSC_EMAIL_USU').setAttribute('value', 'email@email.com')");
	  
	  
	  
	  
		String value = "w1";
		driver.findElement(By.id("usu_NOM_USUARIO_USU")).click();
		driver.findElement(By.id("usu_NOM_USUARIO_USU")).clear();
		driver.findElement(By.id("usu_NOM_USUARIO_USU")).sendKeys(value);

		driver.findElement(By.id("usu_NOM_SOBRENOME_USU")).sendKeys("w1111");
		driver.findElement(By.id("usu_DSC_EMAIL_USU")).sendKeys("email@email.com");
		
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).click();
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys("11");
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys(Keys.UP);
		
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).click();
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys("30212121");
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys(Keys.UP);

		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).click();
		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys("11");
		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys(Keys.UP);
	
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).click();
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys("999989389");
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("btnRight")).click();
		driver.findElement(By.id("usu_DSC_LOGIN_USU")).sendKeys("usuario");
  }
  
  
  public void selecionarDropStatus(){
	  driver.findElement(By.id("usu.IND_STATUS_USU_B-1Img")).click();
	  driver.findElement(By.xpath("//*[text()=\"Inativo\"]")).click();
  }
  
  public void selecionarDropContexto(){
	  driver.findElement(By.id("CBContexto_B-1Img")).click();
	  driver.findElement(By.xpath("//*[text()=\"Ática\"]")).click();
  }
  
  public void selecionarDropPerfil(){
	  driver.findElement(By.id("CBPerfil_B-1Img")).click();
	  driver.findElement(By.xpath("//*[text()=\"Admin\"]")).click();
  }

  
  @After
  public void tearDown() throws Exception {
//    driver.quit();
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
  
  
  
  
  public void waitForAjaxToComplete() {

	  try {
			ExpectedCondition<Boolean> isLoadingFalse = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {

					Object obj = ((JavascriptExecutor) driver).executeScript("return !window.ajaxActive");
					Object jQueryActive = ((JavascriptExecutor) driver).executeScript("return jQuery.active;");

					if (obj != null && obj.toString().equals("true") && jQueryActive.toString().equals("0"))
						return Boolean.valueOf(true);
					else
						return false;
				}

			};

		} catch (Exception e) {

		}

}
  
  
  public void esperaAJAX(){
	System.out.println("..........wait for the application to get fully loaded....");
	WebElement nome = (new WebDriverWait(driver, 5)).until(new ExpectedCondition<WebElement>() {
	   public WebElement apply(WebDriver d) {
//	       d.get(baseUrl);
	       return d.findElement(By.id("usu_NOM_USUARIO_USU"));
	   }
	});
	
	nome.sendKeys("xxxxxxxxxxxxxx");
  }
  public static boolean waitForJQueryProcessing(WebDriver driver,
	        int timeOutInSeconds) {
	    boolean jQcondition = false;
	    try {
	        new WebDriverWait(driver, timeOutInSeconds) {
	        }.until(new ExpectedCondition<Boolean>() {

//	            @Override
	            public Boolean apply(WebDriver driverObject) {
	                return (Boolean) ((JavascriptExecutor) driverObject)
	                        .executeScript("return jQuery.active == 0");
	            }
	        });
	        jQcondition = (Boolean) ((JavascriptExecutor) driver)
	                .executeScript("return window.jQuery != undefined && jQuery.active === 0");
	        return jQcondition;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return jQcondition;
	}
  public void WaitForModalPanel()
  {
      String element_xpath = ".//*[@id='lstBox1']";
      WebDriverWait wait = new WebDriverWait(driver, 2);
      WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element_xpath))));
      WebElement until2 = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element_xpath))));
      WebElement until3 = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element_xpath))));
      
  }
  
}
