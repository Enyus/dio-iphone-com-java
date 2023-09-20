package models.iPhone;

import models.iPhone.apps.browser.InternetBrowser;
import models.iPhone.apps.reprodutorMusical.ReprodutorMusical;
import models.iPhone.apps.telefone.Telefone;

public class iPhone {
    private boolean ligado = false;
    public ReprodutorMusical reprodutorMusical;
    public Telefone telefone;
    public InternetBrowser internetBrowser;

    public iPhone() {
        System.out.println("Tirei meu iPhone do bolso.");
        this.reprodutorMusical = new ReprodutorMusical();
        this.telefone = new Telefone();
        this.internetBrowser = new InternetBrowser();
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
