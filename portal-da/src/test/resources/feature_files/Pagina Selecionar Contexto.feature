Feature: Selecionar Contexto

#  Scenario: Homepage Portal DA verificar elementos da pagina  
#	  Given Carregar pagina Selecionar Contexto
#	  Then Verificar elementos da pagina Selecionar Contexto
#	  
  Scenario: Contexto <Atica> selecionado com Sucesso
	  Given Carregar pagina Selecionar Contexto
	  And Selecionar contexto <Ática>	
	  When Submeter pagina Selecionar Contexto
	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
  		   








