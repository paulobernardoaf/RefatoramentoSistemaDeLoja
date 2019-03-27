package br.com.loja.produtos;

public class LivroBuilder implements ProdutoBuilder{

    private Livro livro;

    public LivroBuilder(String autor, String editora) {
        this.livro = new Livro(autor, editora);
    }

    @Override
    public ProdutoBuilder comCodigo(int value) {
        this.livro.setCodigo(value);
        return this;
    }

    @Override
    public ProdutoBuilder comEstoque(int value) {
        this.livro.setEstoque(value);
        return this;
    }

    @Override
    public ProdutoBuilder comQnt(int value) {
        this.livro.setQnt(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPreco(double value) {
        this.livro.setPreco(value);
        return this;
    }

    @Override
    public ProdutoBuilder comPrecoTotal(double value) {
        this.livro.setPrecoTotal(value);
        return this;
    }

    @Override
    public ProdutoBuilder comDescricao(String value) {
        this.livro.setDescricao(value);
        return this;
    }

    @Override
    public ProdutoBuilder comNome(String value) {
        this.livro.setNome(value);
        return this;
    }

    @Override
    public Produto build() {
        return this.livro;
    }


}
