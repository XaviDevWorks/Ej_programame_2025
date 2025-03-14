import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el número de casos de entrada:");
        int cas = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < cas; i++) {
            System.out.println("Caso de prueba " + (i + 1));
            System.out.println("Dime los tres valores:");

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int resultadoA = a * 3;
            int resultadoB = b * 2;
            int resultadoC = c * 1;

            int resultado = resultadoA + resultadoB + resultadoC;
            array.add(resultado);
        }
        for (int i=0; i<cas; i++){
            System.out.println(array.get(i));
        }
    }
}
