package equipamento.internet;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina do navegador Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Chrome");
    }

}