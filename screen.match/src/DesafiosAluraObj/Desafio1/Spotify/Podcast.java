package DesafiosAluraObj.Desafio1.Spotify;

public class Podcast extends Audio{

    private String apresetador;
    private String convidado;
    private String descricao;

    public String getApresetador() {
        return apresetador;
    }

    public void setApresetador(String apresetador) {
        this.apresetador = apresetador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public double getClassificacao() {
        if (this.getCurtidas() > 500 ){
            return 10;
        } else {
            return 8;
        }
    }
}
