import IPhone.IPhone;

public class App {
    public static void main(String[] args)  {

        IPhone meuIPhone = new IPhone();

        // Testando as funcionalidades do Reprodutor Musical
        System.out.println("### Teste do Reprodutor Musical ###");
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando as funcionalidades do Aparelho Telefônico
        System.out.println("\n### Teste do Aparelho Telefônico ###");
        meuIPhone.ligar("123-4567");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando as funcionalidades do Navegador na Internet
        System.out.println("\n### Teste do Navegador na Internet ###");
        meuIPhone.exibirPagina("www.teste.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

    }
}
