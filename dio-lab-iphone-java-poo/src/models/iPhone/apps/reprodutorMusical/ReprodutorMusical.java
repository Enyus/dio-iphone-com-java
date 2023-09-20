package models.iPhone.apps.reprodutorMusical;

import java.util.ArrayList;
import java.util.List;

import models.iPhone.apps.AppModel;
import models.iPhone.apps.reprodutorMusical.musica.Musica;

public class ReprodutorMusical extends AppModel {
    private List<Musica> listaDeMusicas = new ArrayList<Musica>();
    private String musicaTocando = "";

    public ReprodutorMusical() {
        listaDeMusicas.add(new Musica("Toque do Telefone"));
        listaDeMusicas.add(new Musica("Garota de Ipanema"));
        listaDeMusicas.add(new Musica("Highway to Hell"));
        listaDeMusicas.add(new Musica("Nightfall"));
        // System.out.println("Reprodutor Musical Online.");
    }

    public List<Musica> getListaDeMusicas() {
        return listaDeMusicas;
    }

    public void mostrarListaDeMusicas() {
        if(listaDeMusicas.size() > 0) {
            for(Musica m: listaDeMusicas) {
                System.out.println(m.getMusica());
            }
        } else {
            System.out.println("Não há músicas na sua lista...");
        }
    }

    public void selecionarMusica(String musica) {
        String musicaProcurada = "";
        for (Musica m: listaDeMusicas) {
            if( m.getMusica() == musica) {
                musicaProcurada = m.getMusica();
            }
        }
        if(musicaProcurada != "") {
            this.musicaTocando = musicaProcurada;
            System.out.println("Música selecionada: '" + musicaTocando + "'");
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    public void tocar() {
        if(musicaTocando != "") {
            System.out.println("Tocando: '" + musicaTocando + "'");
        } else {
            System.out.println("Selecione uma música.");
        }
    }

    public void pausar() {
        if(musicaTocando != "") {
            System.out.println("Pausado: '" + musicaTocando + "'");
        }
    }
}
