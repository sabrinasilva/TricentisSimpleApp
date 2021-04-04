package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class InsurantDataPage extends BasePage {

	By inputFirstName = By.id("firstname");
	By inputLastName = By.id("lastname");
	By inputBirthdate = By.id("birthdate");
	By radioGenderMale = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)");
	By inputStreet = By.id("streetaddress");
	By selectCountry = By.id("country");
	By inputZipCode = By.id("zipcode");
	By inputCity = By.id("city");
	By selectOcupation = By.id("occupation");
	By checkHobbyCliffDiving = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3)");
	By inputWebsite = By.id("website");
	By buttonNext = By.id("nextenterproductdata");


    public void setFistName(String value){
    	escreve(inputFirstName, value);
    }
    public void setLastName(String value){
    	escreve(inputLastName, value);
    }
    
    public void setBirthdate(String value) {
    	escreve(inputBirthdate, value);
    }
    
    public void setGenderMale() {
    	clicarRadio(radioGenderMale);
    }
    
    public void setSreet(String value){
    	escreve(inputStreet, value);
    }
    
    public void setCountry(String value){
    	selecionarCombo(selectCountry, value);
    }
    
    public void setZipCode(String value) {
    	escreve(inputZipCode, value);
    }
    
    public void setCity(String value) {
    	escreve(inputCity,value);
    }
    
    public void setOcupation(String value){
    	selecionarCombo(selectOcupation, value);
    }
    
    public void setCheckHobbyCliffDiving(){
    	clicarCheck(checkHobbyCliffDiving);
    }
    
    public void setWebSite(String value){
    	escreve(inputWebsite, value);
    }
    
    public void setInputTotalweight(String value){
    	escreve(inputWebsite, value);
    }

    public void clickButtonNext() {
    	clickBotao(buttonNext);
    }

	
}
