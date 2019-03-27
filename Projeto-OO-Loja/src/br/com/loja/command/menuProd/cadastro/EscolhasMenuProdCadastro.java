package br.com.loja.command.menuProd.cadastro;

public enum EscolhasMenuProdCadastro {
    A1 {
        public CommandMenuProdCadastro command() {
            return new CadastrarCdCommand();
        }
    }, A2 {
        public CommandMenuProdCadastro command() {
            return new CadastrarDvdCommand();
        }
    }, A3 {
        @Override
        public CommandMenuProdCadastro command() {
            return new CadastrarJogoCommand();
        }
    }, A4 {
        @Override
        public CommandMenuProdCadastro command() {
            return new CadastrarLivroCommand();
        }
    };


    public abstract CommandMenuProdCadastro command();
}
