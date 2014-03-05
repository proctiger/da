Feature: Paginas de Admin
 
 @important
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <usuarios> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Cadastrar novo usuario
	   
