package br.com.loja.produtos;
/** Classe: DVD
*  Esta classe possui os atributos que serão manipulados em GerenciadorProdutos.
* @author Igor
* @author Mateus
*/
public class DVD extends Produto {
    private String genero, produtora;

    public DVD(String genero, String produtora) {
        this.genero = genero;
        this.produtora = produtora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    
}
