package abril.da.test.page.contexto.admin;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.openqa.selenium.By;
import abril.da.test.page.BasePage;

public class AdminContextoPage extends BasePage{

	public void checkElementsOnPage() throws Exception {

		assertEquals("Contexto", driver.findElement(By.cssSelector("h2")).getText());
		assertTrue(isElementPresent(By.linkText("Incluir Novo Contexto")));
		assertTrue(isElementPresent(By.id("cnpj0")));
		assertTrue(isElementPresent(By.id("btnExcluir0")));
		
		assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvContexto_DXMainTable']//td[text()='CNPJ']")));
		assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvContexto_DXMainTable']//td[text()='Descrição']")));
		assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvContexto_DXMainTable']//td[text()='Status']")));
	}
}
