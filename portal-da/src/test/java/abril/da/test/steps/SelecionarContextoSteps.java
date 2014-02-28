package abril.da.test.steps;

import junit.framework.Assert;
import abril.da.test.page.HomePage;
import abril.da.test.page.LoginPage;
import abril.da.test.page.SelecionarContextoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelecionarContextoSteps {
	
	private static SelecionarContextoPage selecionarContextoPage = new SelecionarContextoPage();
	private static HomePage homePage;
	
	@Given("^carregar pagina Selecionar Contexto$")
	public void loadPage() {
		LoginPage loginPage = new LoginPage();
		selecionarContextoPage = loginPage.executeLoginSuccess();
	}
	
	@Given("^selecionar contexto <(.+)>$")
	public void selectContexto(String contexto) {
		selecionarContextoPage.setContexto(contexto);
	}
	
	@When("^submit Selecionar Contexto$")
	public void clickSubmit() {
		 homePage = selecionarContextoPage.setSubmit();
	}
	
	@Then("^checkSelectedContext$")
	public void check() {
		Assert.assertTrue(homePage != null);
	}
}

