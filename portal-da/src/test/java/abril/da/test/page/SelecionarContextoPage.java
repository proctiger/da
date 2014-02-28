package abril.da.test.page;

import org.openqa.selenium.By;

public class SelecionarContextoPage extends BasePage {

	private static String selecionarContextoUrl = baseUrl + "/SelecionaContexto";
	private static String submitCss = "input.right";

	

	public void setContexto(String contexto) {
		driver.findElement(By.name("IdContextoSelecionado")).clear();
		driver.findElement(By.name("IdContextoSelecionado")).sendKeys(contexto);
//		driver.findElement(
//				By.xpath("//td[@id='IdContextoSelecionado_DDD_L_LBI1T0']"))
//				.click();
	}

	public HomePage setSubmit() {
		driver.findElement(By.cssSelector(submitCss)).click();
		return new HomePage();
	}

}
