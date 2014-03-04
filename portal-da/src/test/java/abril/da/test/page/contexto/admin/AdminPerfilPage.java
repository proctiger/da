package abril.da.test.page.contexto.admin;

import org.openqa.selenium.By;

import abril.da.test.page.BasePage;
import junit.framework.Assert;

public class AdminPerfilPage extends BasePage {
	public void checkElementsOnPage() throws Exception {

		Assert.assertEquals("Perfil", driver.findElement(By.cssSelector("h2")).getText());
		Assert.assertTrue(isElementPresent(By.linkText("Incluir Novo Perfil")));
		Assert.assertTrue(isElementPresent(By.id("btnEditar0")));
		Assert.assertTrue(isElementPresent(By.id("btnExcluir0")));
		
		Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPerfil_DXMainTable']//td[text()='Nome Perfil']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPerfil_DXMainTable']//td[text()='Status']")));
	}
}
