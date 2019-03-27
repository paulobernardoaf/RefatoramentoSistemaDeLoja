package br.com.loja.produtos;

public class CDBuilder implements ProdutoBuilder {

    private CD cd;

    public CDBuilder(String cantor, String gravadora) {
        this.cd = new CD(cantor, gravadora);
    }

    @Override
    public ProdutoBuilder comCodigo(int value) {
       this.cd.setCodigo(value);
       return this;
    }

    @Override
    public ProdutoBuilder comEstoque(int value) {
        this.cd.setEstoque(value);
        return this;
    }

    @Override
    public ProdutoBuilder comQnt(int value) {
        this.cd.setQnt(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPreco(double value) {
        this.cd.setPreco(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPrecoTotal(double value) {
        this.cd.setPrecoTotal(value);
        return this;
    }

    @Override
    public ProdutoBuilder comDescricao(String value) {
        this.cd.setDescricao(value);
        return this;
    }

    @Override
    public ProdutoBuilder comNome(String value) {
        this.cd.setNome(value);
        return this;
    }

    @Override
    public Produto build() {
        return this.cd;
    }

}
