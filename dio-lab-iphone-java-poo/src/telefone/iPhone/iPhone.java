package telefone.iPhone;

import telefone.iPhone.apps.reprodutorMusical.reprodutorMusical;

public class iPhone {
    private boolean ligado = false;
    public reprodutorMusical reprodutorMusical;

    public iPhone() {
        System.out.println("Tirei meu iPhone do bolso.");
        this.reprodutorMusical = new reprodutorMusical();
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean getLigado(){
        return this.ligado;
    }

}
