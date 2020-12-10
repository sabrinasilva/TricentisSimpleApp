package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ConfigVinculoContaCartaoPage extends BasePage {


    public String verificarTituloConfigProduto(){
        return obterTexto(By.cssSelector("h1.title.is-medium.is-black.is-blue.text-3xl.mb-10.mt-5.text-left.flex.items-center"));
    }
    public String verifcarSubTituloConfigProduto(){
        return obterTexto(By.cssSelector("h1.title.is-medium.is-black.is-blue.text-sm.mt-5.mb-5.text-left"));
    }
    public String verificarNomeBotaoSalvar(){
        return obterTexto(By.cssSelector("div.text-left.mt-20.mb-10 > button>span"));
    }
    public void clickBotaoSalvarContinuar() {
        clickBotao(By.cssSelector("div.text-left.mt-20.mb-10 > button"));
    }

    public void informarVinculoContaCartao(String IdConta, String IdCartao){
        escreve("account-ID", IdConta);
        escreve("card-id", IdCartao);
    }
}
