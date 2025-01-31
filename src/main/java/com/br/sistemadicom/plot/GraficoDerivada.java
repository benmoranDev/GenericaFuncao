package com.br.sistemadicom.plot;


import com.br.sistemadicom.math.Derivada;
import org.jfree.data.xy.XYSeries;

import java.util.ArrayList;
import java.util.List;


public class GraficoDerivada extends Grafico {
    public GraficoDerivada() {
        super("Gráfico da Derivada", "X", "f'(X)", gerarSeries());
    }

    private static List<XYSeries> gerarSeries() {
        List<XYSeries> seriesList = new ArrayList<>();
        XYSeries serieDerivada = new XYSeries("f'(x)");

        for (double x = -10; x <= 10; x += 0.1) {
            serieDerivada.add(x, Derivada.calcular(x));
        }

        seriesList.add(serieDerivada);
        return seriesList;
    }

    @Override
    protected void plotar() {
        // Já foi preenchido na criação
    }
}