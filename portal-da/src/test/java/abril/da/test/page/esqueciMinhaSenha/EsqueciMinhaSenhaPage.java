package abril.da.test.page.esqueciMinhaSenha;

import org.junit.Assert;
import org.openqa.selenium.By;

import abril.da.test.page.BasePage;

public class EsqueciMinhaSenhaPage extends BasePage {

	private final String TEXT_LEGEND			 = "Recuperação de senha";
	private final String TEXT_INFORM_1 			 = "Digite o usuário com o qual está cadastrado no campo abaixo.";
	private final String TEXT_INFORM_2			 = "A senha será enviada para o endereço de e-mail cadastrado.";
	private final String INPUT_ID_USUARIO = "DSC_LOGIN_USU";
	private final String BUTTON_ID_VOLTAR = "voltar"; 
	private final String BUTTON_ID_ENVIAR = "enviar";
	private StringBuffer verificationErrors = new StringBuffer();
	
	 public void checkElementsOnPageRecuperacaoSenha() throws Exception {
		 
		    try {
		      Assert.assertEquals(TEXT_LEGEND, driver.findElement(By.cssSelector("legend")).getText());
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		    try {
		    	Assert.assertEquals(TEXT_INFORM_1, driver.findElement(By.cssSelector("span")).getText());
		    } catch (Error e) {
		    	verificationErrors.append(e.toString());
		    }
		    try {
		    	Assert.assertEquals(TEXT_INFORM_2, driver.findElement(By.xpath("//span[2]")).getText());
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		    try {
		    	Assert.assertTrue(isElementPresent(By.id(INPUT_ID_USUARIO)));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		    try {
		    	Assert.assertTrue(isElementPresent(By.id(BUTTON_ID_VOLTAR)));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		    try {
		    	Assert.assertTrue(isElementPresent(By.id(BUTTON_ID_ENVIAR)));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		  }
	
}
