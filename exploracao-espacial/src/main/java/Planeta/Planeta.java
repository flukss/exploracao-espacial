package Planeta;

import Recursos.Recursos;

import java.util.List;
import java.util.Objects;

public class Planeta {
    public final int posicao;
    public final List<Recursos> recursos;

    public Planeta(int posicao, List<Recursos> recursos) {
        this.posicao = posicao;
        this.recursos = recursos;
    }

    public int valorTotal() {
        int valorTotal = 0;
        if (Objects.isNull(this.recursos)) {
            return 0;
        }
        for (int i = 0; i < this.recursos.size(); i++) {
            valorTotal += this.recursos.get(i).getValor();
        }
        return valorTotal;
    }

    public int valorPorPeso(){
        int valorPorPeso = 0;
        if (Objects.isNull(this.recursos)) {
            return 0;
        }
        for (int i = 0; i < this.recursos.size(); i++) {
            valorPorPeso += this.recursos.get(i).getValor() /  this.recursos.get(i).getPeso();
        }
        return valorPorPeso;
    }

    public int getPosicao() {
        return posicao;
    }

    public List<Recursos> getRecursos() {
        return recursos;
    }
}
