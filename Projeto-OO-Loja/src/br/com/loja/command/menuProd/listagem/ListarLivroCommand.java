package br.com.loja.command.menuProd.listagem;

import br.com.loja.visao.MenuProdutos;

public class ListarLivroCommand implements CommandMenuProdListagem {
    @Override
    public void execute(MenuProdutos menuProd) {
        String descPesquisa = "";
        menuProd.getgP().listarLivro(descPesquisa);
    }
}
