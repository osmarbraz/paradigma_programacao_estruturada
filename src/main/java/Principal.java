
import java.util.Scanner;

public class Principal {

    /** Verifica se os lados formam um triangulo
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static boolean verificaTriangulo(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0
                && a < b + c
                && b < a + c
                && c < a + b;
    }

    /** Calcula o perimetro
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static double calculaPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    /** Calcula a area pela formula de Heron
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static double calculaArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Programa principal
     * @param args 
     */
    public static void main(String[] args) {
        //Scanner para a estrada de dados padrão.
        Scanner entrada = new Scanner(System.in);
        
        //Variáveis
        double a, b, c;

        // Entrada
        System.out.print("Lado A: ");
        a = entrada.nextDouble();
        System.out.print("Lado B: ");
        b = entrada.nextDouble();
        System.out.print("Lado C: ");
        c = entrada.nextDouble();

        // Processamento e saida
        if (verificaTriangulo(a, b, c)) {
            System.out.println("Triangulo valido!");
            System.out.println("Perimetro: " + calculaPerimetro(a, b, c));
            System.out.println("Area: " + calculaArea(a, b, c));
        } else {
            System.out.println("Triangulo invalido!");
        }

        //Fecha a entrada de dados padrão
        entrada.close();
    }
}
