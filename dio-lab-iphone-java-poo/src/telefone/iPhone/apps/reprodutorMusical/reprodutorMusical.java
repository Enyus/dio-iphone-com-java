package telefone.iPhone.apps.reprodutorMusical;

import java.util.ArrayList;
import java.util.List;

import telefone.iPhone.apps.AppModel;
import telefone.iPhone.apps.reprodutorMusical.musica.Musica;

public class reprodutorMusical extends AppModel {
    private List<Musica> listaDeMusicas = new ArrayList<Musica>();

    public reprodutorMusical() {
        listaDeMusicas.add(new Musica("Toque do Telefone"));
        listaDeMusicas.add(new Musica("Garota de Ipanema"));
        listaDeMusicas.add(new Musica("Highway to Hell"));
        listaDeMusicas.add(new Musica("Nightfall"));
    }

    public List<Musica> getListaDeMusicas() {
        return listaDeMusicas;
    }

    public void mostrarListaDeMusicas() {
        if(listaDeMusicas.size() > 0) {
            for(Musica m: listaDeMusicas) {
                System.out.println(m);
            }
        } else {
            System.out.println("Não há músicas na sua lista...");
        }
    }
}