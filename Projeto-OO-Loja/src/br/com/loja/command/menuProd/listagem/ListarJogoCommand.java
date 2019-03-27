package br.com.loja.command.menuProd.listagem;

import br.com.loja.visao.MenuProdutos;

public class ListarJogoCommand implements CommandMenuProdListagem {
    @Override
    public void execute(MenuProdutos menuProd) {
        String descPesquisa = "";
        menuProd.getgP().listarJogo(descPesquisa);
    }
}
