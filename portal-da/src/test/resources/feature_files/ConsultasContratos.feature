Feature: Consultas Contratos
  		   
  Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos <Consultas Contratos> 
	  Given Carregar pagina Selecionar Contexto
	  And Selecionar contexto <Ática>	
	  When Submeter pagina Selecionar Contexto
	  And  Carregar pagina de consulta <Consultas Contratos>
	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
	  And  Verificar elementos da pagina de consulta <Consultas Contratos>

Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos <Consultas Contratos Legado> 
	  Given Carregar pagina Selecionar Contexto
	  And Selecionar contexto <Ática>	
	  When Submeter pagina Selecionar Contexto
	  And  Carregar pagina de consulta <Consultas Contratos Legado>
	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
	  And  Verificar elementos da pagina de consulta <Consultas Contratos Legado>










