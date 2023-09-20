package models.iPhone.apps.browser;

import java.util.ArrayList;
import java.util.List;

import models.iPhone.apps.AppModel;
import models.iPhone.apps.browser.aba.Aba;

public class InternetBrowser extends AppModel {
    List<Aba> abasAbertas;

    public InternetBrowser() {
        this.abasAbertas = new ArrayList<Aba>();
        abasAbertas.add(new Aba(0, "google.com"));
        abasAbertas.add(new Aba(1, "gmail.com"));
    }

    public void exibirPagina(int id) {
        for(Aba aba:abasAbertas){
            if(aba.getId() == id){
                System.out.println("Exibindo aba com o site " + aba.getUrl());
                return;
            }
        }
        System.out.println( id + "ª aba não está aberta.");
    }

    public void atualizarPagina(int id) {
        for(Aba aba:abasAbertas){
            if(aba.getId() == id){
                System.out.println("Atualizando a página da url " + aba.getUrl());
                return;
            }
        }
        System.out.println( id + "ª aba não está aberta.");
    }

    public void abrirOutraAba(String url) {
        abasAbertas.add(new Aba(abasAbertas.size(), url));
        System.out.println("Nova aba aberta com a página do site " + url);
    }
}
