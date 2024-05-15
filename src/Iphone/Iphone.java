package Iphone;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorWeb {
    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para Fulano.");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Você possui X mensagens de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...Aguarde.");
    }
}
