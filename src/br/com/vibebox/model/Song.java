package br.com.vibebox.model;

public class Song extends Audio {
    private String artista;
    private String genero;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
