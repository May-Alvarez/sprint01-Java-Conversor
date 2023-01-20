package Function;

import Conversor.ConvertirMonedas;

import javax.swing.*;

public class FunctionMonedas {
    ConvertirMonedas monedas = new ConvertirMonedas();
    double dolar = 18.99;
    double euro = 20.58;
    double libra = 23.54;
    double yen = 0.15;
    double wonesCoreano = 0.015;

    public void ConvertirMonedas(String vRecibido){
        String opciones = (JOptionPane.showInputDialog(
                null,
                "Elije la moneda a la que deseas convertir tu dinero ",
                "Monedas", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                        "De MXN a Dólar", "De MXN a Euro", "De MXN a Libras",  "De MXN a Yen",  "De MXN a Won Coreano",
                        "De Dólar a MXN", "De Euro a MXN", "De Libras a MXN", "De Yen a MXN", "De Won Coreano a MXN"},
                "Seleccion")).toString();

        if (vRecibido.matches("\\d*") || vRecibido.matches("\\d{2,}\\.\\d")){
            System.out.println("Valor valido");
        }else {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            vRecibido = JOptionPane.showInputDialog("Ingrese un valor para convertir");
        }
        try {
            double ValorRecibido = Double.parseDouble(vRecibido);
            switch (opciones) {
                case "De MXN a Dólar" -> monedas.ConvertirDePesos(" Dolares", dolar, ValorRecibido);
                case "De MXN a Euro" -> monedas.ConvertirDePesos(" Euros", euro, ValorRecibido);
                case "De MNX a Libras" -> monedas.ConvertirDePesos(" Libras", libra, ValorRecibido);
                case "De MXN a Yen" -> monedas.ConvertirDePesos(" Yenes", yen, ValorRecibido);
                case "De MXN a Won Coreano" -> monedas.ConvertirDePesos(" Wones Coreano", wonesCoreano, ValorRecibido);
                case "De Dólar a MXN" -> monedas.ConvertirAPesos(dolar, ValorRecibido);
                case "De Euro a MXN" -> monedas.ConvertirAPesos(euro, ValorRecibido);
                case "De Libras a MXN" -> monedas.ConvertirAPesos(libra, ValorRecibido);
                case "De Yen a MXN" -> monedas.ConvertirAPesos(yen, ValorRecibido);
                case "De Won Coreano a MXN" -> monedas.ConvertirAPesos(wonesCoreano, ValorRecibido);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor no válido");
        }

    }
}
