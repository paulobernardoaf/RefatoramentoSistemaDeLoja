package br.com.loja.visao;

import br.com.loja.Utilidades;
import br.com.loja.command.menuProd.cadastro.CommandMenuProdCadastro;
import br.com.loja.command.menuProd.cadastro.EscolhasMenuProdCadastro;
import br.com.loja.command.menuProd.listagem.CommandMenuProdListagem;
import br.com.loja.command.menuProd.listagem.EscolhasMenuProdListagem;
import br.com.loja.produtos.GerenciadorProdutos;
import java.util.Scanner;

/** Classe: MenuProdutos
*  A função desta classe é semelhante a Menu, porém, com produtos..
*  Realiza a listagem e o cadastro de produtos...
* @author Igor
* @author Mateus
*/
public class MenuProdutos {
    //Scanner, instâncias, Arrays, Atributos , etc..
    private int opcao;
    
    GerenciadorProdutos gP = new GerenciadorProdutos();
      
    public void MenuProd(){
        do{
            System.out.println("\nEscolha um produto!!");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - Jogo");
            System.out.println("4 - Livro");
            System.out.println("0 - Voltar para Menu");
            System.out.print("Opcao -> ");
            opcao = Utilidades.lerInteiro();

            if(opcao > 4 || opcao < 0) {
                System.out.println("Voce digitou uma opcao incorreta!!");
            } else {
                String opc = "A" + opcao; // NECESSÁRIO CONCATENAR COM UMA LETRA PARA PODER UTILIZAR O ENUM
                EscolhasMenuProdCadastro escolha = EscolhasMenuProdCadastro.valueOf(opc);
                CommandMenuProdCadastro comando = escolha.command();
                comando.execute(this);
            }

        }while(opcao != 0);
    }
    
    public void ListaProd(){
        do{
            System.out.println("\nEscolha um produto para listar!!");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - Jogo");
            System.out.println("4 - Livro");
            System.out.println("0 - Voltar para Menu\n");
            System.out.print("Opcao -> ");
            opcao = Utilidades.lerInteiro();

            if(opcao > 4 || opcao < 0) {
                System.out.println("Voce digitou uma opcao incorreta!!");
            } else {
                String opc = "A" + opcao; // NECESSÁRIO CONCATENAR COM UMA LETRA PARA PODER UTILIZAR O ENUM
                EscolhasMenuProdListagem escolha = EscolhasMenuProdListagem.valueOf(opc);
                CommandMenuProdListagem comando = escolha.command();
                comando.execute(this);
            }
        }while(opcao != 0);
    }

    public GerenciadorProdutos getgP() {
        return gP;
    }
}
