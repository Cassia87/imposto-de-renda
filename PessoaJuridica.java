package com.loiane.impostoderenda;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public double calculaImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CNPJ: ").append(cnpj).append("\n");
        sb.append("Imposto a ser pago: ").append(calculaImposto()).append("\n");
        return super.toString() + sb.toString();
    }
}
