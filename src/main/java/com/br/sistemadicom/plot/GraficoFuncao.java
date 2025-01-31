package com.br.sistemadicom.plot;
import com.br.sistemadicom.math.Funcao;
import org.jfree.data.xy.XYSeries;

import java.util.ArrayList;
import java.util.List;


public class GraficoFuncao extends Grafico {
    public GraficoFuncao() {
        super("Gráfico de f(x)", "X", "f(X)", gerarSeries());
    }

    private static List<XYSeries> gerarSeries() {
        List<XYSeries> seriesList = new ArrayList<>();
        XYSeries serieFuncao = new XYSeries("f(x)");

        for (double x = -10; x <= 10; x += 0.1) {
            serieFuncao.add(x, Funcao.calcular(x));
        }

        seriesList.add(serieFuncao);
        return seriesList;
    }

    @Override
    protected void plotar() {
        // Já foi preenchido na criação
    }
}