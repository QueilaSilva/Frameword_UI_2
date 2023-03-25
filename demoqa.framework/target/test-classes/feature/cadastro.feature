#Author: QueilaSilva

Feature: Validacao tela home
Como usuario irei validar button da home page para minha automacao

 @Positive
  Scenario: Validar button entrar
    Given que entre no site "https://demoqa.com/"
    When clico em entrar para validar button 
    And button de entrar valido
    Then tela para cadastro aberta
    
    
   

