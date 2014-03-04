Feature: Paginas de Admin
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <usuarios> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <usuarios>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <usuarios>
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <contexto> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <contexto>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <contexto>
 
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <perfil> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <perfil>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <perfil>
 
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <paginas> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <paginas>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <paginas>
 
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <paginas itens> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <paginas itens>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <paginas itens>
 
 
 Scenario: Portal <Atica> com Perfil <Editorial> : verificar elementos pagina de Admin <paginas itens permissoes> 
 	  Given Carregar pagina Selecionar Contexto
 	  And Selecionar contexto <Ática>	
 	  When Submeter pagina Selecionar Contexto
 	  And  Carregar pagina de Admin <paginas itens permissoes>
 	  Then Verificar acesso a homepage do Portal DA com o contexto <Ática>
 	  And  Verificar acesso a homepage do Portal DA com o login <Editorial>
 	  And  Verificar elementos da pagina de Admin <paginas itens permissoes>
 
 
 
 








