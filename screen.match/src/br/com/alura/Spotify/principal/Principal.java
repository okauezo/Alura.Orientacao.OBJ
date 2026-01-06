package br.com.alura.Spotify.principal;

import br.com.alura.Spotify.MinhaPreferida;
import br.com.alura.Spotify.Musica;
import br.com.alura.Spotify.Podcast;

public class Principal {
   public static void main(String[] args) {

       Musica minhaMusica = new Musica();
       minhaMusica.setTitulo("can´t say");
       minhaMusica.setCantor("Travis Scott. ft Don Toliver");

       for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
       }

       for (int i = 0; i < 50; i++) {
           minhaMusica.curte();
       }

       Podcast meuPodcast = new Podcast();
       meuPodcast.setTitulo("PodPah");
       meuPodcast.setApresetador("Igao e Mitico");
       meuPodcast.setConvidado("mcKevin");

       for (int i = 0; i < 1000; i++) {
           meuPodcast.reproduz();
       }

       for (int i = 0; i < 2000; i++) {
           meuPodcast.curte();
       }

       MinhaPreferida preferida = new MinhaPreferida();
       preferida.incluir(meuPodcast);
       preferida.incluir(minhaMusica);
    }
}
