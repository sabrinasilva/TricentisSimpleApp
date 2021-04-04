package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class PriceOptionPage extends BasePage {

	By radioSilver = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1)");
	By radioGold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2)");
	By radioPlatinium = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)");
	By radioUltimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4)");
	By buttonNext = By.id("nextsendquote");


    public void setSilver(String value){
    	clicarRadio(radioSilver);
    }

    public void setGold() {
    	clicarRadio(radioGold);
    }

    public void setPlatinium() {
    	clicarRadio(radioPlatinium);
    }

    public void setUltimate() {
    	clicarRadio(radioUltimate);
    }
    
	public void clickButtonNext() {
		clickBotao(buttonNext);
	}
}
