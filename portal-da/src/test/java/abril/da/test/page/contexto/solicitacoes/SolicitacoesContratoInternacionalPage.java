package abril.da.test.page.contexto.solicitacoes;

import org.junit.Assert;
import org.openqa.selenium.By;

import abril.da.test.page.BasePage;

public class SolicitacoesContratoInternacionalPage {

	public void checkElementsOnThePage(){
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_TIPO_CONTRATO_DCE'][@value='ED']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_TIPO_CONTRATO_DCE'][@value='CE']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_EXCLUSIVIDADE_DCE'][@value='True']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_EXCLUSIVIDADE_DCE'][@value='False']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_FORMATO_DCE'][@value='GLO']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_FORMATO_DCE'][@value='OBR']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_FORMATO_DCE'][@value='AUT']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_FORMATO_DCE'][@value='AEO']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_TERRITORIO_DCE'][@value='NA']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_TERRITORIO_DCE'][@value='EX']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_TERRITORIO_DCE'][@value='AM']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_DSC_EXCECAO_DCE']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_NUM_STORE_DCE']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_DOCTO_UNICO_DCE']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='Coletanea']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='dce_IND_GOVERNO_DCE']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_TIPO_VALIDADE_SVA'][@value='PRZ']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_TIPO_VALIDADE_SVA'][@value='EDC']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_TIPO_VALIDADE_SVA'][@value='DAT']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_TIPO_VALIDADE_SVA'][@value='TIR']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_RENOVACAO_SVA'][@value='True']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='sva_IND_RENOVACAO_SVA'][@value='True']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnProximo']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnSalvar']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='btnCancelar']")));
		Assert.assertTrue(BasePage.isElementPresent(By.xpath(".//*[@id='txtMesesRenovacao']")));
	}

}
