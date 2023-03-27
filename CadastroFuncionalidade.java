package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroFuncionalidade extends CadastroPageElementMap {

    private static final String EMAIL1 = "viola@davis.com";
    private static final String NAME1 = "Viola Davis";
    private static final String PASSWORD1 = "teste@123";
    private static final String CONFIRM_PASSWORD1 = "teste@123";

    private static final String EMAIL2 = "anderson@silva.com";
    private static final String NAME2 = "Anderson Silva";
    private static final String PASSWORD2 = "teste@123";
    private static final String CONFIRM_PASSWORD2 = "teste@123";

    public static String numeroConta1;
    public static String digito1;
    public static String numeroConta2;
    public static String digito2;

    private final Duration duration = Duration.ofSeconds(10);
    private final WebDriverWait wait = new WebDriverWait(driver, duration);

    public CadastroFuncionalidade(){
        PageFactory.initElements(driver, this);
    }

    public void cadastroDoisUsuarios() throws InterruptedException {
        // Primeiro usuário
        btnRegistrar.click();
        getEmailSignup.sendKeys(EMAIL1);
        getName.sendKeys(NAME1);
        getPasswordSignup.sendKeys(PASSWORD1);
        getConfirmPassword.sendKeys(CONFIRM_PASSWORD1);
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOf(btnContaSaldo)).click();
        wait.until(ExpectedConditions.visibilityOf(btnRegistrarUser)).click();
        wait.until(ExpectedConditions.visibilityOf(modalMsgSucesso));
        String msgSucesso = modalMsgSucesso.getText();
        String padrao = "A conta (\\d+)-(\\d+) foi criada com sucesso";
        Pattern p = Pattern.compile(padrao);
        Matcher m = p.matcher(msgSucesso);
        numeroConta1 = "";
        digito1 = "";
        if (m.find()) {
            numeroConta1 = m.group(1); // atribui valor à variável global
            digito1 = m.group(2); // atribui valor à variável global
        }

        // Segundo usuário
        driver.get("https://bugbank.netlify.app/");
        btnRegistrar.click();
        getEmailSignup.sendKeys(EMAIL2);
        getName.sendKeys(NAME2);
        getPasswordSignup.sendKeys(PASSWORD2);
        getConfirmPassword.sendKeys(CONFIRM_PASSWORD2);
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOf(btnContaSaldo)).click();
        wait.until(ExpectedConditions.visibilityOf(btnRegistrarUser)).click();
        wait.until(ExpectedConditions.visibilityOf(modalMsgSucesso));
        String msgSucesso2 = modalMsgSucesso.getText();
        String padrao2 = "A conta (\\d+)-(\\d+) foi criada com sucesso";
        Pattern q = Pattern.compile(padrao2);
        Matcher n = q.matcher(msgSucesso2);
        numeroConta2 = "";
        digito2 = "";
        if (n.find()) {
            numeroConta2 = n.group(1); // atribui valor à variável global
            digito2 = n.group(2); // atribui valor à variável global
        }
    }

    public void acessoAPrimeiraContaERealizoUmaTransferênciaParaASegunda(){
        driver.get("https://bugbank.netlify.app/");
        getEmailLogin.sendKeys(EMAIL1);
        getPasswordLogin.sendKeys(PASSWORD1);
        getAcessar.click();
        wait.until(ExpectedConditions.visibilityOf(btnTranferencia)).click();
        wait.until(ExpectedConditions.visibilityOf(getAccountNumber)).sendKeys(numeroConta2);
        getDigitNumber.sendKeys(digito2);
        getValorTransf.sendKeys("500");
        getDescricao.sendKeys("Este testes faz parte do desafio com JAVA");
        btnTransfAgora.click();
        wait.until(ExpectedConditions.visibilityOf(modalTransfSucesso));
    }
    public void devoValidarASaidaEEntradaDosValoresNasContas(){
        btnCloseModal.click();
        btnBack.click();
        btnExtrato.click();
        wait.until(ExpectedConditions.visibilityOf(getSaldoDavis));
        String saldoDavis = getSaldoDavis.getText();
        btnExit.click();

        getEmailLogin.sendKeys(EMAIL2);
        getPasswordLogin.sendKeys(PASSWORD2);
        getAcessar.click();

        wait.until(ExpectedConditions.visibilityOf(btnExtrato));
        btnExtrato.click();
        wait.until(ExpectedConditions.visibilityOf(getSaldoSilva));
        String saldoSilva = getSaldoSilva.getText();

        Assert.assertEquals("R$ 1.500,00", saldoSilva);
        Assert.assertEquals("R$ 500,00", saldoDavis);
    }

    public void queEstouNaPáginaInicial(){
        driver.get("https://bugbank.netlify.app/");
    }

}
