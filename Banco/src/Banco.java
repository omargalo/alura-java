import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        String nombre = "Omar Garcia";
        String tipoCuenta = "Corriente";
        double saldo = 1700.99;
        int opcion = 0;

        System.out.println("***********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipó de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + "$" + saldo);
        System.out.println("\n***********************************");

        String menu = """
                *** Escriba el número de la opción deseada: ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Tu saldo es: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto deseas retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo < valorRetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo -valorRetirar;
                        System.out.println("Saldo actualizado: " + "$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto deseas depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("Saldo actualizado: " + "$" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}