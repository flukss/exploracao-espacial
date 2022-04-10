package Recursos;

public class Recursos {
    final String NOME;
    final int VALOR;
    final int PESO;

    public Recursos(String nome, int valor, int peso) {
        this.NOME = nome;
        this.VALOR = valor;
        this.PESO = peso;

    }

    public String getNome() {
        return NOME;
    }

    public int getValor() {
        return VALOR;
    }

    public int getPeso() {
        return PESO;
    }

    @Override
    public String toString() {
        return "Recursos{" +
                "NOME='" + NOME + '\'' +
                ", VALOR=" + VALOR +
                ", PESO=" + PESO +
                '}';
    }
}
