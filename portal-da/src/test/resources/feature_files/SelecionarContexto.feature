Feature: Selecionar Contexto



  Scenario: Contexto <Atica> selecionado com Sucesso
  Given carregar pagina Selecionar Contexto
  And selecionar contexto <Ática>	
  When submit Selecionar Contexto
  Then checkSelectedContext
  












