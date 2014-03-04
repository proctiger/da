package abril.da.test.page.contexto.admin;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import abril.da.test.page.BasePage;

public class AdminPaginasItensPermissoesPage extends BasePage{
	
	 public void checkElementsOnPage() throws Exception {
		    assertEquals("Páginas Itens Permissões", driver.findElement(By.cssSelector("h2")).getText());
		    assertTrue(isElementPresent(By.id("CBContexto_I")));
		    assertTrue(isElementPresent(By.id("CBPerfil_I")));
		    assertTrue(isElementPresent(By.id("CBPagina_I")));
		    assertTrue(isElementPresent(By.id("btnSalvar")));
		  }
}

