package br.com.loja.produtos;

public interface ProdutoBuilder {

    ProdutoBuilder comCodigo(int value);
    ProdutoBuilder comEstoque(int value);
    ProdutoBuilder comQnt(int value);
    ProdutoBuilder comPreco(double value);
    ProdutoBuilder comPrecoTotal(double value);
    ProdutoBuilder comDescricao(String value);
    ProdutoBuilder comNome(String value);

    Produto build();

}
