package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class CanalFormalizacaoPage extends BasePage {

    public void clickRadioAppConsutor() {
        clicarRadio(By.cssSelector("#root > div:nth-child(2) > div > div > div:nth-child(2) > button"));
    }

    public void clickBotaoContinuar() {
        clickBotao(By.cssSelector("body > div.ReactModalPortal > div > div > div.mt-8.text-center > button"));
    }
}
