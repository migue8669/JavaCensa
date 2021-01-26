import java.util.Scanner;

public class Puntos {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int cantidadHoras=0;
        double salud, pension,valorConDescuento,valorHora,valorSinDescuento;

        System.out.print("indica la cantidad de horas trabajadas: ");
        cantidadHoras = numero.nextInt();
        System.out.print("indica el valor de cada hora sin puntos ni comas: ");
        valorHora = numero.nextInt();


        valorSinDescuento=cantidadHoras*valorHora;
        System.out.println("Su salario sin descuentos de prestaciones sociales es: $"+valorSinDescuento+" pesos");
        salud=valorSinDescuento*0.04;
        System.out.println("El valor del descuento de salud es: $"+salud+" pesos");
        pension=valorSinDescuento*0.03;
        System.out.println("El valor del descuento de salud es: $"+pension+" pesos");
        valorConDescuento=valorSinDescuento-salud-pension;
        System.out.println("Su salario con descuento de pensión y salud es: $"+valorConDescuento+" pesos");

    }
}
