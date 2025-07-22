package com.loiane.impostoderenda;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica contribuinte1 = new PessoaFisica();
        contribuinte1.setNomeContribuinte("Cassia");
        contribuinte1.setRendaBruta(2300.99);
        contribuinte1.setCpf("020.146.561-26");
        contribuinte1.calculaImposto();
        System.out.println(contribuinte1.toString());
    }
}
