package abril.da.test.page.contexto.consultas;

import org.junit.Assert;
import org.openqa.selenium.By;

import abril.da.test.page.BasePage;

public class ConsultasContratosPage extends BasePage{
	public void checkElementsOnThePage(){
		Assert.assertTrue(BasePage.isElementPresent(By.id("Filtro_COD_SLT")));
	    Assert.assertTrue(BasePage.isElementPresent(By.id("Autor_I")));
	    Assert.assertTrue(BasePage.isElementPresent(By.id("Filtro_NumContrato")));
	    Assert.assertTrue(BasePage.isElementPresent(By.id("Filtro.DataSolicitacao_I")));
	    Assert.assertTrue(BasePage.isElementPresent(By.id("TituloObra")));
	    Assert.assertTrue(BasePage.isElementPresent(By.id("Filtro.StatusSelecionado_I")));
	    Assert.assertTrue(BasePage.isElementPresent(By.cssSelector("input[type=\"submit\"]")));
	}
}
		
