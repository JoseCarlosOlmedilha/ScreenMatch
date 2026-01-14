package br.com.screenmatch.aula.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException{

    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}
