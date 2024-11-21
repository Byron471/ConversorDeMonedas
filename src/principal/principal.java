package src.principal;

import src.modelos.ConsultaMoneda;
import src.modelos.MonedaExchange;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        boolean bandera = true;
        while (bandera) {
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
            try {
                int opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        convertirMoneda(consultaMoneda, "USD", "ARS", teclado);
                        break;
                    case 2:
                        convertirMoneda(consultaMoneda, "ARS", "USD", teclado);
                        break;
                    case 3:
                        convertirMoneda(consultaMoneda, "USD", "BRL", teclado);
                        break;
                    case 4:
                        convertirMoneda(consultaMoneda, "BRL", "USD", teclado);
                        break;
                    case 5:
                        convertirMoneda(consultaMoneda, "USD", "COP", teclado);
                        break;
                    case 6:
                        convertirMoneda(consultaMoneda, "COP", "USD", teclado);
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
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permite numeros enteros");
                teclado.nextLine();
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al consultar la tasa de cambio: " + e.getMessage());
            }
        }
    }

    private static void convertirMoneda(ConsultaMoneda consultaMoneda, String monedaOrigen, String monedaDestino, Scanner teclado)
            throws IOException, InterruptedException {
        System.out.println("Ingrese la cantidad de " + monedaOrigen + " a convertir a " + monedaDestino + ":");
        double cantidad = teclado.nextDouble(); // Lee la cantidad ingresada por el usuario

        MonedaExchange exchange = consultaMoneda.buscarMoneda(monedaOrigen); // Consulta los datos de tasas de cambio para la moneda base.

        if (exchange.conversion_rates().containsKey(monedaDestino)) { // Verifica si existe una tasa de cambio para la moneda destino.
            double tasaCambio = exchange.conversion_rates().get(monedaDestino); // Obtiene la tasa de cambio entre `monedaOrigen` y `monedaDestino`.
            double resultado = cantidad * tasaCambio; // Calcula el resultado multiplicando la cantidad ingresada por la tasa de cambio.
            System.out.println("La cantidad equivalente en " + monedaDestino + " es: " + resultado); // Muestra el resultado.
        } else {
            System.out.println("La tasa de cambio para " + monedaDestino + " no está disponible."); // Maneja el caso en que no exista una tasa para `monedaDestino`.
        }
    }
}

