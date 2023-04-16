package br.com.alura.audiomatch.control;

public class Audio implements  AudioMethods{
    private String titulo;
    private double duracao;
    private int totalReproducaoes;
    private int curtidas;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = totalReproducaoes / 5;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducaoes() {
        return totalReproducaoes;
    }

    public void setTotalReproducaoes(int totalReproducaoes) {
        this.totalReproducaoes = totalReproducaoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    protected void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }


    @Override
    public void curtir() {
       this.curtidas++;
    }


    @Override
    public void reproduzir() {
        this.totalReproducaoes++;
    }

}
