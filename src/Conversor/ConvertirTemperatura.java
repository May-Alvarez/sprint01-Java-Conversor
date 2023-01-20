package Conversor;

import javax.swing.*;

public class ConvertirTemperatura {

    public  void  CelsiusAFahrenheit (double valorRecibido){
        double fahrenheitCambio = 9 / 5.0 * valorRecibido + 32;
        fahrenheitCambio = (double) Math.round(fahrenheitCambio * 100d)/100;
        JOptionPane.showMessageDialog(null,  fahrenheitCambio + "° Fahrenheit");
    }

    public  void  CelsiusAKelvin (double valorRecibido){
        double kelvinCambio = valorRecibido + 273.15;
        kelvinCambio = (double) Math.round(kelvinCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, kelvinCambio + "° Kelvin");
    }

    public  void  FahrenheitACelsius(double valorRecibido){
        double celsiusCambio = (valorRecibido - 32) * 9 / 5.0;
        celsiusCambio = (double) Math.round(celsiusCambio * 100d)/100;
        JOptionPane.showMessageDialog(null,  celsiusCambio + "° C");
    }

    public  void  FahrenheitAKelvin (double valorRecibido){
        double kelvinCambio = (valorRecibido - 32) * (9 / 5.0) + 273.15;
        kelvinCambio = (double) Math.round(kelvinCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, kelvinCambio + "° Kelvin");
    }

    public  void  KelvinACelsius (double valorRecibido){
        double celsiusCambio = valorRecibido - 273.15;
        celsiusCambio = (double) Math.round(celsiusCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, celsiusCambio + "° Celsius");
    }

    public  void  KelvinAFahrenheit (double valorRecibido){
        double celsiusCambio = (valorRecibido - 273.15) * 9 / 5.0 + 32;
        celsiusCambio = (double) Math.round(celsiusCambio * 100d)/100;
        JOptionPane.showMessageDialog(null, celsiusCambio + "° Celsius");
    }

}
