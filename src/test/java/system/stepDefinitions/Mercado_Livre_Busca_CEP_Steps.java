package system.stepDefinitions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import system.pages_ml.CEP_Page_ML;
import system.pages_ml.Home_Page_ML;

public class Mercado_Livre_Busca_CEP_Steps {

    Home_Page_ML mercado_livre_page= new Home_Page_ML();
    CEP_Page_ML mercado_livre_cep = new CEP_Page_ML();

    @Dado("que eu estou na pagina principal do Mercado Livre")
    public void que_eu_estou_na_pagina_principal() throws InterruptedException {
        System.out.println("Dado");
        mercado_livre_page.click_botao_cep();
    }

    @Quando("^eu preencho o CEP ([^\"]*)$")
    public void eu_preencheo_cep(String cep) {
        mercado_livre_cep.preencher_campo_cep(cep);
        mercado_livre_cep.clicar_botao_usar_cep();
    }

    @Então("^eu valido que o CEP ([^\"]*) é exibido da pagina principal$")
    public void eu_valido_que_o_cep_e_exibido_na_pagina_principal(String cep) {
        System.out.println("Entao");
        System.out.println(mercado_livre_page.get_text_cep());
        Assert.assertTrue(mercado_livre_page.get_text_cep().contains(cep));
    }
}
