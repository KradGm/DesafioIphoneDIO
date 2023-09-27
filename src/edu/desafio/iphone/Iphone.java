package edu.desafio.iphone;

import edu.desafio.interfaces.AparelhoTelefonico;
import edu.desafio.interfaces.NavegadorInternet;
import edu.desafio.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }

    @Override
    public void ligar() {
        System.out.println("Você esta ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Musica");
    }
}
