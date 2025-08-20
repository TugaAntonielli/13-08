public class Pirâmide {
    private double base;
    private double altura;

    public Pirâmide(double base, double altura) {
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

    public double calcularVolumen() {
        return (1.0 / 3) * Math.pow(base, 2) * altura;
    }

    public double calcularAreaSuperficie() {
        double slantHeight = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return Math.pow(base, 2) + 2 * base * slantHeight;
    }
}