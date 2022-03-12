package system.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import system.pages_ml.Busca_Page_ML;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class Mercado_Livre_Busca_Produto_Steps {

    Busca_Page_ML mercado_livre_page= new Busca_Page_ML();


    @Dado("^que eu quero pesquisar pelo produto ([^\"]*)$")
    public void eu_quero_pesquisar_pelo_produto(String produto) throws InterruptedException {
        mercado_livre_page.busca_produto(produto);
    }

    @Quando("^pesquisar pelo produto ([^\"]*)$")
    public void pesquisar_pelo_produto(String produto) {
        mercado_livre_page.clicar_lupa_pesquisa();
    }

    @Então("informacao do produto sera exibida$")
    public void informacao_do_produto_sera_exibida() {
        System.out.println("Poduto: "+ (mercado_livre_page.texto_produto()));
        assertNotNull(mercado_livre_page.texto_produto());
    }
}