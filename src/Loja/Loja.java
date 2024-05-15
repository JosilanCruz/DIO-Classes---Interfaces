package Loja;

import Iphone.Iphone;

public class Loja {
    public static void main(String[] args) {
        Iphone ip1 = new Iphone();

        ip1.tocar();
        ip1.pausar();
        ip1.selecionarMusica();

        ip1.ligar();
        ip1.atender();
        ip1.iniciarCorreioDeVoz();

        ip1.exibirPagina();
        ip1.adicionarNovaAba();
        ip1.atualizarPagina();
    }
}
