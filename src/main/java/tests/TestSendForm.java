package tests;

import core.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.ProductDataPage;
import pages.SendQuotePage;
import pages.VeihcleDataPage;
	
public class TestSendForm extends BaseTest {

    VeihcleDataPage veihclecDataPage = new VeihcleDataPage();
    InsurantDataPage insurantDataPage = new InsurantDataPage();
    ProductDataPage productData = new ProductDataPage();
    PriceOptionPage priceOption = new PriceOptionPage();
    SendQuotePage sendQuote = new SendQuotePage();

@Test
    @Dado("^que estou na pagina de formulário$")
    public void pageFormulario() {
    }

	@Dado("^eu estou na aba preecha os dados do veículo$")
	public void abaDadosVeiculo() {
		
	}
    @Quando("^eu preencho os campos do veículo com os valores$")
    public void preencherCamposVeiculo(DataTable dataTable) throws Throwable {
    
    List<String> form = dataTable.asList();
    
    String make = form.get(1);
    String model = form.get(3);
    String capacity = form.get(5);
    String engineperformance = form.get(7);
    String dateofmanufacture = form.get(9);
    String numberofseats = form.get(11);
  
    veihclecDataPage.setMake(make);
    veihclecDataPage.setModel(model);
    veihclecDataPage.setCapacity(capacity);
    veihclecDataPage.setEnginePerformance(engineperformance);
    veihclecDataPage.setDateManufacture(dateofmanufacture);
    veihclecDataPage.setNumberSeat(numberofseats);
    }
    
    @E ("^seleciono a direção direita como não$")
    public void selecionarDirecao(){
    veihclecDataPage.setRadioRightHandDriveNo();
    }
    
    @E ("^preencho os outros campos do veículo com os valores$")
    public void peencherOutrosCamposVeiculo(DataTable dataTable){
    
    List<String> form = dataTable.asList();
    	    
    String numberofseatsmotorcycle = form.get(3);
    String fuel = form.get(5);
    String payload = form.get(7);
    String totalweight = form.get(9);
    String listprice = form.get(11);
    String licenseplatenumber = form.get(13);
    String annualmileage = form.get(15);
    
    veihclecDataPage.setNumberSeatMotorCycle(numberofseatsmotorcycle);
    veihclecDataPage.setFuelType(fuel);
    veihclecDataPage.setInputPayload(payload);
    veihclecDataPage.setInputTotalweight(totalweight);
    veihclecDataPage.setInputListPrice(listprice);
    veihclecDataPage.setInputinputLicencePlateNumber(licenseplatenumber);
    veihclecDataPage.setAnnualMileage(annualmileage);
    }
    
    @E ("^clico em próximo na página veículo$")
    public void proximaPagina(){
    veihclecDataPage.clickButtonNext();
    }
    
    @Então ("^eu vou para aba dados do seguro$")
    public void verificarAbaSeguro(){
    }
    
    @Quando ("^eu estou na aba preecha os dados do seguro$")  
    public void estouAbaSeguro(){
    	
    }
    
    @E ("^eu preencho os campos do seguro com os valores$")
    public void preencherDadosSeguro(DataTable dataTable){
        List<String> form = dataTable.asList();
	    
        String firstname = form.get(3);
        String lastname = form.get(5);
        String birthdate = form.get(7);
        
        insurantDataPage.setFistName(firstname);
        insurantDataPage.setLastName(lastname);
        insurantDataPage.setBirthdate(birthdate);        
    }
    @E("^seleciono o genero como masculino$")
    public void selecionarGeneroMasculino(){
    	insurantDataPage.setGenderMale();
    }
    
