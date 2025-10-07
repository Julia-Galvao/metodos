import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Lado 1  --> ");
        lado1 = sc.nextByte();
        System.out.println("Lado 2 --> ");
        lado2 = sc.nextDouble();
        System.out.println("Lado 3 --> ");
        lado3 = sc.nextDouble();

        if (validar(lado1,lado2,lado3)) {
            classificar(lado1,lado2,lado3);
        }
        else {
            System.out.println("Os valores nã formam um triângulo");
        }
    }

    public static boolean validar (double l1, double l2, double l3){ //boolean tem retorno de valor
        return (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2);
    }

    public static void classificar (double l1, double l2, double l3) { //void significa que não tem retorno de valor
        if (l1 == l2 && l2 == l3){
            System.out.println("Triâgulo equilátero");
        }
        else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Triâgulo isósceles ");
        }
        else {
            System.out.println("Triâgulo escaleno");
        }
    }
}
