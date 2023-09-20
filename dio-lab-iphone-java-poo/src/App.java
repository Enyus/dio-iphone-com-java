import telefone.iPhone.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        iPhone iPhone = new iPhone();
        // iPhone.reprodutorMusical.mostrarListaDeMusicas();
        iPhone.reprodutorMusical.selecionarMusica("Garota de Ipanema");
        iPhone.reprodutorMusical.tocar();
        iPhone.reprodutorMusical.pausar();
    }
}
