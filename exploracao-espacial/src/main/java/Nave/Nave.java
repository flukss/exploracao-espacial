package Nave;

import Planeta.Planeta;
import Recursos.Recursos;

import java.util.List;

public class Nave {
    public int posicao = 0;
    public int combustivel;
    public List<Recursos> recursos;

    public Nave(int combustivel) {
        this.combustivel = combustivel;
    }

    public void explorar(Planeta planeta) {
        for (int i = 0; i <= planeta.getPosicao(); i++) {
            this.posicao = i;
            this.combustivel -= 3;
            if (combustivel <= 0) {
                break;
            }
            if (this.posicao == planeta.getPosicao()) {
                for (int pontoDeRetorno = i; pontoDeRetorno >= 0; pontoDeRetorno--) {
                    this.posicao = pontoDeRetorno;
                    this.combustivel = combustivel - 3;
                    if (combustivel <= 0) {
                        break;
                    }
                }
            }
            if (this.posicao == planeta.getPosicao()) {
                this.recursos = planeta.getRecursos();
            }
        }
    }


        public int getPosicao () {
            return posicao;
        }

        public int getCombustivel () {
            return combustivel;
        }

        public List<Recursos> getRecursos () {
            return recursos;
        }
}