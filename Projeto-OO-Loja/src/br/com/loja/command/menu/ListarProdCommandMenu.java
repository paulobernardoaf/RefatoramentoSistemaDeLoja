package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class ListarProdCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        menu.getMprod().ListaProd();
    }
}
