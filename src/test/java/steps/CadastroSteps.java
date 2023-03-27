package steps;

import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroFuncionalidade;
import util.TestRule;

public class CadastroSteps {

    @Dado("que estou na pagina inicial")
    public void queEstouNaPaginaInicial() {
        String bugbankUrl = "https://bugbank.netlify.app/";
        TestRule.abrirNavegador(bugbankUrl);
        CadastroFuncionalidade validarHome = new CadastroFuncionalidade();
        validarHome.queEstouNaPáginaInicial();
    }

    @E("cadastro dois usuarios")
    public void cadastroDoisUsuarios() throws InterruptedException {
        CadastroFuncionalidade cadastroUsuarios = new CadastroFuncionalidade();
        cadastroUsuarios.cadastroDoisUsuarios();
    }

    @Quando("acesso a primeira conta e realizo uma transferência para a segunda")
    public void acessoAPrimeiraContaERealizoUmaTransferênciaParaASegunda() {
        CadastroFuncionalidade transferenciaValores = new CadastroFuncionalidade();
        transferenciaValores.acessoAPrimeiraContaERealizoUmaTransferênciaParaASegunda();
    }

    @Entao("devo validar a saida e entrada dos valores nas contas")
    public void devoValidarASaidaEEntradaDosValoresNasContas() {
        CadastroFuncionalidade validacaoSaidasEntradas = new CadastroFuncionalidade();
        validacaoSaidasEntradas.devoValidarASaidaEEntradaDosValoresNasContas();
    }

}