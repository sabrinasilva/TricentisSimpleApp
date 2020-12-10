package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class LoginSalesEmulatorPage extends BasePage {

    public void setNome(String nome) {
        escreve("username", nome);
    }

    public void setSenha(String password) {
        escreve("senha", password);
    }

    public void clickBotaoAutenticacao() {
        clickBotao(By.cssSelector("#root>div>div>div>form>div:nth-child(3)>button"));
    }

}


