package Conversor;

import javax.swing.*;

public class ConvertirMonedas {
    public  void  ConvertirDePesos (String tipo, double moneda, double valorRecibido){
        double monedaCambio = valorRecibido / moneda;
        monedaCambio = (double) Math.round(monedaCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaCambio + tipo);
    }

    public  void  ConvertirAPesos (double moneda, double valorRecibido){
        double monedaCambio = valorRecibido * moneda;
        monedaCambio = (double) Math.round(monedaCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaCambio + " Pesos Mexicanos");
    }

}
