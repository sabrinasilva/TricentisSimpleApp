package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class CriarAtendimentoPage extends BasePage {

    public void setCpfAtendente(String cpf) {
        escreve("cpf", cpf);
    }

    public void setStoreID(String storeId) {
        escreve("store-id", storeId);
    }

    public void setUserID(String userID) {
        escreve("user-id", userID);
    }

    public void setCpfCliente(String cpfCliente) {
        escreve("cpf-cliente", cpfCliente);
    }

    public void setNomeCliente(String nomeCliente) {
        escreve("nome", nomeCliente);
    }

    public void clickBotaoCriarAtendimento() {
        clickBotao(By.cssSelector(".text-center.block > button"));
    }


}
