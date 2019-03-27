package br.com.loja.produtos;

import br.com.loja.Utilidades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/** Classe: GerenciadorProdutos
*  Esta classe possui toda a lógica de cadastro de produtos, ainda
*  possui o método de listagem dos mesmos...
* @author Igor
* @author Mateus
*/
public class GerenciadorProdutos {
    //Scanner, instâncias, Arrays, Atributos , etc..
    private boolean verificador;
    private boolean controlador;
    Scanner input = new Scanner(System.in);
    
    public ArrayList<CD> listaCD = new ArrayList<CD>();
    public ArrayList<DVD> listaDVD = new ArrayList<DVD>();
    public ArrayList<Jogo> listaJogo = new ArrayList<Jogo>();
    public ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    
    public boolean cadastrarCD() {  

        this.verificador = true;
        
        do {
            try {
                int qnt = 0;
                double precoTotal = 0;
                System.out.print("\nCadastrar CD\n");
                System.out.print("\n- Codigo do CD: ");
                int codigo = Utilidades.lerInteiro();
                System.out.print("- Descricao do CD: ");
                String descricao = input.nextLine();
                System.out.print("- Estoque do CD: ");
                int estoque = Utilidades.lerInteiro();
                System.out.print("- Preco do CD: ");
                double preco = Utilidades.lerDouble();
                System.out.print("- Nome do CD: ");
                String nome = input.nextLine();
                System.out.print("- Cantor do CD: ");
                String cantorCD = input.nextLine();
                System.out.print("- Gravadora do CD: ");
                String gravadoraCD = input.nextLine();
                this.verificador = false;

                CD cd = (CD) new CDBuilder(cantorCD, gravadoraCD)
                            .comCodigo(codigo)
                            .comDescricao(descricao)
                            .comEstoque(estoque)
                            .comNome(nome)
                            .comPreco(preco)
                            .comPrecoTotal(precoTotal)
                            .comQnt(qnt)
                            .build();

                listaCD.add(cd);
                System.out.print("\nCD cadastrado com sucesso!\n");

                return true;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | ClassCastException e2) {
                System.err.print("\nErro: " + e2);
            }
        }while(isVerificador());

        return true;
    }
    
    public boolean cadastrarDVD() {

        this.verificador = true;
        
        do {
            try {
                int qnt = 0;
                double precoTotal = 0;
                System.out.print("\nCadastrar DVD\n");
                System.out.print("\n- Codigo do DVD: ");
                int codigo = Utilidades.lerInteiro();
                System.out.print("- Descricao do DVD: ");
                String descricao = input.nextLine();
                System.out.print("- Estoque do DVD: ");
                int estoque = Utilidades.lerInteiro();
                System.out.print("- Preco do DVD: ");
                double preco = Utilidades.lerDouble();
                System.out.print("- Nome do DVD: ");
                String nome = input.nextLine();
                System.out.print("- Genero do DVD: ");
                String generoDVD = input.nextLine();

                System.out.print("- Produtora do DVD: ");
                String produtoraDVD = input.nextLine();

                DVD dvd = (DVD) new DVDBuilder(generoDVD, produtoraDVD)
                                    .comCodigo(codigo)
                                    .comDescricao(descricao)
                                    .comEstoque(estoque)
                                    .comNome(nome)
                                    .comPreco(preco)
                                    .comPrecoTotal(precoTotal)
                                    .comQnt(qnt)
                                    .build();

                listaDVD.add(dvd);
                System.out.print("\nDVD cadastrado com sucesso!\n");

                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException e2) {
                System.err.print("\nErro: " + e2);
            }catch(ArithmeticException | NullPointerException | ClassCastException e3) {
                System.err.print("\nErro: " + e3);
            }
        }while(isVerificador());
        
        return true;
    }
    
