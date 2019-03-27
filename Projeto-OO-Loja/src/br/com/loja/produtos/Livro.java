package br.com.loja.produtos;
/** Classe: Livro
*  Esta classe possui os atributos que serão manipulados em GerenciadorProdutos.
* @author Igor
* @author Mateus
*/
public class Livro extends Produto {
    private String autor, editora;

    public Livro(String autor, String editora) {
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
