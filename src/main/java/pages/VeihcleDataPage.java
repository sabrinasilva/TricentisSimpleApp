package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class VeihcleDataPage extends BasePage {

	By selectMake = By.id("make");
	By selectModel = By.id("model");
	By inputCapacity = By.id("cylindercapacity");
	By inputEnginePerformance = By.id("engineperformance");
	By inputDateManufacture = By.id("dateofmanufacture");
	By selectNumberSeat = By.id("numberofseats");
	By radioRightHandDriveYes = By.id("righthanddriveyes");
	By radioRightHandDriveNo = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2)");
	By inputNumberSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	By selectFuelType = By.id("fuel");
	By inputPayload = By.id("payload");
	By inputTotalweight = By.id("totalweight");
	By inputListPrice = By.id("listprice");
	By inputLicencePlateNumber = By.id("licenseplatenumber");
	By inputAnnualMileage = By.id("annualmileage");
	By buttonNext = By.id("nextenterinsurantdata");

    public void setMake(String value){
    	selecionarCombo(selectMake, value);
    }
    public void setModel(String value){
    	selecionarCombo(selectModel, value);
    }
    
    public void setCapacity(String value) {
    	escreve(inputCapacity, value);
    }
    
    public void setEnginePerformance(String value) {
    	escreve(inputEnginePerformance, value);
    }
    
    public void setDateManufacture(String value){
    	escreve(inputDateManufacture, value);
    }
    
    public void setNumberSeat(String value){
    	selecionarCombo(selectNumberSeat, value);
    }
    
    public void setRadioRightHandDriveYes() {
    	clicarRadio(radioRightHandDriveYes);
    }
    
    public void setRadioRightHandDriveNo() {
    	clicarRadio(radioRightHandDriveNo);
    }
    
    public void setNumberSeatMotorCycle(String value){
    	selecionarCombo(inputNumberSeatsMotorcycle, value);
    }
    
    public void setFuelType(String value){
    	selecionarCombo(selectFuelType, value);
    }
    
    public void setInputPayload(String value){
    	escreve(inputPayload, value);
    }
    
    public void setInputTotalweight(String value){
    	escreve(inputTotalweight, value);
    }
    
    public void setInputListPrice(String value){
    	escreve(inputListPrice, value);
    }
    
    public void setInputinputLicencePlateNumber(String value){
    	escreve(inputLicencePlateNumber, value);
    }
    
    public void setAnnualMileage(String value){
    	escreve(inputAnnualMileage, value);
    }
    public void clickButtonNext() {
    	clickBotao(buttonNext);
    }

	
}