    public boolean cadastrarJogo() {

        this.verificador = true;
        
        do {
            try {
                int qnt = 0;
                double precoTotal = 0;
                System.out.print("\nCadastrar Jogo\n");
                System.out.print("\n- Codigo do Jogo: ");
                int codigo = Utilidades.lerInteiro();
                System.out.print("- Descricao do Jogo: ");
                String descricao = input.nextLine();
                System.out.print("- Estoque do Jogo: ");
                int estoque = Utilidades.lerInteiro();
                System.out.print("- Preco do Jogo: ");
                double preco = Utilidades.lerDouble();
                System.out.print("- Nome do Jogo: ");
                String nome = input.nextLine();
                System.out.print("- Genero do Jogo: ");
                String generoJogo = input.nextLine();
                System.out.print("- Produtora do Jogo: ");
                String produtoraJogo = input.nextLine();
                this.verificador = false;

                Jogo jogo = (Jogo) new JogoBuilder(generoJogo, produtoraJogo)
                        .comCodigo(codigo)
                        .comDescricao(descricao)
                        .comEstoque(estoque)
                        .comNome(nome)
                        .comPreco(preco)
                        .comPrecoTotal(precoTotal)
                        .comQnt(qnt)
                        .build();

                listaJogo.add(jogo);
                System.out.print("\nJogo cadastrado com sucesso!\n");

            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | ClassCastException e2) {
                System.err.print("\nErro: " + e2);
            }
        }while(isVerificador());

        return true;
    }
    
    public boolean cadastrarLivro() {

        this.verificador = true;
        
        do {
            try {
                int qnt = 0;
                double precoTotal = 0;
                System.out.print("\nCadastrar Livro\n");
                System.out.print("\n- Codigo do Livro: ");
                int codigo = Utilidades.lerInteiro();
                System.out.print("- Descricao do Livro: ");
                String descricao = input.nextLine();
                System.out.print("- Estoque do Livro: ");
                int estoque = Utilidades.lerInteiro();
                System.out.print("- Preco do Livro: ");
                double preco = Utilidades.lerDouble();
                System.out.print("- Nome do Livro: ");
                String nome = input.nextLine();
                System.out.print("- Autor do Livro: ");
                String autorLivro = input.nextLine();
                System.out.print("- Editora do Livro: ");
                String editoraLivro = input.nextLine();

                Livro livro = (Livro) new LivroBuilder(autorLivro, editoraLivro)
                        .comCodigo(codigo)
                        .comDescricao(descricao)
                        .comEstoque(estoque)
                        .comNome(nome)
                        .comPreco(preco)
                        .comPrecoTotal(precoTotal)
                        .comQnt(qnt)
                        .build();

                listaLivro.add(livro);
                System.out.print("\nLivro cadastrado com sucesso!\n");

                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | ClassCastException e2) {
                System.err.print("\nErro: " + e2);
            }
        }while(isVerificador());

        
        return true;
    }
    
