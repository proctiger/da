package abril.da.test.page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.openqa.selenium.By;

public class AberturaPage extends BasePage{
  
  private StringBuffer verificationErrors = new StringBuffer();

  public void preencheAbertura() throws Exception {
    driver.findElement(By.id("dce_IND_EXCLUSIVIDADE_DCE")).click();
    driver.findElement(By.id("dce_IND_EXCLUSIVIDADE_DCE")).click();
    driver.findElement(By.xpath("(//input[@id='dce_IND_FORMATO_DCE'])[2]")).click();
    driver.findElement(By.id("dce_IND_FORMATO_DCE")).click();
    driver.findElement(By.id("dce_IND_TERRITORIO_DCE")).click();
    driver.findElement(By.id("dce_IND_GOVERNO_DCE")).click();
    driver.findElement(By.id("dce_DSC_EXCECAO_DCE")).clear();
    driver.findElement(By.id("dce_DSC_EXCECAO_DCE")).sendKeys("exceÃ§Ã£o");
    driver.findElement(By.id("sva_IND_TIPO_VALIDADE_SVA")).click();
    driver.findElement(By.id("sva_QTD_MESES_SVA")).clear();
    driver.findElement(By.id("sva_QTD_MESES_SVA")).sendKeys("1");
    driver.findElement(By.id("sva_IND_RENOVACAO_SVA")).click();
    driver.findElement(By.id("txtMesesRenovacao")).clear();
    driver.findElement(By.id("txtMesesRenovacao")).sendKeys("1");
    driver.findElement(By.id("btnSalvar")).click();
    
    assertEquals("O registro foi salvo com sucesso!", driver.findElement(By.cssSelector("#dialog-success > p")).getText());
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    String numeroContrato = driver.findElement(By.cssSelector("h2")).getText();
    System.out.println(numeroContrato);
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 

 }
