public class PolígonoRegular {
    private int numeroLados;
    private double comprimentoLado;

    public PolígonoRegular(int numeroLados, double comprimentoLado) {
        this.numeroLados = numeroLados;
        this.comprimentoLado = comprimentoLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getComprimentoLado() {
        return comprimentoLado;
    }

    public void setComprimentoLado(double comprimentoLado) {
        this.comprimentoLado = comprimentoLado;
    }

    public double calcularPerimetro() {
        return numeroLados * comprimentoLado;
    }

    @Override
    public String toString() {
        return "PolígonoRegular{" +
                "número de lados=" + numeroLados +
                ", comprimento do lado=" + comprimentoLado +
                ", perímetro=" + calcularPerimetro() +
                '}';
    }
}