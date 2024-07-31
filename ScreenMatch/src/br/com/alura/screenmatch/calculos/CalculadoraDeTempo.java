package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.*;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTempo(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
