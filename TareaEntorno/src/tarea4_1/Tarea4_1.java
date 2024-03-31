package tarea4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea4_1 {
    public static class Main {
        static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) {
            CCuenta cuenta1;
            double saldoActual;
            int opcion = 0;
            cuenta1 = new CCuenta("Pepito Palotes", "1000-2365-85-123456789", 2500, 0);
            do {
                try {
                    System.out.println("MENÚ DE OPERACIONES");
                    System.out.println("-------------------");
                    System.out.println("1 - Ingresar");
                    System.out.println("2 - Retirar");
                    System.out.println("3 - Finalizar");
                    opcion = Integer.parseInt(dato.readLine());
                    operativaCuenta(cuenta1, opcion);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (opcion != 3);
            saldoActual = cuenta1.getSaldo();
            System.out.println("El saldo actual es " + saldoActual);
        }

        private static void operativaCuenta(CCuenta cuenta, int opcion) throws IOException {
            float cantidad;
            if (opcion == 1) {
                System.out.println("¿Cuánto desea ingresar?: ");
                cantidad = Float.parseFloat(dato.readLine());
                try {
                    cuenta.ingresar(cantidad);
                } catch (Exception e) {
                    System.out.print("Fallo al ingresar");
                }
            } else if (opcion == 2) {
                System.out.println("¿Cuánto desea retirar?: ");
                cantidad = Float.parseFloat(dato.readLine());
                try {
                    cuenta.retirar(cantidad);
                } catch (Exception e) {
                    System.out.print("Fallo al retirar");
                }
            } else if (opcion == 3) {
                System.out.println("Finalizamos la ejecución");
            } else {
                System.err.println("Opción errónea");
            }
        }
    }
}