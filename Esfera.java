public class Esfera {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularVolumen() {
        return (4.0 / 3) * Math.PI * Math.pow(radio, 3);
    }

    public double calcularAreaSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}