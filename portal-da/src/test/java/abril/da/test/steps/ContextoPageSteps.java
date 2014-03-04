package abril.da.test.steps;

import abril.da.test.page.contexto.ContextoPage;
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
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContextoPageSteps {
	
	ContextoPage contextoPage = new ContextoPage(); 
	SolicitacoesContratoEditoraPage solicitacoesContratoEditoraPage;
	SolicitacoesContratoInternacionalPage solicitacoesContratoInternacionalPage;
	SolicitacoesContratoSemAutoriaPage solicitacoesContratoSemAutoriaPage;
	SolicitacoesContratoSERPage solicitacoesContratoSERPage;
	SolicitacoesContratoDominioPublicoPage solicitacoesContratoDominioPublicoPage;
	ConsultasContratosPage consultasContratosPage;
	ConsultasContratosLegadoPage consultasContratosLegadoPage; 
	AdminUsuariosPage adminUsuariosPage;
	AdminContextoPage adminContextoPage;
	AdminPerfilPage adminPerfilPage;
	AdminPaginasPage adminPaginasPage;
	AdminPaginasItensPage adminPaginasItensPage;
	AdminPaginasItensPermissoesPage adminPaginasItensPermissoesPage;
	
	
	@When("^Carregar pagina Solicitacoes Contrato <(.+)>$")
	public void getSolicitacoesContrato(String tipoContrato){
		if (tipoContrato.toLowerCase().equals("editora")){
			solicitacoesContratoEditoraPage = contextoPage.getSolicitacoesContratoEditoraPage();
		}
		
		if (tipoContrato.toLowerCase().equals("internacional")){
			solicitacoesContratoInternacionalPage = contextoPage.getSolicitacoesContratoInternacionalPage();
		}
		
		if (tipoContrato.toLowerCase().equals("sem autoria")){
			solicitacoesContratoSemAutoriaPage = contextoPage.getSolicitacoesContratoSemAutoriaPage();
		}

		if (tipoContrato.toLowerCase().equals("ser")){
			solicitacoesContratoSERPage = contextoPage.getSolicitacoesContratoSERPage();
		}

		if (tipoContrato.toLowerCase().equals("dominio publico")){
			solicitacoesContratoDominioPublicoPage = contextoPage.getSolicitacoesContratoDominioPublicoPage();
		}
	}

	
	@When("^Carregar pagina de consulta <(.+)>$")
	public void getConsultasContratosPage(String page){
		if (page.equalsIgnoreCase("consultas contratos")){
			consultasContratosPage = contextoPage.getConsultasContratosPage();
		}
			
		if (page.equalsIgnoreCase("consultas contratos legado")){
			consultasContratosLegadoPage = contextoPage.getConsultasContratosLegadoPage();
		}
	}
	
	
	@When("^Carregar pagina de Admin <(.+)>$")
	public void getAdminPage(String page){
		if (page.equalsIgnoreCase("usuarios")){
			adminUsuariosPage = contextoPage.getAdminUsuariosPage();
		}

		if (page.equalsIgnoreCase("contexto")){
			adminContextoPage = contextoPage.getAdminContextoPage();
		}
		
		if (page.equalsIgnoreCase("perfil")){
			adminPerfilPage = contextoPage.getAdminPerfilPage();
		}
		
		if (page.equalsIgnoreCase("paginas")){
			adminPaginasPage = contextoPage.getAdminPaginasPage();
		}
		
		if (page.equalsIgnoreCase("paginas itens")){
			adminPaginasItensPage = contextoPage.getAdminPaginasItensPage();
		}

		if (page.equalsIgnoreCase("paginas itens permissoes")){
			adminPaginasItensPermissoesPage = contextoPage.getAdminPaginasItensPermissoesPage();
		}
	}

	
	@Then("^Verificar elementos da pagina <(.+)>$")
	public void checkElementsOnSolicitacoesContratoEditora(String page){
		
		if (page.toLowerCase().contains("solicitacoes contrato editora")){
			solicitacoesContratoEditoraPage.checkElementsOnThePage();
		}
	
		if (page.toLowerCase().contains("solicitacoes contrato internacional")){
			solicitacoesContratoInternacionalPage.checkElementsOnThePage();
		}

		if (page.toLowerCase().contains("solicitacoes contrato sem autoria")){
			solicitacoesContratoSemAutoriaPage.checkElementsOnThePage();
		}

		if (page.toLowerCase().contains("solicitacoes contrato ser")){
			solicitacoesContratoSERPage.checkElementsOnThePage();
		}

		if (page.toLowerCase().contains("solicitacoes contrato dominio publico")){
			solicitacoesContratoDominioPublicoPage.checkElementsOnThePage();
		}
	}
	
	@Then("^Verificar elementos da pagina de consulta <(.+)>$")
	public void checkElementsOnConsultasPage(String page){
		if (page.equalsIgnoreCase("consultas contratos")){
			consultasContratosPage.checkElementsOnThePage();
		}
			
		if (page.equalsIgnoreCase("consultas contratos legado")){
			consultasContratosLegadoPage.checkElementsOnThePage();
		}
	}
		

	
	@Then("^Verificar elementos da pagina de Admin <(.+)>$")
	public void checkElementsOnAdminPage(String page) throws Exception{
		if (page.equalsIgnoreCase("usuarios")){
			adminUsuariosPage.checkElementsOnThePage();
		}

		if (page.equalsIgnoreCase("contexto")){
			adminContextoPage.checkElementsOnPage();
		}
		
		if (page.equalsIgnoreCase("perfil")){
			adminPerfilPage.checkElementsOnPage();
		}
		
		if (page.equalsIgnoreCase("paginas")){
			adminPaginasPage.checkElementsOnPage();
		}
		
		if (page.equalsIgnoreCase("paginas itens")){
			adminPaginasItensPage.checkElementsOnPage();
		}

		if (page.equalsIgnoreCase("paginas itens permissoes")){
			adminPaginasItensPermissoesPage.checkElementsOnPage();
		}

	}

	
	
	
	
	
	
	
	
	
	
	

//	@When("^Selecionar menu Solicitacoes Contrato Editora$")
//	public void Selecionar_Solicitacoes_Contrato_Editora() throws Throwable {
//	   contextoPage.menuSolicitacoesContratoEditora();
//	}
//
//	@When("^Selecionar menu Solicitacoes Contrato Internacional$")
//	public void Selecionar_Solicitacoes_Contrato_Internacional() throws Throwable {
//	   contextoPage.menuSolicitacoesContratoInternacional();
//	}
//	
//	@When("^Selecionar menu Solicitacoes Contrato Sem Autoria$")
//	public void Selecionar_Solicitacoes_Contrato_Sem_Autoria() throws Throwable {
//	   contextoPage.menuSolicitacoesContratoSemAutoria();
//	}
}
