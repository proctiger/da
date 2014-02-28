package abril.da.test.steps;

import junit.framework.Assert;
import abril.da.test.page.EsqueciMinhaSenhaPage;
import abril.da.test.page.LoginPage;
import abril.da.test.page.SelecionarContextoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage();
	private SelecionarContextoPage selecionarContextoPage;
	private EsqueciMinhaSenhaPage esqueciMinhaSenhaPage;
	
	
	@Given("^Carregar pagina de login do Portal DA$")
	public void loadPage() {
		loginPage.loadLoginPage();
	}
	
	@Given("^Preencher campo usuario com valor <(.+)>$")
	public void setUser(String usuario) {
		loginPage.setLogin(usuario);
	}
	
	@Given("^Preencher campo senha com valor <(.+)>$")
	public void setPass(String senha) {
		loginPage.setPassword(senha);
	}
	
	@When("^Submeter pagina de login do Portal DA$")
	public void clickSubmit() {
		selecionarContextoPage = loginPage.setSubmit();
	}

	@Then("^Verificar elementos na pagina de Login$")
	public void checkPageLogin() throws Exception {
		loginPage.checkElementsLoginPage();
	}
	
	
	@Then("^Verificar login efetuado com sucesso$")
	public void check() {
		Assert.assertTrue(selecionarContextoPage != null);
	}

	@Then("^Verificar login NAO efetuado com sucesso$")
	public void checkNotLoged() {
		Assert.assertEquals("Usuário ou senha estão incorretos.", loginPage.getError());
	}
	
	@When("^Selecionar link Esqueci Minha Senha$")
	public void clickLinkEsqueciMinhaSenha() {
		esqueciMinhaSenhaPage = loginPage.clickEsqueciMinhaSenha();
	}

	@Then("^Verificar redirecionamento para pagina de recuperacao de senha$")
	public void checkPageEsqueciMinhaSenha() throws Exception {
		esqueciMinhaSenhaPage.checkElementsOnPageRecuperacaoSenha();
	}
	
	
	
	
	
	@Given("^login$")
	public void submitLogin() {
		selecionarContextoPage = loginPage.executeLogin();
	}
	
	@Given("^doLogin$")
	public void doLogin() {
		this.loadPage();
		this.setUser("editorial");
		this.setPass("123");
		this.submitLogin();
	}
}

