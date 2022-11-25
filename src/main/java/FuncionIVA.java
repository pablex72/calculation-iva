import java.util.Scanner;

/**
 * Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
 */

public class FuncionIVA {

    public static double calcularIVA(double p){
        double IVA;
        return IVA = p * 0.20;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precioDeLaCompra;
        double IVA;

        System.out.println("Ingrese el precio total de la compra ");
        precioDeLaCompra = scanner.nextDouble();

        IVA = calcularIVA(precioDeLaCompra);

        System.out.println("El precio total sin IVA es de: " + precioDeLaCompra);
        System.out.println("El precio a pagar (IVA incluido): " + (precioDeLaCompra+IVA));
    }


}
