package principal;

import br.com.screenmatch.aula.calculos.CalculadoraDeTempo;
import br.com.screenmatch.aula.calculos.FiltroRecomendacao;
import br.com.screenmatch.aula.modelos.Episodio;
import br.com.screenmatch.aula.modelos.Filme;
import br.com.screenmatch.aula.modelos.Serie;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix",1999);
        //favorito.setNome("The Matrix");
        //favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick",2014);
        //outro.setNome("John Wick");
        //outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2017);
        //serie.setNome("La Casa de Papel");
        //serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setId(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtroRecomendacao.filtra(episodio);
        
        ArrayList filmes = new ArrayList();
        filmes.add(favorito);
        filmes.add(outro);

        System.out.println("Filmes: " + filmes);



    }
}
