package abril.da.test.page.contexto.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import abril.da.test.page.BasePage;

public class AdminPaginasItensPage extends BasePage{

	 public void checkElementsOnPage() throws Exception {
		    
		    assertEquals("Página Itens", driver.findElement(By.cssSelector("legend")).getText());
		    assertTrue(isElementPresent(By.id("NovoItem.PAGINA_IPA_I")));
		    assertTrue(isElementPresent(By.id("NovoItem_DSC_IPA")));
		    assertTrue(isElementPresent(By.id("NovoItem_ID_CONTROLE_IPA")));
		    assertTrue(isElementPresent(By.id("NovoItem_ACTION_IPA")));
		    assertTrue(isElementPresent(By.id("btnIncluir")));
		  }
}
	
	