    public void listarCD(String descPesquisa) {
        if(listaCD.isEmpty()) {
            System.out.print("\nNenhum CD cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de CD's\n");
        
        int nRegs = listaCD.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaCD.get(j).getDescricao().startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do CD: " + listaCD.get(j).getCodigo());
                System.out.print("\n-> Descricao do CD: " + listaCD.get(j).getDescricao());
                System.out.print("\n-> Estoque do CD: " + listaCD.get(j).getEstoque());
                System.out.print("\n-> Preco do CD: " + listaCD.get(j).getPreco());
                System.out.print("\n-> Nome do CD: " + listaCD.get(j).getNome());
                System.out.print("\n-> Cantor do CD: " + listaCD.get(j).getCantor());
                System.out.print("\n-> Gravadora do CD: " + listaCD.get(j).getGravadora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarDVD(String descPesquisa) {
        if(listaDVD.isEmpty()) {
            System.out.print("\nNenhum DVD cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de DVD's\n");
        
        int nRegs = listaDVD.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaDVD.get(j).getDescricao().startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do DVD: " + listaDVD.get(j).getCodigo());
                System.out.print("\n-> Descricao do DVD: " + listaDVD.get(j).getDescricao());
                System.out.print("\n-> Estoque do DVD: " + listaDVD.get(j).getEstoque());
                System.out.print("\n-> Preco do DVD: " + listaDVD.get(j).getPreco());
                System.out.print("\n-> Nome do DVD: " + listaDVD.get(j).getNome());
                System.out.print("\n-> Genero do DVD: " + listaDVD.get(j).getGenero());
                System.out.print("\n-> Produtora do DVD: " + listaDVD.get(j).getProdutora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarJogo(String descPesquisa) {
        if(listaJogo.isEmpty()) {
            System.out.print("\nNenhum Jogo cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de Jogos\n");
        
        int nRegs = listaJogo.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaJogo.get(j).getDescricao().startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do Jogo: " + listaJogo.get(j).getCodigo());
                System.out.print("\n-> Descricao do Jogo: " + listaJogo.get(j).getDescricao());
                System.out.print("\n-> Estoque do Jogo: " + listaJogo.get(j).getEstoque());
                System.out.print("\n-> Preco do Jogo: " + listaJogo.get(j).getPreco());
                System.out.print("\n-> Nome do Jogo: " + listaJogo.get(j).getNome());
                System.out.print("\n-> Genero do Jogo: " + listaJogo.get(j).getGenero());
                System.out.print("\n-> Produtora do Jogo: " + listaJogo.get(j).getProdutora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarLivro(String descPesquisa) {
        if(listaLivro.isEmpty()) {
            System.out.print("\nNenhum Livro cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de Livros\n");
        
        int nRegs = listaLivro.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaLivro.get(j).getDescricao().startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do Livro: " + listaLivro.get(j).getCodigo());
                System.out.print("\n-> Descricao do Livro: " + listaLivro.get(j).getDescricao());
                System.out.print("\n-> Estoque do Livro: " + listaLivro.get(j).getEstoque());
                System.out.print("\n-> Preco do Livro: " + listaLivro.get(j).getPreco());
                System.out.print("\n-> Nome do Livro: " + listaLivro.get(j).getNome());
                System.out.print("\n-> Autor do Livro: " + listaLivro.get(j).getAutor());
                System.out.print("\n-> Editora do Livro: " + listaLivro.get(j).getEditora());
                System.out.print("\n");
            }
        }
    }
    
    public void alterarEstoque() {       
        int novoCod;
        
        String descPesquisa;
        descPesquisa = "";
        
        listarCD(descPesquisa);
        listarDVD(descPesquisa);
        listarJogo(descPesquisa);
        listarLivro(descPesquisa);
        
        System.out.print("\nProduto para alterar o estoque: ");
        int produto = input.nextInt();
        
        System.out.print("\nCodigo do produto para alterar: ");
        int codProduto = input.nextInt();
        
        switch(produto) {
            case 0:
                break;
            case 1:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaCD.size(); i++) {
                    if(listaCD.get(i).getCodigo() == codProduto) {
                        listaCD.get(i).setCodigo(novoCod);
                    }
                }
                
                break;
            
            case 2:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaDVD.size(); i++) {
                    if(listaDVD.get(i).getCodigo() == codProduto) {
                        listaDVD.get(i).setCodigo(novoCod);
                    }
                }
                
                break;
                
            case 3:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaJogo.size(); i++) {
                    if(listaJogo.get(i).getCodigo() == codProduto) {
                        listaJogo.get(i).setCodigo(novoCod);
                    }
                }
                
                break;
            
            case 4:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaLivro.size(); i++) {
                    if(listaLivro.get(i).getCodigo() == codProduto) {
                        listaLivro.get(i).setCodigo(novoCod);
                    }
                }
                
                break;
                
            default:
                System.out.print("\nOpcao invalida!\n");
                break;
        }
        
    }

    
    public boolean isVerificador() {
        return verificador;
    }
    
    public void setVerificador(boolean verificador) {
        this.verificador = verificador;
    }
    
}
