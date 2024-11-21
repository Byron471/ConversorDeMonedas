package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean bandera = true;
        while(bandera){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Sean bienvenido/a al conversor de monedas");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Por favor, seleccione una opción");
            System.out.println("1. Convertir de dólar a peso argentino");
            System.out.println("2. Convertir de peso argentino a dólar");
            System.out.println("3. Convertir de dólar a real brasileño");
            System.out.println("4. Convertir de real brasileño a dólar");
            System.out.println("5. Convertir de dolar a peso colombiano");
            System.out.println("6. Convertir de peso colombiano a dolar");
            System.out.println("7. Salir");
            try{
                int opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dólares a convertir a pesos argentinos");
                        double dolares = teclado.nextDouble();
                        double pesosArgentinos = dolares * 98.5;
                        System.out.println("La cantidad de pesos argentinos es: " + pesosArgentinos);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de pesos argentinos a convertir a dólares");
                        double pesosArgentinos2 = teclado.nextDouble();
                        double dolares2 = pesosArgentinos2 / 98.5;
                        System.out.println("La cantidad de dólares es: " + dolares2);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dólares a convertir a reales brasileños");
                        double dolares3 = teclado.nextDouble();
                        double realesBrasileños = dolares3 * 5.3;
                        System.out.println("La cantidad de reales brasileños es: " + realesBrasileños);
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad de reales brasileños a convertir a dólares");
                        double realesBrasileños2 = teclado.nextDouble();
                        double dolares4 = realesBrasileños2 / 5.3;
                        System.out.println("La cantidad de dólares es: " + dolares4);
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de dólares a convertir a pesos colombianos");
                        double dolares5 = teclado.nextDouble();
                        double pesosColombianos = dolares5 * 3800;
                        System.out.println("La cantidad de pesos colombianos es: " + pesosColombianos);
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad de pesos colombianos a convertir a dólares");
                        double pesosColombianos2 = teclado.nextDouble();
                        double dolares6 = pesosColombianos2 / 3800;
                        System.out.println("La cantidad de dólares es: " + dolares6);
                        break;
                    case 7:
                        System.out.println("Gracias por usar el conversor de monedas");
                        System.out.println("Salida exitosa");
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opción no válida por favor intente de nuevo");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Solo se permite numeros enteros");
                teclado.nextLine();
            }
        }

    }
}
