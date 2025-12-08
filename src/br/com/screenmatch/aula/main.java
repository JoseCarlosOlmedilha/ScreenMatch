package br.com.screenmatch.aula;

import br.com.screenmatch.aula.modelos.Filme;
import br.com.screenmatch.aula.modelos.Serie;

public class main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLançamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos");

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDasAvaliacoes());
        System.out.println(meuFilme.getMediaAvaliacoes());




        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLançamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos() + " minutos");
    }
}
