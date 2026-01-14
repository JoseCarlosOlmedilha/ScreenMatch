package principal;

import br.com.screenmatch.aula.modelos.Filme;
import br.com.screenmatch.aula.modelos.Serie;
import br.com.screenmatch.aula.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class mainComLista {
    public static void main(String[] args) {

        Filme filme = new Filme("O fim do Mundo", 2012);
        filme.avalia(10);

        Filme filme2 = new Filme("Pele", 1980);
        filme2.avalia(7);

        Filme filme3 = new Filme("Ultimo soldado", 2008);
        filme3.avalia(3);

        Filme filme4 = new Filme("O livro de heli", 2002);
        filme4.avalia(8);

        Serie serie = new Serie("Ponto cego", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(filme4);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme0 && filme0.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme0.getClassificacao());
            }

        }

        System.out.println("---------------------------------------------------------");
        Collections.sort(lista);
        System.out.println(lista);


    }

}
