package com.testerh.testerh;

import com.testerh.testerh.Atendente;

public class Tributos {

    int ValorSalario = Atendente.getSalarioAtendente();
    public double fgts = CalculoFGTS();
    { // calcula o valor de fgts de acordo com o valor do salário.

        if (ValorSalario >= 1000) {
            fgts = 0.08;
        } else {
            fgts = 0.15;

        }

    }

    public int decimoTerSalario = ValorSalario / 12;
    public int ferias = ValorSalario / 12;
    public double inss = ValorSalario * 0.08;
    public double salarioLiquido = ValorSalario - fgts - ferias - inss - decimoTerSalario;
    public double fgtsFinal = ValorSalario * fgts;

    public Tributos() {
        this.fgts = fgts;
        this.decimoTerSalario = decimoTerSalario;
        this.ferias = ferias;
        this.inss = inss;
        this.salarioLiquido = salarioLiquido;
        this.fgtsFinal = fgtsFinal;

    }

    private double CalculoFGTS() {
        return 0;
    }

    public void setFgtsFinal(double fgtsFinal) {
        this.fgtsFinal = fgtsFinal;
    }

    public double getFgtsFinal() {
        return fgtsFinal;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }

    public int getDecimoTerSalario() {
        return decimoTerSalario;
    }

    public void setDecimoTerSalario(int decimoTerSalario) {
        this.decimoTerSalario = decimoTerSalario;
    }

    public int getFerias() {
        return ferias;
    }

    public void setFerias(int ferias) {
        this.ferias = ferias;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
