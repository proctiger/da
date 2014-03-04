package abril.da.test.page.contexto.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import abril.da.test.page.BasePage;

public class AdminPaginasPage extends BasePage{
	 public void checkElementsOnPage() throws Exception {
		   
		    assertEquals("Páginas", driver.findElement(By.cssSelector("h2")).getText());
		    assertTrue(isElementPresent(By.id("Filtros_NomePagina")));
		    assertTrue(isElementPresent(By.id("Filtros_NomePaginaPai")));
		    assertTrue(isElementPresent(By.id("Filtros.Inativo_I")));
		    assertTrue(isElementPresent(By.id("btnPesquisar")));
		    assertTrue(isElementPresent(By.id("btnIncluir")));
		    
		    assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPaginas_DXMainTable']//td[text()='Nome']")));
		    assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPaginas_DXMainTable']//td[text()='Url']")));
		    assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPaginas_DXMainTable']//td[text()='Menu']")));
		    assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPaginas_DXMainTable']//td[text()='Pagina Pai']")));
		    assertTrue(BasePage.isElementPresent(By.xpath("//table[@id='gvPaginas_DXMainTable']//td[text()='Status']")));
		    
		  }
}
