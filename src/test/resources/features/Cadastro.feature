#language: pt
#encoding: utf-8
#@run
@After
Funcionalidade: Cadastrar dois usuarios e realizar uma transferência
  Eu como usuario não cadastrado
  Desejo cadastrar dois usuários
  Afim de realizar uma transação

  @cadastro
  Cenario: Criar o primeiro usuario
    Dado que estou na pagina inicial
    E cadastro dois usuarios
    Quando acesso a primeira conta e realizo uma transferência para a segunda
    Entao devo validar a saida e entrada dos valores nas contas



