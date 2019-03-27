package br.com.loja.clientes;

import javax.swing.text.EditorKit;

/** Classe: Endereco
*  Esta classe possui os atributos que serão manipulados em GerenciadorClientes.
* @author Igor
* @author Mateus
*/
public class Endereco {
    private String rua, bairro, cidade, estado, cep;
    private int numero;

    private Endereco(EnderecoBuilder builder) {
        this.rua = builder.rua;
        this.bairro = builder.bairro;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.cep = builder.cep;
        this.numero = builder.numero;
    }

    public static class EnderecoBuilder {

        private String rua, bairro, cidade, estado, cep;
        private int numero;

        public EnderecoBuilder(int numero) {
            this.numero = numero;
        }

        public EnderecoBuilder comRua(String rua) {
            this.rua = rua;
            return this;
        }

        public EnderecoBuilder comBairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder comCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public EnderecoBuilder comEstado(String estado) {
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder comCep(String cep) {
            this.cep = cep;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
