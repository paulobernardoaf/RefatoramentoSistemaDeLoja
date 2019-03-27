package br.com.loja.command.menu;

public enum EscolhasMenu {
    A1 {
        public CommandMenu command() {
            return new MenuProdCommandMenu();
        }
    }, A2 {
      public CommandMenu command() {
            return new CadastrarClienteCommandMenu();
      }
    }, A3 {
        @Override
        public CommandMenu command() {
            return new CadastrarVendaCommandMenu();
        }
    }, A4 {
        @Override
        public CommandMenu command() {
            return new AlterarEstoqueCommandMenu();
        }
    }, A5 {
        @Override
        public CommandMenu command() {
            return new AlterarDadosClienteCommandMenu();
        }
    }, A6 {
        @Override
        public CommandMenu command() {
            return new ListarProdCommandMenu();
        }
    }, A7 {
        @Override
        public CommandMenu command() {
            return new ListarClientesCommandMenu();
        }
    }, A8 {
        @Override
        public CommandMenu command() {
            return new ListarVendaCommandMenu();
        }
    };


    public abstract CommandMenu command();
}
