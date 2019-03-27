package br.com.loja.produtos;

public class JogoBuilder implements ProdutoBuilder{

    private Jogo jogo;

    public JogoBuilder(String genero, String produtora) {
        this.jogo = new Jogo(genero, produtora);
    }

    @Override
    public ProdutoBuilder comCodigo(int value) {
        this.jogo.setCodigo(value);
        return this;
    }

    @Override
    public ProdutoBuilder comEstoque(int value) {
        this.jogo.setEstoque(value);
        return this;
    }

    @Override
    public ProdutoBuilder comQnt(int value) {
        this.jogo.setQnt(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPreco(double value) {
        this.jogo.setPreco(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPrecoTotal(double value) {
        this.jogo.setPrecoTotal(value);
        return this;
    }

    @Override
    public ProdutoBuilder comDescricao(String value) {
        this.jogo.setDescricao(value);
        return this;
    }

    @Override
    public ProdutoBuilder comNome(String value) {
        this.jogo.setNome(value);
        return this;
    }

    @Override
    public Produto build() {
        return this.jogo;
    }


}
