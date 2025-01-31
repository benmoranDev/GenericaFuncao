package com.br.sistemadicom.math;


//Gráfico da Derivada (f'(x))
public class Derivada {
    private static final double H = 1e-5;

    public static double calcular(double x) {
        return (Funcao.calcular(x + H) - Funcao.calcular(x)) / H;
    }
}