package IPhone;

import interfaces.IReprodutorMusical;
import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;

public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    private String musicaAtual;
    private String paginaAtual;

    @Override
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada.");
        } else {
            System.out.println("Reproduzindo música: " + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música está sendo reproduzida.");
        } else {
            System.out.println("Música pausada: " + musicaAtual);
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null || musica.isEmpty()) {
            System.out.println("Nome da música inválido.");
        } else {
            musicaAtual = musica;
            System.out.println("Selecionando a música: " + musica);
        }
    }

    @Override
    public void ligar(String numero) {
        if (numero == null || numero.isEmpty()) {
            System.out.println("Número de telefone inválido.");
        } else {
            System.out.println("Ligando para: " + numero);
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isEmpty()) {
            System.out.println("URL inválida.");
        } else {
            paginaAtual = url;
            System.out.println("Exibindo a página: " + url);
        }
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual == null) {
            System.out.println("Nenhuma página está sendo exibida.");
        } else {
            System.out.println("Atualizando a página: " + paginaAtual);
        }
    }
}