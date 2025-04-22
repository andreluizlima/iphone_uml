import classes.IPhone;

public class Sistema {
    public static void main(String[] args) throws Exception {
        IPhone iphone2007 = new IPhone();

        iphone2007.ligarIPhone();

        //Navegador
        iphone2007.adicionarNovaAba();
        iphone2007.exibirPagina("www.google.com");
        iphone2007.atualizarPagina();

        //Musicas
        iphone2007.selecionarMusica("Skillet - Hero");
        iphone2007.tocar();
        iphone2007.pausar();

        //Telefone
        iphone2007.ligar("9999999999");
        iphone2007.atender();
        iphone2007.iniciarCorreioVoz();

        iphone2007.desligarIPhone();
    }


}
