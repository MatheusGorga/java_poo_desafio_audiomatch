package br.com.alura.audiomatch.models;

import br.com.alura.audiomatch.control.Audio;
import br.com.alura.audiomatch.control.AudioMethods;

public class Podcast extends Audio  {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
