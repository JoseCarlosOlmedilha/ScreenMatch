package br.com.screenmatch.aula.modelos;

import br.com.screenmatch.aula.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getMediaAvaliacoes() / 2;
    }
}
