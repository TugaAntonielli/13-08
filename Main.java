import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            menu.displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    boolean planoMenu = true;
                    while (planoMenu) {
                        menu.displayPlanoMenu();
                        int figura = scanner.nextInt();
                        switch (figura) {
                            case 1:
                                System.out.print("Digite a largura do retângulo: ");
                                double largura = scanner.nextDouble();
                                System.out.print("Digite a altura do retângulo: ");
                                double alturaRet = scanner.nextDouble();
                                Retângulo retangulo = new Retângulo(largura, alturaRet);
                                System.out.println("Área: " + retangulo.calcularArea());
                                System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                                break;
                           case 2:
                                System.out.print("Digite a base do triângulo: ");
                                double base = scanner.nextDouble();
                                System.out.print("Digite a altura do triângulo: ");
                                double alturaTri = scanner.nextDouble();
                                System.out.print("Digite o lado A do triângulo: ");
                                double ladoA = scanner.nextDouble();
                                System.out.print("Digite o lado B do triângulo: ");
                                double ladoB = scanner.nextDouble();
                                Triângulo triangulo = new Triângulo(base, alturaTri);
                                System.out.println("Área: " + triangulo.calcularArea());
                                System.out.println("Perímetro: " + triangulo.calcularPerimetro(ladoA, ladoB));
                                break;
                            case 3:
                                System.out.print("Digite o número de lados do polígono regular: ");
                                int numLados = scanner.nextInt();
                                System.out.print("Digite o comprimento do lado: ");
                                double compLado = scanner.nextDouble();
                                PolígonoRegular poligono = new PolígonoRegular(numLados, compLado);
                                System.out.println(poligono);
                                break;
                            case 4:
                                System.out.print("Digite o raio do círculo: ");
                                double raio = scanner.nextDouble();
                                Círculo circulo = new Círculo(raio);
                                System.out.println(circulo);
                                break;
                            case 5:
                                planoMenu = false; // Volta ao menu principal
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 2:
                    boolean espacialMenu = true;
                    while (espacialMenu) {
                        menu.displayEspacialMenu();
                        int figura = scanner.nextInt();
                        switch (figura) {
                            case 1: // Cilindro
                                System.out.print("Digite o raio do cilindro: ");
                                double raioCilindro = scanner.nextDouble();
                                System.out.print("Digite a altura do cilindro: ");
                                double alturaCilindro = scanner.nextDouble();
                                Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
                                System.out.println("Volume: " + cilindro.calcularVolumen());
                                System.out.println("Área superficial: " + cilindro.calcularAreaSuperficie());
                                break;
                            case 2: // Pirâmide
                                System.out.print("Digite o tamanho da base da pirâmide: ");
                                double basePiramide = scanner.nextDouble();
                                System.out.print("Digite a altura da pirâmide: ");
                                double alturaPiramide = scanner.nextDouble();
                                Pirâmide piramide = new Pirâmide(basePiramide, alturaPiramide);
                                System.out.println("Volume: " + piramide.calcularVolumen());
                                System.out.println("Área superficial: " + piramide.calcularAreaSuperficie());
                                break;
                            case 3: // Cone
                                System.out.print("Digite o raio do cone: ");
                                double raioCone = scanner.nextDouble();
                                System.out.print("Digite a altura do cone: ");
                                double alturaCone = scanner.nextDouble();
                                Cone cone = new Cone(raioCone, alturaCone);
                                System.out.println("Volume: " + cone.calcularVolumen());
                                System.out.println("Área superficial: " + cone.calcularAreaSuperficie());
                                break;
                            case 4: // Esfera
                                System.out.print("Digite o raio da esfera: ");
                                double raioEsfera = scanner.nextDouble();
                                Esfera esfera = new Esfera(raioEsfera);
                                System.out.println("Volume: " + esfera.calcularVolumen());
                                System.out.println("Área superficial: " + esfera.calcularAreaSuperficie());
                                break;
                            case 5: // Cubo
                                System.out.print("Digite o lado do cubo: ");
                                double ladoCubo = scanner.nextDouble();
                                Cubo cubo = new Cubo(ladoCubo);
                                System.out.println("Volume: " + cubo.calcularVolumen());
                                System.out.println("Área superficial: " + cubo.calcularAreaSuperficie());
                                break;
                            case 6:
                                espacialMenu = false; // Volta ao menu principal
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}