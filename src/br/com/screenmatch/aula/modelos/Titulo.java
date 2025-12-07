package br.com.screenmatch.aula.modelos;

public class Titulo {

    private String nome;
    private int anoDeLançamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;
    private int duracaoEmMinutos;

    public void exibirFichaTecnica(){
        System.out.println("-------------------Ficha Tecnica-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLançamento);

    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes ++;
    }

    public double getMediaAvaliacoes(){
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void setTotalDasAvaliacoes(int totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
