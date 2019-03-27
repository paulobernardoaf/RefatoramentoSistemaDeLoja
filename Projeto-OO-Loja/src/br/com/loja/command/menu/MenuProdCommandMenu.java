package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class MenuProdCommandMenu implements CommandMenu {

    public void execute(Menu menu) {
        menu.getMprod().MenuProd();
    }

}
