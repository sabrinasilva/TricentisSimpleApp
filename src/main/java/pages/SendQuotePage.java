package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class SendQuotePage extends BasePage {

	By inputEmail = By.id("email");
	By inputPhone = By.id("phone");
	By inputUserName = By.id("username");
	By inputPassword = By.id("password");
	By inputConfirmPassword = By.id("confirmpassword");
	By inputComments = By.id("Comments");
	By buttonSendEmail = By.id("sendemail");
	By divMsgSucess = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	public void setEmail(String value) {
		escreve(inputEmail, value);
	}

	public void setPhone(String value) {
		escreve(inputPhone, value);
	}

	public void setUserName(String value) {
		escreve(inputUserName, value);
	}

	public void setPassword(String value) {
		escreve(inputPassword, value);
	}

	public void setConfirmPassword(String value) {
		escreve(inputConfirmPassword,value);
	}

	public void setComments(String value) {
		escreve(inputComments, value);
	}

	public void clickSendEmail() {
		clickBotao(buttonSendEmail);
	}
	public String verificarMsgSucesso(){
		String msg = obterTexto(divMsgSucess);
		return msg;
	}

}
