package abril.da.test.page.contexto.admin;

import org.openqa.selenium.By;

import junit.framework.Assert;
import abril.da.test.page.BasePage;

public class AdminUsuariosPage extends BasePage {
	
	  public void checkElementsOnThePage() throws Exception {
		    
		    Assert.assertTrue(BasePage.isElementPresent(By.linkText("Incluir Novo Usuário")));
		    Assert.assertEquals("Usuário", driver.findElement(By.cssSelector("h2")).getText());
		    Assert.assertTrue(BasePage.isElementPresent(By.id("btnEditar0")));
		    
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='Nome']")));
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='Usuário']")));
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='E-mail']")));
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='Telefone Fixo']")));
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='Telefone Celular']")));
		    Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvUsuarios_DXMainTable']//td[text()='Status']")));
		    
		  }


}
