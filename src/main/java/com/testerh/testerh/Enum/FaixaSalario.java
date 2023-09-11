package com.testerh.testerh.Enum;

public enum FaixaSalario {
    FAIXA1(1000), FAIXA2(2000), FAIXA3(3000);

    int valor;

    FaixaSalario(int valor) {
        this.valor = valor;
    }

    int getValor() {
        return valor;
    }
}
