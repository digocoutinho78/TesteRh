package com.testerh.testerh;
import com.testerh.testerh.Atendente;
public class Tributos {
    
    public double fgts = 0.08;
    public int decimoTerSalario =  12;
    public int ferias =  12;
    public double inss = 0.08;
    public double salarioLiquido = (Atendente.getSalarioAtendente() - (Atendente.getSalarioAtendente ()* fgts ) - (Atendente.getSalarioAtendente ()/ ferias) - (Atendente.getSalarioAtendente ()* inss ) - (Atendente.getSalarioAtendente ()/ decimoTerSalario));


    //public double salarioLiquido = Atendente.getSalarioAtendente - (Atendente.getSalarioAtendente * fgts) - (Atendente.getSalarioAtendente / ferias) - (Atendente.getSalarioAtendente * fgts);
   
    public Tributos() {
        this.fgts = fgts;
        this.decimoTerSalario = decimoTerSalario;
        this.ferias = ferias;
        this.inss = inss;
        this.salarioLiquido = salarioLiquido;
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
       public double getSalarioLiquido() {
        return salarioLiquido;
    }
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}


