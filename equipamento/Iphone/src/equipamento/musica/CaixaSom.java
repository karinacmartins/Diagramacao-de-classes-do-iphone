package equipamento.musica;

public class CaixaSom implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música na Caixa de Som");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada na Caixa de Som");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova música na Caixa de Som");
    }

}
