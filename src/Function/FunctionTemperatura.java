package Function;

import Conversor.ConvertirTemperatura;

import javax.swing.*;

public class FunctionTemperatura {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
    public void ConvertirTemperatura(String vRecibido){
        String opciones = (JOptionPane.showInputDialog(
                null,
                "Elije la medida a la que deseas convertir tu temperatura ",
                "Monedas", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                        "De Celsius a Fahrenheit", "De Celsius a Kelvin",
                        "De Fahrenheit a Celsius",  "De Fahrenheit a Kelvin",
                        "De Kelvin a Fahrenheit",  "De Kelvin a Celsius"},
                "Seleccion")).toString();

        if (vRecibido.matches("\\d*") || vRecibido.matches("\\d{2,}\\.\\d")){
            System.out.println("Valor valido");
        }else {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            vRecibido = JOptionPane.showInputDialog("Ingrese un valor para convertir");
        }
        try {
            double valorRecibido = Double.parseDouble(vRecibido);
            switch (opciones) {
                case "De Celsius a Fahrenheit" -> temperatura.CelsiusAFahrenheit(valorRecibido);
                case "De Celsius a Kelvin" -> temperatura.CelsiusAKelvin(valorRecibido);
                case "De Fahrenheit a Celsius" -> temperatura.FahrenheitACelsius(valorRecibido);
                case "De Fahrenheit a Kelvin" -> temperatura.FahrenheitAKelvin(valorRecibido);
                case "De Kelvin a Fahrenheit" -> temperatura.KelvinAFahrenheit(valorRecibido);
                case "De Kelvin a Celsius" -> temperatura.KelvinACelsius(valorRecibido);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor no válido");

        }

    }
}
