package br.com.loja.clientes;

import java.util.ArrayList;

/** Classe: Cliente
*  Esta classe possui os atributos que serão manipulados em GerenciadorClientes.
* @author Igor
* @author Mateus
*/
public class Cliente {
    private int codigo;
    private String cpf, nome, email, senha;

    public Cliente(ClienteBuilder builder) {
        this.codigo = builder.codigo;
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.email = builder.email;
        this.senha = builder.senha;
    }

    public static class ClienteBuilder {

        private int codigo;
        private String cpf, nome, email, senha;

        public ClienteBuilder(int codigo) {
            this.codigo = codigo;
        }

        public ClienteBuilder comCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public ClienteBuilder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder comEmail(String email) {
            this.email = email;
            return this;
        }

        public ClienteBuilder comSenha(String senha) {
            this.senha = senha;
            return this;
        }


        public Cliente build() {
            return new Cliente(this);
        }


    }
    
    public String flag = "x";
    
    public ArrayList<Endereco> endereco = new ArrayList<Endereco>();

    public int getCodigo() {
        return codigo;
    }



    public String getCpf() {
        return cpf;
    }



    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }


}
