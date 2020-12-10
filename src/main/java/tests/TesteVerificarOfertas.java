package tests;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.CriarAtendimentoPage;
import pages.LoginSalesEmulatorPage;
import pages.SimuladorPage;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;

public class TesteVerificarOfertas extends BaseTest {

    LoginSalesEmulatorPage loginSalesPage = new LoginSalesEmulatorPage();
    CriarAtendimentoPage criarAtendimentoPage = new CriarAtendimentoPage();
    SimuladorPage simuladorPage = new SimuladorPage();

@Test
    @Dado("^que possuo acesso ao sistema Sales$")
    public void quePossuoAcessoAoSistemaSales() {

        loginSalesPage.setNome("sinqia.sabrina");
        loginSalesPage.setSenha("1020");
        loginSalesPage.clickBotaoAutenticacao();
    }
    @Dado("^informo o CPF do cliente \"(.*?)\"$")
    public void informoOCPF(String cpfCliente) throws Throwable {
        criarAtendimentoPage.setCpfAtendente("039.950.133-92");
        criarAtendimentoPage.setStoreID("727");
        criarAtendimentoPage.setCpfCliente(cpfCliente);
        criarAtendimentoPage.setUserID("123");
    }
    @Quando ("crio atendimento ao cliente")
    public void crioAtendimentoAoCliente() {
        criarAtendimentoPage.clickBotaoCriarAtendimento();
    }

    @Então("^os produtos \"(.*?)\" devem ser ofertados com sucesso$")
    public void osProdutosDevemSerOfertadosComSucesso(String produtos) throws InterruptedException {
        simuladorPage.entrarFrameSimulador();
        simuladorPage.clickBotaoContinuarSemConsulta();
        simuladorPage.vericarProdutosOfertados(produtos);
    }

    @After()
    public void screenshot(Scenario cenario) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + cenario.getName() + ".jpg"));
        String status = cenario.getStatus().toString();
            simuladorPage.clickBotaoCancelar();
    }
}
