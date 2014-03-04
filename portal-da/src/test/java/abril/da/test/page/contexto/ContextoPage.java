package abril.da.test.page.contexto;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import abril.da.test.page.BasePage;
import abril.da.test.page.contexto.admin.AdminContextoPage;
import abril.da.test.page.contexto.admin.AdminPaginasItensPage;
import abril.da.test.page.contexto.admin.AdminPaginasItensPermissoesPage;
import abril.da.test.page.contexto.admin.AdminPaginasPage;
import abril.da.test.page.contexto.admin.AdminPerfilPage;
import abril.da.test.page.contexto.admin.AdminUsuariosPage;
import abril.da.test.page.contexto.consultas.ConsultasContratosLegadoPage;
import abril.da.test.page.contexto.consultas.ConsultasContratosPage;
import abril.da.test.page.contexto.solicitacoes.SolicitacoesContratoDominioPublicoPage;
import abril.da.test.page.contexto.solicitacoes.SolicitacoesContratoEditoraPage;
import abril.da.test.page.contexto.solicitacoes.SolicitacoesContratoInternacionalPage;
import abril.da.test.page.contexto.solicitacoes.SolicitacoesContratoSERPage;
import abril.da.test.page.contexto.solicitacoes.SolicitacoesContratoSemAutoriaPage;

public class ContextoPage extends BasePage{
	
	public final String CONTEXTO_XPATH_ELEMENT = "//a[@href]";
	
	public boolean checkContexto(String contexto) {
		List<WebElement> findElements = driver.findElements(By.xpath(CONTEXTO_XPATH_ELEMENT));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}

		return driver.findElement(By.xpath(CONTEXTO_XPATH_ELEMENT)).getText().contains(contexto);
	}

	public boolean checkLogin(String login) {
	      return driver.findElement(By.cssSelector("strong")).getText().contains(login);
	}

	public SolicitacoesContratoEditoraPage getSolicitacoesContratoEditoraPage(){
		driver.get(urlSolicitacoesContratoEditoraPage);
		Assert.assertEquals(urlSolicitacoesContratoEditoraPage,driver.getCurrentUrl());
		return new SolicitacoesContratoEditoraPage();
	}
	
	public SolicitacoesContratoInternacionalPage getSolicitacoesContratoInternacionalPage() {
		driver.get(urlSolicitacoesContratoInternacionalPage);
		Assert.assertEquals(urlSolicitacoesContratoInternacionalPage,driver.getCurrentUrl());
		return new SolicitacoesContratoInternacionalPage();
	}
	
	public SolicitacoesContratoSemAutoriaPage getSolicitacoesContratoSemAutoriaPage() {
		driver.get(urlSolicitacoesContratoSemAutoriaPage);
		Assert.assertEquals(urlSolicitacoesContratoSemAutoriaPage,driver.getCurrentUrl());
		return new SolicitacoesContratoSemAutoriaPage();
	}

	public SolicitacoesContratoSERPage getSolicitacoesContratoSERPage(){
		driver.get(urlSolicitacoesContratoSERPage);
		Assert.assertEquals(urlSolicitacoesContratoSERPage,driver.getCurrentUrl());
		return new SolicitacoesContratoSERPage();
	}
	
	public SolicitacoesContratoDominioPublicoPage getSolicitacoesContratoDominioPublicoPage(){
		driver.get(urlSolicitacoesContratoDominioPublicoPage);
		Assert.assertEquals(urlSolicitacoesContratoDominioPublicoPage,driver.getCurrentUrl());
		return new SolicitacoesContratoDominioPublicoPage();
	}

	public ConsultasContratosPage getConsultasContratosPage() {
		driver.get(urlConsultasContratos);
		Assert.assertEquals(urlConsultasContratos,driver.getCurrentUrl());
		return new ConsultasContratosPage();
	}

	public ConsultasContratosLegadoPage getConsultasContratosLegadoPage() {
		driver.get(urlConsultasContratosLegado);
		Assert.assertEquals(urlConsultasContratosLegado, driver.getCurrentUrl());
		return new ConsultasContratosLegadoPage();
	}

	public AdminUsuariosPage getAdminUsuariosPage() {
		driver.get(urlAdminUsuariosPage);
		Assert.assertEquals(urlAdminUsuariosPage, driver.getCurrentUrl());
		return new AdminUsuariosPage();
	}

	public AdminContextoPage getAdminContextoPage() {
		driver.get(urlAdminContextoPage);
		Assert.assertEquals(urlAdminContextoPage, driver.getCurrentUrl());
		return new AdminContextoPage();
	}

	public AdminPerfilPage getAdminPerfilPage() {
		driver.get(urlAdminPerfilPage);
		Assert.assertEquals(urlAdminPerfilPage, driver.getCurrentUrl());
		return new AdminPerfilPage();	
	}

	public AdminPaginasPage getAdminPaginasPage() {
		driver.get(urlAdminPaginasPage);
		Assert.assertEquals(urlAdminPaginasPage, driver.getCurrentUrl());
		return new AdminPaginasPage();
	}

	public AdminPaginasItensPage getAdminPaginasItensPage() {
		driver.get(urlAdminPaginasItensPage);
		Assert.assertEquals(urlAdminPaginasItensPage, driver.getCurrentUrl());
		return new AdminPaginasItensPage();
	}

	public AdminPaginasItensPermissoesPage getAdminPaginasItensPermissoesPage() {
		driver.get(urlAdminPaginaItensPermissoesPage);
		Assert.assertEquals(urlAdminPaginaItensPermissoesPage, driver.getCurrentUrl());
		return new AdminPaginasItensPermissoesPage();
	}
	
	
	
	
	
//	
//	public void menuSolicitacoesContratoEditora() {
//		driver.findElement(By.linkText("Solicitações")).click();
//		driver.findElement(By.linkText("Contrato Editoras")).click();
//	}
//	
//	public void menuSolicitacoesContratoInternacional() {
//		driver.findElement(By.linkText("Solicitações")).click();
//		driver.findElement(By.linkText("Contrato Internacional")).click();
//	}
//	
//	public void menuSolicitacoesContratoSemAutoria() {
//		driver.findElement(By.linkText("Solicitações")).click();
//		driver.findElement(By.linkText("Contrato sem Autoria")).click();
//	}
//	
//	public void menuSolicitacoesContratoSER() {
//		driver.findElement(By.linkText("Solicitações")).click();
//		driver.findElement(By.linkText("Contrato Ser")).click();
//	}
//	
//	public void menuSolicitacoesContratoDominioPublico() {
//		driver.findElement(By.linkText("Solicitações")).click();
//		driver.findElement(By.linkText("Contrato Domínio Público")).click();
//
//	}


}
	
		
	
	






