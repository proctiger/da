package abril.da.test.page.contexto.solicitacoes;

import org.junit.Assert;
import org.openqa.selenium.By;

import abril.da.test.page.BasePage;

public class SolicitacoesContratoSemAutoriaPage {

	public void checkElementsOnThePage() {
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='txtCodCentroLucro']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='FiltroObras_DSC_TITULO_OED']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='FiltroObras.IND_TIPO_VENDA_OED_I']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnPesquisaObra']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='gvObrasPesquisadas']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnAdicionarObra']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='tabelaObrasSelecionadas']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='tabelaCentroLucro']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnCancelarSemAutoria']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnSalvar']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnFinalizar']")));
	}

}