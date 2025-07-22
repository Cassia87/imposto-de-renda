package com.loiane.impostoderenda;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Imposto a ser pago: ").append(calculaImposto()).append("\n");
        return super.toString() + sb.toString();
    }

    @Override
    public double calculaImposto() {
        double renda = this.getRendaBruta();
        if(renda <= 1400){
            return 0;
        }else if(renda > 1400 && renda <=2100){
            return Math.round((renda * 0.1) - 100);
        }else if(renda > 2100 && renda <=2800){
            return Math.round((renda * 0.15) -270);
        }else if(renda > 2800 && renda <= 3600){
            return Math.round((renda * 0.25) - 500);
        }else{
            return Math.round((renda * 0.3) - 700);
        }
    }
}
