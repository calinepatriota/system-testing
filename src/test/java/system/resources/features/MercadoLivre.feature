#language: pt
  @ML
  Funcionalidade: Mercado Livre

    @BuscaCEP
  Cenario: Pesquisa por CEP
    Dado que eu estou na pagina principal do Mercado Livre
    Quando eu preencho o CEP 51020290
    Então eu valido que o CEP 51020290 é exibido da pagina principal

    @BuscaProduto
    Cenario: Buscar Produto no site do mercado livre
      Dado que eu quero pesquisar pelo produto Video game
      Quando pesquisar pelo produto Video game
      Então informacao do produto sera exibida

