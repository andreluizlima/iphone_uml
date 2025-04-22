package classes;
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    public void ligarIPhone(){
        System.out.println("iPhone ligando...\niPhone ligado!");
    }

    public void desligarIPhone(){
        System.out.println("iPhone desligando...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: "+musica);
    }
}
