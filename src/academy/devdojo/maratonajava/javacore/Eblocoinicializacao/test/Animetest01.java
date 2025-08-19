package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime ();

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
