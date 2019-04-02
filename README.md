# RefatoramentoSistemaDeLoja

### Projeto original

https://github.com/iguit0/Gestao-Loja

##### Para rodar baixe o projeto na sua IDE, va em src/br/com/loja/visao e execute o arquivo Main.java.

### Projeto refatorado

https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja

##### Para rodar baixe o projeto na sua IDE, va em src/br/com/loja/visao e execute o arquivo Main.java.

### Padrões Utilizados

* Singleton
  * Aplicado em:
    1. [Menu](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/1b0674d6eaf43dcfbb3d802f17c3d9ae00b3232e/Projeto-OO-Loja/src/br/com/loja/visao/Menu.java#L29)
* Builder
  * Aplicado em:
    1. [Cliente](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/1b0674d6eaf43dcfbb3d802f17c3d9ae00b3232e/Projeto-OO-Loja/src/br/com/loja/clientes/Cliente.java#L22)
    2. [Endereco](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/1b0674d6eaf43dcfbb3d802f17c3d9ae00b3232e/Projeto-OO-Loja/src/br/com/loja/clientes/Endereco.java#L23)
    3. [Produtos](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/tree/master/Projeto-OO-Loja/src/br/com/loja/produtos)
* Command
  * Aplicado em:
    1. [Menu](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/tree/master/Projeto-OO-Loja/src/br/com/loja/command/menu)
    2. [MenuProdutos](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/tree/master/Projeto-OO-Loja/src/br/com/loja/command/menuProd)
    
### Classes e Métodos afetados:

* Classes:
  1. [Cliente](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/master/Projeto-OO-Loja/src/br/com/loja/clientes/Cliente.java)
     * [Builder](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/e95667f851306125b559083ce8f34ede387b7fb4/Projeto-OO-Loja/src/br/com/loja/clientes/Cliente.java#L14)
  2. [Endereco](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/master/Projeto-OO-Loja/src/br/com/loja/clientes/Endereco.java)
     * [Builder](https://github.com/paulobernardoaf/RefatoramentoSistemaDeLoja/blob/e95667f851306125b559083ce8f34ede387b7fb4/Projeto-OO-Loja/src/br/com/loja/clientes/Endereco.java#L23)
     
     INCOMPLETE README
  

