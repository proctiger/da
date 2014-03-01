package abril.da.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.JavascriptLibrary;
import org.openqa.selenium.support.ui.Select;

public class SelecionarContextoPage extends BasePage {

	private final String legenda = "Selecionar contexto";
	
	
	private static String selecionarContextoUrl = baseUrl + "/SelecionaContexto";
	private static String submitCss = "input.right";

	

	public void setContexto(String contexto) {
		 driver.findElement(By.cssSelector("td.dxic")).click();
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys("Ática");
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys(Keys.RETURN);
    }

	public void strutaSetcontexto(){
		////	solucao 2
		String xpath = "//*[text()='Ática']";
		driver.findElement(By.cssSelector("td.dxic")).click();
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public HomePage setSubmit() {
		driver.findElement(By.cssSelector(submitCss)).click();
		return new HomePage();
	}

	public void checkElementsSelecionarContexto() {
	    Assert.assertEquals("Selecionar contexto", driver.findElement(By.cssSelector("legend")).getText());
	    Assert.assertEquals("Contexto", driver.findElement(By.cssSelector("label")).getText());
	    Assert.assertEquals("Selecionar", driver.findElement(By.cssSelector("input.right")).getAttribute("value"));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_I")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_B-1Img")));
	    Assert.assertTrue(isElementPresent(By.cssSelector("input.right")));
	    Assert.assertTrue(isElementPresent(By.cssSelector("legend")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI1T0")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI2T0")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI3T0")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI4T0")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI5T0")));
	    Assert.assertTrue(isElementPresent(By.id("IdContextoSelecionado_DDD_L_LBI6T0")));
	    Assert.assertEquals("Selecionar contexto", driver.findElement(By.cssSelector("legend")).getText());
		
	}

}
