package com.testerh.testerh;

import com.testerh.testerh.Atendente;

public class Tributos {
    // recebe valor salario atendente e calcula os impostos

    public double fgts = (Atendente.getSalarioAtendente() * 0.08);
    public int decimoTerSalario = (Atendente.getSalarioAtendente() / 12);
    public int ferias = (Atendente.getSalarioAtendente() / 12);
    public double inss = (Atendente.getSalarioAtendente() * 0.08);
    public double salarioLiquido = (Atendente.getSalarioAtendente() - fgts - ferias - inss - decimoTerSalario);

    public Tributos() {
        this.fgts = fgts;
        this.decimoTerSalario = decimoTerSalario;
        this.ferias = ferias;
        this.inss = inss;
        this.salarioLiquido = salarioLiquido;
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
