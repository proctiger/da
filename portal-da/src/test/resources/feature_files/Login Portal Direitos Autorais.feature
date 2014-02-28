Feature: Testes da Página de Login


 Scenario: Login <Portal DA> verificar elementos da pagina  
	  Given Carregar pagina de login do Portal DA
	  Then Verificar elementos na pagina de Login	 

 Scenario: Login <Portal DA> efetuado com Sucesso 
 	  Given Carregar pagina de login do Portal DA
 	  And Preencher campo usuario com valor <editorial> 
 	  And Preencher campo senha com valor <123>
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login efetuado com sucesso
 	 
 Scenario: Login <Portal DA> NAO efetuado com Sucesso: Login com valor invalido 
 	  Given Carregar pagina de login do Portal DA
 	  And Preencher campo usuario com valor <editorial invalido> 
 	  And Preencher campo senha com valor <123>
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login NAO efetuado com sucesso
 	 
 Scenario: Login <Portal DA> NAO efetuado com Sucesso: Login NAO preenchido 
 	  Given Carregar pagina de login do Portal DA
 	  And Preencher campo senha com valor <123>
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login NAO efetuado com sucesso
 	 
 Scenario: Login <Portal DA> NAO efetuado com Sucesso: Senha com valor invalido 
 	  Given Carregar pagina de login do Portal DA
 	  And Preencher campo usuario com valor <editorial> 
 	  And Preencher campo senha com valor <12345678>
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login NAO efetuado com sucesso
 	  
 Scenario: Login <Portal DA> NAO efetuado com Sucesso: Senha nao preenchida 
 	  Given Carregar pagina de login do Portal DA
 	  And Preencher campo usuario com valor <editorial> 
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login NAO efetuado com sucesso
 	  
 Scenario: Login <Portal DA> NAO efetuado com Sucesso: Senha e Login nao preenchidos 
 	  Given Carregar pagina de login do Portal DA
 	  When Submeter pagina de login do Portal DA
 	  Then Verificar login NAO efetuado com sucesso
	  	  
 Scenario: Login <Portal DA> verificar link Esqueci Minha Senha  
	  Given Carregar pagina de login do Portal DA
	  When Selecionar link Esqueci Minha Senha
	  Then Verificar redirecionamento para pagina de recuperacao de senha	  
	  
 