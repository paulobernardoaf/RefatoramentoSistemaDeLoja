package br.com.loja.command.menuProd.listagem;

import br.com.loja.visao.MenuProdutos;

public class ListarDvdCommand implements CommandMenuProdListagem {
    @Override
    public void execute(MenuProdutos menuProd) {
        String descPesquisa = "";
        menuProd.getgP().listarCD(descPesquisa);
    }
}
