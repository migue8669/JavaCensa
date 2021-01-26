import java.util.Scanner;

public class Puntos {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
String nombre;
double nota1,nota2,nota3,promedio;

        System.out.print("ingrese su nombre: ");
        nombre = numero.nextLine();
        System.out.print("ingrese su nota 1: ");
        nota1 = numero.nextDouble();
        System.out.print("ingrese su nota 2: ");
        nota2 = numero.nextDouble();
        System.out.print("ingrese su nota 3: ");
        nota3 = numero.nextDouble();
        promedio=(nota1+nota2+nota3)/3;
        
        System.out.println("Estudiante "+nombre+" Su promedio en notas es "+promedio);
        punto2();
    }
   static void punto2() {
        Scanner numero1= new Scanner(System.in);
        int validadorNum = 0, promedio, acumEdad = 0;

        int mayor = 0, menor = 0;
        int  contador18 = 0, cantidad;
       System.out.println("ingresa la cantidad de alumnos");
       cantidad=numero1.nextInt();
       int[] edad = new int[cantidad];
       String[]nombre= new String[cantidad];
        for (int i=0;i<cantidad;i++) {

            System.out.print("ingresa el nombre del alumno: ");
            nombre[i] = numero1.next();
            System.out.print("ingresa la edad del alumno: ");
            edad[i] = numero1.nextInt();



            acumEdad=acumEdad+edad[i];

            if (edad[i] > mayor) {
                validadorNum++;
                mayor = edad[i];
                if(validadorNum>0){
                    menor=menor;
                }else{
                menor= edad[i];
            }}
             if( menor>edad[i]) {
                menor = edad[i];
            }
            if(edad[i]<18){
                contador18=contador18+1;
            }

        }
       promedio= acumEdad/cantidad;
       System.out.println("El promedio de edad es: "+promedio+" años");

       System.out.println("El mayor tiene: "+mayor+" años");
        System.out.println("El menor  tiene: "+menor+" años");
        System.out.println("La cantidad de menores de edad es "+contador18);
    }}
