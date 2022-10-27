import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner xdolares = new Scanner(System.in);
        float Guillermo;
        System.out.println("Cúanto tiene Guillermo: ");
        Guillermo = xdolares.nextFloat();
        System.out.println("Guillermo tiene: " + Guillermo);
        float Luis = Guillermo / 2;
        System.out.println("Luis tiene: " + Luis);
        float Juan = (Guillermo + Luis) / 2;
        System.out.println("Juan tiene: " + Juan);
        float resultado = Guillermo + Luis + Juan;
        System.out.println("Entre los 3 tienen: " + resultado + "€");
    }
}
