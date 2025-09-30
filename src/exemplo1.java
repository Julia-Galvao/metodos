import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2,resultado;

        System.out.print("Valor 1: ");
        valor1 = sc.nextInt();
        System.out.print("Valor 2: ");
        valor2 = sc.nextInt();

       resultado =  somar(valor1, valor2); // argumentos --> valores que serão enviados/copiados para outro metodo
        System.out.println("Resultado = " +resultado);
    }
    public static int somar(int valor1, int valor2){ // parametro do metodo
        int resultado;
        resultado = valor1 + valor2;
        return resultado;

    }
}
