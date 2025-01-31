package com.br.sistemadicom.math;

public class Integral {
    public static double calcular(double a, double b, int n) {
        double h = (b - a) / n;
        double soma = (Funcao.calcular(a) + Funcao.calcular(b)) / 2.0;
        for (int i = 1; i < n; i++) {
            soma += Funcao.calcular(a + i * h);
        }
        return soma * h;
    }
}