package br.com.loja.command.menu;

import br.com.loja.visao.Menu;

public class CadastrarVendaCommandMenu implements CommandMenu {
    @Override
    public void execute(Menu menu) {
        try {
            menu.getgV().cadastrarVenda();
        } catch (InterruptedException e) {
            System.out.println("Erro: " + e);
        }
    }
}
