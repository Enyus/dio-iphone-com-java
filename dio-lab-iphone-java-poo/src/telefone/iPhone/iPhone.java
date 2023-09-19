package telefone.iPhone;

import telefone.iPhone.apps.reprodutorMusical.reprodutorMusical;

public class iPhone {
    public static boolean ligado = false;

    public iPhone() {
        System.out.println("Tirei meu iPhone do bolso.");
        reprodutorMusical reprodutorMusical = new reprodutorMusical();
    }

    public static void ligar() {
        ligado = true;
    }

    public static void desligar() {
        ligado = false;
    }

}
