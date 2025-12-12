package br.com.screenmatch.aula.calculos;

import br.com.screenmatch.aula.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}
