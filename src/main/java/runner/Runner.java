package runner;


import core.Propriedades;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.IOException;

import static core.DriverFactory.killDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\src\\main\\resources\\features\\", //local das features
        glue= "tests",//local dos testes
        plugin = {"pretty", "html:target//report/report.html"},
        monochrome = true,  //desabilita caracteres especiais (remove colorido)
        snippets =  SnippetType.CAMELCASE, //cria os metodos no formato camelCase
        dryRun = false//apenas roda o cucumber, valida apenas se os cenários já existem (se true)
)
public class Runner {
    @AfterClass
    public static void finaliza() throws IOException {

        if (Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}