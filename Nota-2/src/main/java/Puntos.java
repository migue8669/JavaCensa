import java.util.Scanner;

public class Puntos {
    
    public static void main(String[] args) {
        int tamano, promedio = 0;
        double acumuladorPromedio = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo");
        tamano = leer.nextInt();
        double[] valores = new double[tamano], valoresPromedio = new double[tamano], valoresPrimeroUltimo = new double[tamano];


        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese numero");
            valores[i] = leer.nextInt();
            if (i > 0 && i < tamano - 1) {
                valoresPromedio[i] = valores[i];
                acumuladorPromedio = acumuladorPromedio + valoresPromedio[i];
            } else {
                valoresPrimeroUltimo[i] = valores[i];


            }

        }

        for (int i = 0; i <= tamano; i++) {

            if (valoresPrimeroUltimo[i] == 0) {
                return;
            }
            if (i == 0) {
                System.out.println("Primer numero ingresado");
                System.out.println(valoresPrimeroUltimo[i]);
            } else {
                System.out.println("Ultimo numero ingresado");
                System.out.println(valoresPrimeroUltimo[i]);
            }

            i++;

        }

        System.out.println("promedio con el tamaño total del arreglo " + acumuladorPromedio / tamano);
        int rangoCondicionado = tamano - 2;
        System.out.println("promedio con el rango condicionado del arreglo  " + acumuladorPromedio / rangoCondicionado);


    }
}
