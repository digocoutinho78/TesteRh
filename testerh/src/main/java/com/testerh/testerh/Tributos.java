package com.testerh.testerh;
import com.testerh.testerh.Atendente;
public class Tributos {
    
    public double fgts = 0.8;
    public int decimoTerSalario = Atendente.getSalarioAtendente / 12;
    public int ferias = Atendente.getSalarioAtendente / 12;
    public double inss = 0.08;

  


    public Tributos(double fgts, int decimoTerSalario, int ferias, double inss) {
        this.fgts = fgts;
        this.decimoTerSalario = decimoTerSalario;
        this.ferias = ferias;
        this.inss = inss;
    }
    public  double getFgts() {
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

}


