package com.br.sistemadicom.plot;

import com.br.sistemadicom.math.Integral;
import org.jfree.data.xy.XYSeries;

import java.util.ArrayList;
import java.util.List;

public class GraficoIntegral extends Grafico {
    public GraficoIntegral(double a, double b, int n) {
        super("Gráfico da Integral", "X", "Área Aproximada", gerarSeries(a, b, n));
    }

    private static List<XYSeries> gerarSeries(double a, double b, int n) {
        List<XYSeries> seriesList = new ArrayList<>();
        XYSeries serieIntegral = new XYSeries("∫ f(x) dx");

        double h = (b - a) / n;
        for (double x = a; x <= b; x += h) {
            serieIntegral.add(x, Integral.calcular(0, x, n));
        }

        seriesList.add(serieIntegral);
        return seriesList;
    }

    @Override
    protected void plotar() {
        // Já foi preenchido na criação
    }
}