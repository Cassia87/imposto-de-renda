package com.loiane.impostoderenda;

public abstract class Contribuinte {
    private String nomeContribuinte;
    private double rendaBruta;

    public String getNomeContribuinte() {
        return nomeContribuinte;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nomeContribuinte).append("\n");
        sb.append("Renda: ").append(rendaBruta).append("\n");
        return sb.toString();
    }
    public abstract double calculaImposto();
}