    @E("^preencho os outros campos do seguro com os valores$")
    public void preencherOutrosCamposSeguro(DataTable dataTable){
        List<String> form = dataTable.asList();
	    
        String streetaddress = form.get(3);
        String country = form.get(5);
        String zipcode = form.get(7);
        String city = form.get(9);
        String occupation = form.get(11);
        
        insurantDataPage.setSreet(streetaddress);
        insurantDataPage.setCountry(country);
        insurantDataPage.setZipCode(zipcode);
        insurantDataPage.setCity(city);
        insurantDataPage.setOcupation(occupation);
    }
    @E("^seleciono dois hobbies$")
    public void selecionarHobbies(){
    	insurantDataPage.setCheckHobbyCliffDiving();
    }
    @E("^preencho o campo website com o link$")
    public void preencherWebsite(DataTable dataTable){
        List<String> form = dataTable.asList();
	    
        String website = form.get(3);
        
        insurantDataPage.setWebSite(website);
    }
    @E("^clico em próximo para página do produto$")
    public void cliqueNext() {
    	insurantDataPage.clickButtonNext();
    	
    }
    @Então("^eu vou para a aba dados do produto$")
    public void verificarAbaProduto() {
    	
    }
    @Quando("^eu estou na aba preecha os dados do produto$")
    public void estouNaProduto() {
    	
    }
    @E ("^eu preencho os campos do produto com os valores$")
    public void preencherCamposProduto(DataTable dataTable) {
        List<String> form = dataTable.asList();
	    
        String startdate = form.get(3);
        String insurancesum = form.get(5);
        String meritrating = form.get(7);
        String damageinsurance = form.get(9);
        
        productData.setStartDate(startdate);
        productData.setInsuranceSum(insurancesum);
        productData.setMertirRating(meritrating);
        productData.setDamageInsurance(damageinsurance);
    }
    @E ("^seleciono o produto opicional defesa legal$")
    public void selecionar() {
    	productData.setLegalDefenseInsurance();
    }
    @Quando ("^preencho o campo de carro reserva$")
    public void preencherCarroReservaNao(DataTable dataTable) {
    	List<String> form=dataTable.asList();
    	
    	String courtesycar = form.get(3);
    	
    	productData.setCourtesycar(courtesycar);
    }
    @E("^clico em próximo para selecionar opção de preço$")
    public void clicarProximoOpPreco() {
    	productData.clickButtonNext();
    }
    
    @Então("^eu vou para a aba opção de preço$")
    public void verificarAbaOpcaoPreco(){
    }
    
    
    @Quando("^eu estou na aba selecione uma opção de preço$")
    public void abaOpcaoPreco() {
    }
    
    
    @E("^eu seleciono uma opção Gold$")
    public void selecionarOpcaoGold() {
    	priceOption.setGold();
    }
    
    
    @E("^clico em próximo para a aba enviar cotação$")
    public void clicarProximo() {
    	priceOption.clickButtonNext();
    }
    
    @Então("^eu vou para a aba enviar cotação$")
    public void verificarAbaEnviarCotacao() {
    }
    
    @Quando("^eu estou na aba para eviar cotação$")
    public void verificarAbaCotacao() {
    	
    }
    @E("^eu prencho os campos da cotação com os valores$")
    public void preencherCamposCotacao(DataTable dataTable) {
    List <String> form = dataTable.asList();
    
    String email = form.get(3);
    String phone = form.get(5);
    String username = form.get(7);
    String password = form.get(9);
    String confirmpassword = form.get(11);
    String comments = form.get(13);

    sendQuote.setEmail(email);
    sendQuote.setPhone(phone);
    sendQuote.setUserName(username);
    sendQuote.setPassword(password);
    sendQuote.setConfirmPassword(confirmpassword);
    sendQuote.setComments(comments);
    } 
    @E("^clico no botão enviar cotação$")
    public void clickEnviarCotacao() {
    sendQuote.clickSendEmail();
    }
    @Então("^eu recebo a mensagem \"([^\"]*)\"$")
    public void verificarMsgSucesso(String msgEsperada){
    assertEquals(msgEsperada,sendQuote.verificarMsgSucesso());
    }
}