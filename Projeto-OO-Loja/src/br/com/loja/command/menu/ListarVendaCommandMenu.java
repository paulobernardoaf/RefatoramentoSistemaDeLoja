package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class ListarVendaCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        String descPesquisa = "";
        menu.getgV().listarVenda(descPesquisa);
    }
}
