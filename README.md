# Desafio BugBank

## Descrição

Este é um projeto criado em Java com Selenium, Cucumber e JUnit 5 para testar a funcionalidade de login e cadastro de um site de banco fictício chamado <a href=“https://bugbank.netlify.app/“>BugBank</a>. O objetivo é garantir que o login e o cadastro funcionem corretamente e que o usuário possa acessar sua conta com segurança, além de transferir dinheiro entre contas e validar os saldos corretos.

## Instalação

Para instalar e usar o projeto, siga as instruções abaixo:

1. Clone o repositório:

    ```
    git clone https://github.com/brendsduda/Desafio_glassdoor.git
    ```
   
2. Importe o projeto para sua IDE de preferência (como Eclipse, IntelliJ, etc.).

3. Configure as dependências necessárias, como o driver do navegador. Para adequar a execução, você pode colar na pasta src>test>resources>drivers e colar a versão do chromedriver de acordo com a versão atual do seu navegador Chrome.

4. Execute os testes através da classe `RunnerTest`.

## Como usar

Este projeto utiliza o framework Cucumber para criar testes automatizados em linguagem natural. Os testes estão localizados na pasta `src/test/resources/features`. Para executar os testes, basta executar a classe `RunnerTest`.

### Suites de Teste

Este projeto contém uma suite de teste:

#### Cadastro

A Suite de Teste Cadastro realiza o cadastro de dois usuários, realiza uma transferência e valida os saldos das duas contas afim de garantir o processamento correto para esta funcionalidade.

## Relatório

Após executar os testes, será gerado um relatório da execução atual. O relatório estará disponível na pasta `target/cucumber-report`. Para visualizar o relatório, basta abrir o arquivo `report.html` em seu navegador.
