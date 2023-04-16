package br.com.alura.audiomatch.models;

import br.com.alura.audiomatch.control.Audio;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String gerero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGerero() {
        return gerero;
    }

    public void setGerero(String gerero) {
        this.gerero = gerero;
    }
}
