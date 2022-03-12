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


    @RedeSocial
    Cenario: Acessar rede social do Mercado Livre
      Dado que eu quero acessar a rede social Instagram do Mercado Livre
      Quando eu clico no link Instagram
      Então eu valido que pagina foi redirecionada para a rede social Instagram do Mercado Livre

    @Categoria
    Cenario: Buscar Categoria Eletrodoméstico
      Dado que eu quero  clicar no menu categorias
      Quando eu clico no submenu Eletrodomésticos
      Então a informacao dos eletrodomésticos serão exibidas

