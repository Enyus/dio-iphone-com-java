import models.iPhone.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        iPhone iPhone = new iPhone();
        System.out.println();

        System.out.println("Testando a Classe ReprodutorMusical:");
        iPhone.reprodutorMusical.selecionarMusica("Garota de Ipanema");
        iPhone.reprodutorMusical.tocar();
        iPhone.reprodutorMusical.pausar();
        System.out.println();

        System.out.println("Testando a Classe Telefone:");
        iPhone.telefone.ligar("André");
        iPhone.telefone.ligar("Ricardo");
        iPhone.telefone.atender(123457);
        iPhone.telefone.atender(123654);
        iPhone.telefone.iniciarCorreioDeVoz(123456);
        iPhone.telefone.iniciarCorreioDeVoz(123654);
        System.out.println();

        System.out.println("Testando a Classe InternetBrowser:");
        iPhone.internetBrowser.exibirPagina(0);
        iPhone.internetBrowser.atualizarPagina(1);
        iPhone.internetBrowser.abrirOutraAba("youtube.com");
    }
}
