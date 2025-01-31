package com.br.sistemadicom.plot;

import com.br.sistemadicom.math.Derivada;
import com.br.sistemadicom.math.Funcao;
import com.br.sistemadicom.math.Integral;
import org.jfree.data.xy.XYSeries;

import java.util.ArrayList;
import java.util.List;

public class GraficoMultiplo {
    public static void exibir() {
        List<XYSeries> seriesList = new ArrayList<>();
        XYSeries serieFuncao = new XYSeries("f(x)");
        XYSeries serieDerivada = new XYSeries("f'(x)");
        XYSeries serieIntegral = new XYSeries("∫ f(x) dx");

        for (double x = -10; x <= 10; x += 0.1) {
            serieFuncao.add(x, Funcao.calcular(x));
            serieDerivada.add(x, Derivada.calcular(x));
        }
        for (double x = 0; x <= Math.PI; x += 0.1) {
            serieIntegral.add(x, Integral.calcular(0, x, 1000));
        }

        seriesList.add(serieFuncao);
        seriesList.add(serieDerivada);
        seriesList.add(serieIntegral);

        new Grafico("Gráfico Múltiplo", "X", "Y", seriesList) {
            @Override
            protected void plotar() {
                // Já foi preenchido na criação
            }
        };
    }
}