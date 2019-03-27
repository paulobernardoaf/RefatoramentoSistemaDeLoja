package br.com.loja.command.menuProd.cadastro;

import br.com.loja.visao.MenuProdutos;

public class CadastrarLivroCommand implements CommandMenuProdCadastro {
    @Override
    public void execute(MenuProdutos menuProd) {
        menuProd.getgP().cadastrarLivro();
    }
}
