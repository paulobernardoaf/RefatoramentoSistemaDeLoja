package br.com.loja.produtos;

public class DVDBuilder implements ProdutoBuilder {

    private DVD dvd;

    public DVDBuilder(String genero, String produtora) {
        this.dvd = new DVD(genero, produtora);
    }

    @Override
    public ProdutoBuilder comCodigo(int value) {
        this.dvd.setCodigo(value);
        return this;
    }

    @Override
    public ProdutoBuilder comEstoque(int value) {
        this.dvd.setEstoque(value);
        return this;
    }

    @Override
    public ProdutoBuilder comQnt(int value) {
        this.dvd.setQnt(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPreco(double value) {
        this.dvd.setPreco(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPrecoTotal(double value) {
        this.dvd.setPrecoTotal(value);
        return this;
    }

    @Override
    public ProdutoBuilder comDescricao(String value) {
        this.dvd.setDescricao(value);
        return this;
    }

    @Override
    public ProdutoBuilder comNome(String value) {
        this.dvd.setNome(value);
        return this;
    }

    @Override
    public Produto build() {
        return this.dvd;
    }

}
