package br.com.vibebox.model;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;
    private int numeroDeEpisodios;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
