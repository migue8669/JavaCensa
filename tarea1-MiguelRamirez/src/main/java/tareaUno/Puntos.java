package tareaUno;

import java.util.Scanner;

public class Puntos {

    public static  void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        String numeroIngresado="";
                String numeroImpreso="",resto;

        System.out.println("Por favor ingrese un numero del 0 al 9999"+numeroIngresado);
        numeroIngresado=entradaEscaner.nextLine();
        for (int x=numeroIngresado.length()-1;x>=0;x--){
            numeroImpreso = numeroImpreso + numeroIngresado.charAt(x);}
        System.out.println(numeroImpreso);
puntoDos();
    }

     static void puntoDos(){
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;

        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();


        for(j = 1; j <= 10; j++)
        {
            System.out.println(numero + " X " + j + " = " + numero*j);
        }
        System.out.println();
punto3();
    }
    
    
    static void punto3(){
        Scanner numero = new Scanner(System.in);
        int estatura = 0,mediaEdad,mediaEstatrura,acumEdad = 0,acumEstatura = 0;
        int edad = 0;
        int cantidad,edadContador = 0,estaturaContador = 0,j;

        System.out.print("indica la cantidad de alumnos: ");
        cantidad = numero.nextInt();
        for(j = 1; j <= cantidad; j++)
        {
            System.out.print("ingresa tu edad: ");
            edad = numero.nextInt();
            System.out.print("ingresa tu estatura en cm: ");
            estatura = numero.nextInt();
            acumEdad=edad+acumEdad;
            acumEstatura=estatura+acumEstatura;
        }
            if(edad>=18){
                edadContador=edadContador++;

            }
            if(estatura>=175){
                estaturaContador=estaturaContador++;
            }
            mediaEdad=acumEdad/cantidad;
            mediaEstatrura=acumEstatura/cantidad;

            System.out.println("La media de las edades es "+mediaEdad);
            System.out.println();
            System.out.println("La media de las estaturas es "+mediaEstatrura);
            System.out.println();
            System.out.println("La cantidad de alumnos mayores de 18 años son "+edadContador);
            System.out.println();
            System.out.println("La cantidad de alumnos que miden mas de 175 cm es "+estaturaContador);
    
    }

    }


