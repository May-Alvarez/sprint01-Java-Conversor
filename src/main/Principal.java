package main;

import Function.FunctionMonedas;
import Function.FunctionTemperatura;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int seleccion = JOptionPane.OK_OPTION;
        try {
            while (seleccion != JOptionPane.NO_OPTION ) {
                FunctionMonedas monedas = new FunctionMonedas();
                FunctionTemperatura temperaura = new FunctionTemperatura();
                String opciones = (JOptionPane.showInputDialog(
                        null,
                        "Seleccione una opcion de conversion ",
                        "Menu", JOptionPane.QUESTION_MESSAGE,
                        null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"},
                        "Seleccion")).toString();

                switch (opciones) {
                    case "Conversor de Moneda":
                        String ValoreRecibido = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        monedas.ConvertirMonedas(ValoreRecibido);
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        break;
                    case "Conversor de Temperatura":
                        ValoreRecibido = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        temperaura.ConvertirTemperatura(ValoreRecibido);
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        break;
                }
            }
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }
    }
}