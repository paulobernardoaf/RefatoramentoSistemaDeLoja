package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class AlterarDadosClienteCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        menu.getgC().alterarDadosCliente();
    }
}
