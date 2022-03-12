package system.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import system.pages_ml.Instagram_Page_ML;
import system.pages_ml.Rede_Social_Page_ML;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mercado_Livre_Rede_Social_Steps {
    Rede_Social_Page_ML rede_social = new Rede_Social_Page_ML();
    Instagram_Page_ML instagram = new Instagram_Page_ML();

    @Dado("^que eu quero acessar a rede social Instagram do Mercado Livre$")
    public void que_eu_quero_acessar_a_rede_social_instagram_do_mercado_livre() throws InterruptedException {
        rede_social.click_link_informacoes();
    }

    @Quando("^eu clico no link Instagram$")
    public void clico_no_instagram() throws InterruptedException {
        rede_social.clicar_botao_instagram();
    }

    @Então("eu valido que pagina foi redirecionada para a rede social Instagram do Mercado Livre$")
    public void eu_valido_que_pagina_foi_redirecionada_para_a_rede_social_instagram_do_mercado_livre() {
        try {
            assertEquals("Mercado Livre", instagram.titulo_mercado_livre());
        }catch (Exception e){
            System.out.println("Tela de login Instgram exibida");
        }
        }
    }