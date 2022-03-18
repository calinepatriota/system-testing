package system.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import system.pages_ml.Categorias_Page_ML;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class Mercado_Livre_Busca_Categorias_Steps {

    Categorias_Page_ML categorias= new Categorias_Page_ML();

    @Dado("^que eu quero  clicar no menu categorias$")
    public void que_eu_quero_clicar_no_menu_categorias() throws InterruptedException {
        categorias.clicar_botao_categoria();
    }

    @Quando("^eu clico no submenu Eletrodomésticos$")
    public void eu_clico_no_submenu_Eletrodomésticos() throws InterruptedException {
        categorias.clicar_botao_eletrodomesticos();
    }

    @Então("^a informacao dos eletrodomésticos serão exibidas$")
    public void a_informacao_dos_eletrodomésticos_serão_exibidas() throws InterruptedException {
        System.out.println("Busca por: "+ (categorias.produto_exibido()));
        assertEquals(categorias.produto_exibido(),"AS MELHORES OFERTAS");
    }
}