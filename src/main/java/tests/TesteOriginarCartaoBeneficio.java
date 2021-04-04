package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class TesteCriarCartaoBeneficio extends BaseTest {

    LoginSalesEmulatorPage loginSalesPage = new LoginSalesEmulatorPage();
    CriarAtendimentoPage criarAtendimentoPage = new CriarAtendimentoPage();
    SimuladorPage simuladorPage = new SimuladorPage();
    ConfigVinculoContaCartaoPage configVinculoContaCartao = new ConfigVinculoContaCartaoPage();
    ColetaDeDadosPage coletaDeDadosPage = new ColetaDeDadosPage();
    CanalFormalizacaoPage canalFormalizacaoPage = new CanalFormalizacaoPage();

    @Test
    public void orginarCartaoBeneficio() throws InterruptedException {

        List<String> produtoEsperado = new ArrayList<String>();

        loginSalesPage.setNome("sinqia.sabrina");
        loginSalesPage.setSenha("1020");
        loginSalesPage.clickBotaoAutenticacao();
        criarAtendimentoPage.setCpfAtendente("039.950.133-92");
        criarAtendimentoPage.setStoreID("727");
        criarAtendimentoPage.setCpfCliente("676.487.620-72");
        criarAtendimentoPage.setUserID("123");
        criarAtendimentoPage.clickBotaoCriarAtendimento();
        simuladorPage.entrarFrameSimulador();
        simuladorPage.clickBotaoContinuarSemConsulta();
        simuladorPage.selecionarOferta("Cartão Benefício");
        simuladorPage.clickBotaoAceitarOferta();

        //Valida página de configuração da conta correte
        Assert.assertEquals("Cartão Benefício", configVinculoContaCartao.verificarTituloConfigProduto());
        Assert.assertEquals("Forma de recebimento do cartão:", configVinculoContaCartao.verifcarSubTituloConfigProduto());
        Assert.assertEquals("Salvar e continuar", configVinculoContaCartao.verificarNomeBotaoSalvar());

        configVinculoContaCartao.informarVinculoContaCartao("545201","718519");
        configVinculoContaCartao.clickBotaoSalvarContinuar();

        coletaDeDadosPage.setNumero("908");
        coletaDeDadosPage.setComplemento("AP 909");
        coletaDeDadosPage.setEmail("aprova@gmail.com.br");
        coletaDeDadosPage.setTelefone("(54) 99118-7557");
        coletaDeDadosPage.clickSalvarInformacoes();
        coletaDeDadosPage.clickConfirmarTelefone();

        canalFormalizacaoPage.clickRadioAppConsutor();
        canalFormalizacaoPage.clickBotaoContinuar();

    }

}
