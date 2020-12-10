package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.getWait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BasePage<opcoesListada> {

    /**
     *     Classe que gerencia ações realizadas com elementos,
     *     para serem utilizadas/reutilizadas nas classses page
     */

    /********* TextField e TextArea ************/
    public void escreve(By by, String text) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        getDriver().findElement(by).sendKeys(text);
    }

    public void escreve(String elementID, String text) {
        escreve(By.id(elementID), text);
    }

    /********* Botao ************/
    public void clickBotao(By by) {
        getWait(getDriver()).until(ExpectedConditions.elementToBeClickable(by));
        getDriver().findElement(by).click();
    }
    /********* Combo ************/

    public void selecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }
    public void selecionarCombo(By by, String valor) {
        WebElement element = getDriver().findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }
    public void clickBotao(String id) {
        clickBotao(By.id(id));
    }

    /********* Radio************/
    public void clicarRadio(By by) {
        getDriver().findElement(by).click();
    }

    public void clicarRadio(String id) {
        clicarRadio(By.id(id));
    }

    public boolean isRadioMarcado(String id){
        return getDriver().findElement(By.id(id)).isSelected();
    }

    /********* Frames e Janelas ************/
    public void entrarFrame(String elementCss) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementCss)));
        getDriver().switchTo().frame(getDriver().findElement(By.cssSelector(elementCss)));
    }

    public void sairFrame() {
        getDriver().switchTo().defaultContent();
    }

    /********* Modal *************/
    public void waitModalLoad(By by){
        getWait(getDriver()).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    /********* Textos ************/

    public String obterTexto(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        return getDriver().findElement(by).getText();
    }

    public String obterTexto(String id) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        return obterTexto(By.id(id));
    }

    public String obterValueElemento(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        return getDriver().findElement(by).getAttribute("value");
    }

    /************** JS *********************/

    public Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return js.executeScript(cmd, param);
    }

    /********* Radio e Check ************/

    public void clicarCheck(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        getDriver().findElement(by).click();
    }
    public boolean isCheckMarcado(String id){
        return getDriver().findElement(By.id(id)).isSelected();
    }

    public String verificarOpcoesCheck(String cssSelector) {

        List<String> opcoesListada = new ArrayList<String>();
        String lista = null;

        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        List<WebElement> opcoes = getDriver().findElements(By.cssSelector(cssSelector));
        for (WebElement option : opcoes) {
            lista = option.getText();
            opcoesListada.add(lista);
        }
             return opcoesListada.toString().replaceAll("[\\[\\]]","");
    }

    public void enviarComandoTeclas(){
        Actions builder = new Actions(getDriver());
        clickBotao(By.cssSelector("#root > div:nth-child(2) > div > div > div:nth-child(2) > div:nth-child(1) > div > div > div > h1"));
        builder.keyDown(Keys.ALT).sendKeys("I").perform();

    }

}
