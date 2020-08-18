package com.example.myapplication;

public class Conversoresclass {

    public String[] opciones = {"Moneda", "Longitud"};
    public String[][] Definiciones =
            {
                    new String[]{"Dolar($)", "Colones ¢ (SV)", "Yenes(¥)", "Rupias(₹)", "Lempiras(L)", "Peso (MXN)", "Bitcoin(฿)", "Quetzal(Q)", "Euro(€)", "Cordoba(C$)", "Balboa(B/)", "Peso Argentino($)", "Peso Chileno($)", "Peso Colombiano($)", "Soles (S/)", "Dolar Canadiense($)", "Dolar Beliceño($)", "Afgani(؋)", "Boliviano($b)", "Yuan(¥)"},
                    new String[]{"Metro", "Cm", "Pulgada", "pie", "Varas", "Yardas", "Km", "Millas", "Milímetro", "MicróMetro", "Nanómetro", "Decímetro", "Hectómetro", "Picómetro", "Terámetro", "Gigámetro", "Megámetro", "Decámetro", "Petámetro", "Femtómetro"},
            };

    double[][] Valores =
            {
                    new double[]{1, 8.75, 111.26, 69.75, 24.36, 19.36, 0.00026, 7.69, 0.88, 32.95, 1.00, 39.95, 667.65, 3126.73, 3.30, 1.33, 2.02, 77.00, 6.92, 7.00},
                    new double[]{1, 100, 39.3701, 3.28084, 1.1963081929167, 1.09361, 0.001, 0.000621371, 1000, 1e+6, 1e+9, 10, 0.01, 1e+12, 1e-12, 1e-9, 1e-6, 0.1, 1e-15, 1e+15},
            };


    public double convertir(int decover, int acover, double cantidad, int opciones) {
//formula de conversion
        return Math.round(Valores[opciones][acover] / Valores[opciones][decover] * cantidad);
    }
}
