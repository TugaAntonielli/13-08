public class Triângulo {
    private double base;
    private double altura;

    public Triângulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro(double ladoA, double ladoB) {
        return base + ladoA + ladoB;
    }

    @Override
    public String toString() {
        return "Triângulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", área=" + calcularArea() +
                '}';
    }
}