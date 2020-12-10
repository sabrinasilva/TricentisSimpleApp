package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ColetaDeDadosPage extends BasePage {

    public void setNome(String nome) {
        escreve("fullName", nome);
    }
    public void setDtNascimento(String data) {
        escreve("birthday", data);
    }
    public void setCep(String cep) {
        escreve("postCode", cep);
    }
    public void setTipoLogradouro(String tipoLogradouro) {
        selecionarCombo(By.cssSelector("#root > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(2) > div > div > div"),tipoLogradouro);
    }
    public void setLogradouro(String logradouro) {
        escreve("street", logradouro);
    }
    public void setNumero(String numero) {
        escreve("number", numero);
    }
    public void setComplemento(String complemento) {
        escreve("additionalAtribute", complemento);
    }
    public void setBairro(String bairro) {
        escreve("neighborhood", bairro);
    }
    public void setCidade(String cidade) {
        escreve("city", cidade);
    }
    public void setEstado(String estado) {
        escreve("state", estado  );
    }
    public void setEmail(String email) {
        escreve("email", email  );
    }
    public void setTelefone(String telefone) {
        escreve("phone", telefone  );
    }
    public void clickSalvarInformacoes() {
        clickBotao(By.cssSelector("#root > div:nth-child(2) > div > button"));
    }

    public void clickConfirmarTelefone() {
        clickBotao(By.cssSelector("body > div.ReactModalPortal > div > div > div.mt-8.text-center > button"));
    }
}
