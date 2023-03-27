package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.TestRule;

public class CadastroPageElementMap {

    protected WebDriver driver = TestRule.getDriver();

    @FindBy(xpath = "//button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']")
    protected WebElement btnRegistrar;

    @FindBy(xpath = "//p[@id='modalText'][contains(text(),'criada com sucesso')]")
    protected WebElement modalMsgSucesso;

    @FindBy(xpath = "//p[@id='modalText'][contains(text(),'Transferencia realizada com sucesso')]")
    protected WebElement modalTransfSucesso;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    protected WebElement getEmailSignup;

    @FindBy(xpath = "//p[@id='textBalanceAvailable']")
    protected WebElement getSaldoDavis;

    @FindBy(xpath = "//p[@id='textBalanceAvailable']")
    protected WebElement getSaldoSilva;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    protected WebElement getEmailLogin;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    protected WebElement getAcessar;

    @FindBy(xpath = "//a[@id='btn-TRANSFERÊNCIA']")
    protected WebElement btnTranferencia;

    @FindBy(name = "accountNumber")
    protected WebElement getAccountNumber;

    @FindBy(id = "btnCloseModal")
    protected WebElement btnCloseModal;

    @FindBy(id = "btnBack")
    protected WebElement btnBack;

    @FindBy(id = "btn-EXTRATO")
    protected WebElement btnExtrato;

    @FindBy(id = "btnExit")
    protected WebElement btnExit;

    @FindBy(name = "digit")
    protected WebElement getDigitNumber;

    @FindBy(name = "transferValue")
    protected WebElement getValorTransf;

    @FindBy(name = "description")
    protected WebElement getDescricao;

    @FindBy(xpath = "//button[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']")
    protected WebElement btnTransfAgora;

    @FindBy(name = "name")
    protected WebElement getName;

    @FindBy(xpath = "(//input[@name='password'])[2]")
    protected WebElement getPasswordSignup;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    protected WebElement getPasswordLogin;

    @FindBy(xpath = "//input[@name='passwordConfirmation']")
    protected WebElement getConfirmPassword;

    @FindBy(xpath = "(//div[@class='styles__ContainerToggle-sc-7fhc7g-2 cJsFYf']//label)[1]")
    protected WebElement btnContaSaldo;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    protected WebElement btnRegistrarUser;
}
