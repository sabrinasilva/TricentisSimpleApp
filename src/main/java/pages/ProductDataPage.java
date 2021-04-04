package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class ProductDataPage extends BasePage {

	By inputStartDate = By.id("startdate");
	By selectInsuranceSum = By.id("insurancesum");
	By selectMeritRating = By.id("meritrating");
	By selectDamageInsurance = By.id("damageinsurance");
	By radioLegalDefenseInsurance = By.cssSelector(
			"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)");
	By selectCourtesycar = By.id("courtesycar");
	By buttonNext = By.id("nextselectpriceoption");

	public void setStartDate(String value) {
		escreve(inputStartDate, value);
	}

	public void setInsuranceSum(String value) {
		selecionarCombo(selectInsuranceSum, value);
	}

	public void setMertirRating(String value) {
		selecionarCombo(selectMeritRating, value);
	}

	public void setDamageInsurance(String value) {
		selecionarCombo(selectDamageInsurance, value);
	}

	public void setLegalDefenseInsurance() {
		clicarRadio(radioLegalDefenseInsurance);
	}

	public void setCourtesycar(String value) {
		selecionarCombo(selectCourtesycar, value);
	}

	public void clickButtonNext() {
		clickBotao(buttonNext);
	}

}
