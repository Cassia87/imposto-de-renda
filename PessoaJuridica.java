package com.loiane.impostoderenda;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(){
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "} " + super.toString();
    }

    @Override
    public double calculaImposto() {
        return this.getRendaBruta() * 0.1;
    }
}
