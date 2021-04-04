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
     *     Classe para gerenciar ações realizadas com elementos,
     *     utilizar nas classses page
     */

    /********* TextField e TextArea ************/
    public void escreve(By by, String text) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        getDriver().findElement(by).sendKeys(text);
    }

    /********* Botao ************/
    public void clickBotao(By by) {
        getWait(getDriver()).until(ExpectedConditions.elementToBeClickable(by));
        getDriver().findElement(by).click();
    }
    /********* Combo ************/

    public void selecionarCombo(By by, String valor) {
        WebElement element = getDriver().findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    /********* Radio************/
    public void clicarRadio(By by) {
        getDriver().findElement(by).click();
    }


    public boolean isRadioMarcado(By by){
        return getDriver().findElement(by).isSelected();
    }

    /********* Textos ************/

    public String obterTexto(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        return getDriver().findElement(by).getText();
    }


    public String obterValueElemento(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        return getDriver().findElement(by).getAttribute("value");
    }


    /********* Radio e Check ************/

    public void clicarCheck(By by) {
        getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(by));
        getDriver().findElement(by).click();
    }
    public boolean isCheckMarcado(By by){
        return getDriver().findElement(by).isSelected();
    }
}
