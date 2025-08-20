public class Cone {
    private double radio;
    private double altura;

    public Cone(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen() {
        return (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularAreaSuperficie() {
        return Math.PI * radio * (radio + Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2)));
    }
}