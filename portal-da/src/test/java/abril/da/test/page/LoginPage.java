package abril.da.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	private static String loginId 				= "DSC_LOGIN_USU";
	private static String passwordId 			= "DSC_SENHA_USU";
	private static String submitCss				= "input.right";
	private static String baseUrl 				= "http://qa.dra.scipioneatica.com.br/";
	private static String loginUrl 				= "/Login/LoginPrincipal";
	private static String errorElement 			= "//ul[@class=\"messagesError\"]";
	private static String linkTextEsqueciSenha 	= "» Esqueci minha senha";

	public void loadLoginPage() {
		driver.get(baseUrl + loginUrl);
	}

	public void checkElementsLoginPage() {
        Assert.assertEquals("Sistema de Direitos Autorais", driver.getTitle());
	    Assert.assertEquals("Acesso ao sistema DA", driver.findElement(By.cssSelector("legend")).getText());
	    Assert.assertTrue(isElementPresent(By.id("DSC_LOGIN_USU")));
	    Assert.assertTrue(isElementPresent(By.id("DSC_SENHA_USU")));
	    Assert.assertTrue(isElementPresent(By.linkText(linkTextEsqueciSenha)));
	    Assert.assertEquals("Usuário", driver.findElement(By.cssSelector("label")).getText());
	    Assert.assertEquals("Senha", driver.findElement(By.xpath("//fieldset[@id='fieldLogin']/div[2]/div/label")).getText());
	    Assert.assertTrue(isElementPresent(By.cssSelector(submitCss)));
	    Assert.assertEquals("Acessar", driver.findElement(By.cssSelector(submitCss)).getAttribute("value"));
	}
	
	public void setLogin(String userLogin) {
		driver.findElement(By.id(loginId)).clear();
		driver.findElement(By.id(loginId)).sendKeys(userLogin);
	}

	public void setPassword(String password) {
		driver.findElement(By.id(passwordId)).clear();
		driver.findElement(By.id(passwordId)).sendKeys(password);
	}

	public SelecionarContextoPage setSubmit() {
		driver.findElement(By.cssSelector(submitCss)).click();
		return new SelecionarContextoPage();
	}

	public SelecionarContextoPage executeLogin(){
		setLogin("editorial");
		setPassword("123");
		setSubmit();

		return new SelecionarContextoPage();
	}

	public String getError(){
		return driver.findElement(By.xpath(errorElement)).getText();
	}
	
	public SelecionarContextoPage executeLoginSuccess(){
		loadLoginPage();
		setLogin("editorial");
		setPassword("123");
		setSubmit();
		
		return new SelecionarContextoPage();
	}

	public EsqueciMinhaSenhaPage clickEsqueciMinhaSenha() {
		driver.findElement(By.linkText(linkTextEsqueciSenha)).click();
		return new EsqueciMinhaSenhaPage();
	}
}
	
