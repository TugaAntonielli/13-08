public class Menu {

    public void displayMenu() {
        System.out.println("Selecione o tipo de geometria: ");
        System.out.println("1. Plana");
        System.out.println("2. Espacial");
        System.out.println("3. Sair");
    }

    public void displayPlanoMenu() {
        System.out.println("Selecione uma figura plana: ");
        System.out.println("1. Retângulo");
        System.out.println("2. Triângulo");
        System.out.println("3. Polígono Regular");
        System.out.println("4. Círculo");
        System.out.println("5. Voltar ao Menu Principal");
    }

    public void displayEspacialMenu() {
        System.out.println("Selecione uma figura espacial: ");
        System.out.println("1. Cilindro");
        System.out.println("2. Pirâmide");
        System.out.println("3. Cone");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Voltar ao Menu Principal");
    }
}