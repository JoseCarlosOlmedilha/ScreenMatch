package br.com.screenmatch.aula.modelos;

import br.com.screenmatch.aula.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int id;
    private String nome;
    private Serie serie;
    private int  totalVisualizacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if( totalVisualizacoes > 100){
            return 4;
        } else{
            return 2;
        }
    }






}
