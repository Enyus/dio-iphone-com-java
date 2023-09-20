package models.iPhone.apps.telefone;

import java.util.ArrayList;
import java.util.List;

import models.iPhone.apps.AppModel;
import models.iPhone.apps.telefone.contato.Contato;

public class Telefone extends AppModel {
    List<Contato> listaDeContatos;

    public Telefone () {
        this.listaDeContatos = new ArrayList<Contato>();
        listaDeContatos.add(new Contato("André", 123456));
        listaDeContatos.add(new Contato("Bernardo", 123457));
        listaDeContatos.add(new Contato("Cézar", 123458));
        // System.out.println("Telefone online");
    }

    public void ligar(String nome) {
        for (Contato c: listaDeContatos) {
            if (c.getNome() == nome) {
                System.out.println("Ligando para " + c.getNome() + " no número " + c.getNumero());
                return;
            } 
        }
        System.out.println("Contato " + nome + " não encontrado em sua lista de contatos.");
    }

    public void atender(int numero) {
        for (Contato c:listaDeContatos) {
            if(c.getNumero() == numero) {
                System.out.println("Recebendo uma ligação de " + c.getNome());
                return;
            }
        }
        System.out.println("Recebendo uma ligação do número desconhecido " + numero);
    }

    public void iniciarCorreioDeVoz(int numero) {
        for (Contato c:listaDeContatos) {
            if(c.getNumero() == numero) {
                System.out.println("Acessando correio de voz de " + c.getNome());
                return;
            }
        }
        System.out.println("Acessando correio de voz de número desconhecido, " + numero);
    }
}
