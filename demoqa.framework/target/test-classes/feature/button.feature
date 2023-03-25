#Author: QueilaSilva

Feature: Validacao tela home
Como usuario irei validar button da home page para minha automacao

 @Negative
  Scenario: Demais button home page 
    Given que entre no site "https://demoqa.com/"
    When clico em todos button 
    And button book mostra books disponiveis 
    But os demais pedem para clicar no item ao lado esquerdo
    
    
    