package testes;

import equipamento.celular.Iphone;
import equipamento.internet.NavegadorInternet;
import equipamento.musica.CaixaSom;
import equipamento.musica.ReprodutorMusical;

public class Aparelho {
    public static void main(String[] args) {
        ReprodutorMusical iphone1 = new Iphone();

        iphone1.tocar();
        iphone1.selecionarMusica();
        iphone1.pausar();

        NavegadorInternet iphone2 = new Iphone();

        iphone2.exibirPagina();
        iphone2.adicionarNovaAba();
        iphone2.atualizarPagina();
    

        ReprodutorMusical som = new CaixaSom();
        som.tocar();
        som.selecionarMusica();
        som.pausar();
       

    }
}