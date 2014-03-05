package abril.da.test.page.contexto.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import abril.da.test.page.BasePage;

public class AdminCadastrarUsuarioPage extends BasePage {
	
	  public void checkElementsOnThePage() throws Exception {
		    
		    
		  }
	  
	  public void cadastraNovoUsuario(){

	
		driver.findElement(By.id("usu_NOM_USUARIO_USU")).sendKeys("w1");
		driver.findElement(By.id("usu_NOM_SOBRENOME_USU")).sendKeys("w1111");
		driver.findElement(By.id("usu_DSC_EMAIL_USU")).sendKeys("email@email.com");
		
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).click();
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys("11");
		driver.findElement(By.id("usu.NUM_DDD_FIXO_USU_I")).sendKeys(Keys.UP);
		
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).click();
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys("30212121");
		driver.findElement(By.id("usu.NUM_TEL_FIXO_USU_I")).sendKeys(Keys.UP);

		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).click();
		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys("11");
		driver.findElement(By.id("usu.NUM_DDD_CEL_USU_I")).sendKeys(Keys.UP);
	
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).click();
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys("999989389");
		driver.findElement(By.id("usu.NUM_CEL_USU_I")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("btnRight")).click();
		driver.findElement(By.id("usu_DSC_LOGIN_USU")).sendKeys("usuario");
		
		
		 driver.findElement(By.cssSelector("td.dxic")).click();
		 driver.findElement(By.id("CBContexto_DDD_L_LBI3T0")).click();
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys(Keys.UP);
			
		 
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys("Ática");
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys(Keys.RETURN);
		
		 
		 
		 
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys("Ática");
		 driver.findElement(By.id("IdContextoSelecionado_I")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.cssSelector("div.linha > input[type=\"button\"]")).click();
		driver.findElement(By.id("btnSalvar")).click();

	  }


}
