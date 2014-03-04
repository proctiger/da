Feature: Solicitacoes Contrato Editora
  		   
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos <Contrato Editora>
	  Given Carregar pagina Selecionar Contexto
	  And Selecionar contexto <Ática>	
	  When Submeter pagina Selecionar Contexto
	  And  Carregar pagina Solicitacoes Contrato <Editora>
	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
	  And  Verificar elementos da pagina <Solicitacoes Contrato Editora>











