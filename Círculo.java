public class Círculo {
    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo{" +
                "raio=" + raio +
                ", área=" + calcularArea() +
                ", perímetro=" + calcularPerimetro() +
                '}';
    }
}