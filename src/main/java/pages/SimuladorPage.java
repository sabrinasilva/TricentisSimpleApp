package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SimuladorPage extends BasePage {
    public void clickBotaoContinuarSemConsulta() {
        clickBotao(By.cssSelector("button.is-medium.is-blue.is-outlined.css-e1chn4.e1g7rzdk0"));
    }

    public void clickBotaoAceitarOferta() {
        clickBotao(By.cssSelector("div.flex.justify-end.items-center.mt-6 > button"));
    }
    public void clickBotaoCancelar() {
        clickBotao(By.cssSelector("div > span.mr-3.text-black.font-semibold"));
    }
    public void entrarFrameSimulador() {
        entrarFrame("iframe[title='Simulador']");
    }

    public void sairFrameSimulador() {
        sairFrame();
    }

    public void vericarProdutosOfertados(String produtos) {
        String produtoEsperado = produtos;
        String produtoApresentado = verificarOpcoesCheck(
                "#root>div:nth-child(2)> div> div> div:nth-child(2)>" +
                " div> div > div > div > h1");
        Assert.assertEquals(produtoEsperado, produtoApresentado);
    }
    public void selecionarOferta(String nomeProduto) {
        clicarCheck(By.xpath("//h1[text()='" + nomeProduto + "']"));
    }
    public void obterAtendimento(){
        enviarComandoTeclas();
    }


}
