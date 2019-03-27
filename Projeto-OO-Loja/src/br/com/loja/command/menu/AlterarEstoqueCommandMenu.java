package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class AlterarEstoqueCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        menu.getgP().alterarEstoque();
    }
}
