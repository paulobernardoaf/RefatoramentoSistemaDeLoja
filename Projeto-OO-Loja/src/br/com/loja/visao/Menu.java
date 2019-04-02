package br.com.loja.visao;

import br.com.loja.Utilidades;
import br.com.loja.clientes.GerenciadorClientes;
import br.com.loja.command.menu.CommandMenu;
import br.com.loja.command.menu.EscolhasMenu;
import br.com.loja.produtos.GerenciadorProdutos;
import br.com.loja.vendas.GerenciadorVendas;
import java.util.Scanner;

/** Classe: Menu
*  Esta classe visa uma melhor organização da aplicação, pois organiza os
*  métodos de acordo com a opção que o usuário escolher...
* @author Igor
* @author Mateus
*/

public class Menu {
    //Scanner e instâncias
    GerenciadorProdutos gP = new GerenciadorProdutos();
    GerenciadorClientes gC = new GerenciadorClientes();
    GerenciadorVendas gV = new GerenciadorVendas();
    MenuProdutos mprod = new MenuProdutos();

    private static Menu uniqueMenu;

    private Menu() {}

    public static Menu getInstance() {
        if (uniqueMenu == null) {
            uniqueMenu = new Menu();
        }

        return uniqueMenu;
    }
    
    //atributos e controladores..
    private int opcaoMenu;
    
        public void Menu(){
                do{
                    System.out.println("\t\t## Gestao de Loja :: ##");
                    System.out.println("\n                ===============================");
                    System.out.println("                  |     1 - Cadastrar Produtos  |");
                    System.out.println("                  |     2 - Cadastrar Clientes  |");
                    System.out.println("                  |     3 - Cadastra Vendas     |");
                    System.out.println("                  |     4 - Alterar Estoque     |");
                    System.out.println("                  |     5 - Alterar dados       |");
                    System.out.println("                  |     6 - Lista produto       |");
                    System.out.println("                  |     7 - Lista clientes      |");
                    System.out.println("                  |     8 - Lista vendas        |");
                    System.out.println("                  |     0 - Sair                |");
                    System.out.println("                  ==============================\n");
                    System.out.print("Digite sua Opcao -> ");
                    opcaoMenu = Utilidades.lerInteiro();

                    if(opcaoMenu > 8 || opcaoMenu < 0) {
                        System.out.println("Voce digitou uma opcao incorreta!!");
                    } else {
                        String opc = "A" + opcaoMenu; // NECESSÁRIO CONCATENAR COM UMA LETRA PARA PODER UTILIZAR O ENUM
                        EscolhasMenu escolha = EscolhasMenu.valueOf(opc);
                        CommandMenu comando = escolha.command();
                        comando.execute(this);
                    }
                }while(opcaoMenu != 0);

    }

    public MenuProdutos getMprod() {
        return mprod;
    }

    public GerenciadorProdutos getgP() {
        return gP;
    }

    public GerenciadorClientes getgC() {
        return gC;
    }

    public GerenciadorVendas getgV() {
        return gV;
    }
}
