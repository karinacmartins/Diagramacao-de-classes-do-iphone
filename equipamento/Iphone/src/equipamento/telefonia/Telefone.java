package equipamento.telefonia;

public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação no telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no telefone");
    }

    @Override
    public void iniciarCcorreioDeVoz() {
        System.out.println("Iniciando correio de voz no telefone");
    }

}
