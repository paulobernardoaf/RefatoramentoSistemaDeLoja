package br.com.loja.command.menuProd.listagem;

public enum EscolhasMenuProdListagem {

    A1 {
        public CommandMenuProdListagem command() {
            return new ListarCdCommand();
        }
    }, A2 {
        public CommandMenuProdListagem command() {
            return new ListarDvdCommand();
        }
    }, A3 {
        @Override
        public CommandMenuProdListagem command() {
            return new ListarJogoCommand();
        }
    }, A4 {
        @Override
        public CommandMenuProdListagem command() {
            return new ListarLivroCommand();
        }
    };


    public abstract CommandMenuProdListagem command();

}
