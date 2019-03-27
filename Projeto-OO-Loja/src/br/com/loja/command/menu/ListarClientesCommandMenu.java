package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class ListarClientesCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        String descPesquisa = "";
        menu.getgC().listarClientes(descPesquisa);
    }
}
