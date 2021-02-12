import java.util.Scanner;

public class Puntos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadAlumnos = 0;

        System.out.println("Ingrese cantadidad de alumnos");
        cantidadAlumnos=leer.nextInt();

        String[] nombre = new String[cantidadAlumnos];
        String AuxiliarNombre = "";
        double[] nota1 = new double[cantidadAlumnos],nota2 = new double[cantidadAlumnos],nota3 = new double[cantidadAlumnos];
        double[] promedioAlumno=new double[cantidadAlumnos];
        double notaAlta = 0, acumuladorPromedios = 0,promedioGrupo=0,acumulador = 0;

        for (int i=0;i<cantidadAlumnos;i++){
            System.out.println("Ingrese nombre del alumno");
            nombre[i]=leer.next();
            System.out.println("Ingrese nota 1");
            nota1[i]=leer.nextDouble();
            System.out.println("Ingrese nota 2");
            nota2[i]=leer.nextDouble();
            System.out.println("Ingrese nota 3");
            nota3[i]=leer.nextDouble();
            nota1[i]=leer.nextInt();
            System.out.println("Ingrese nota 2");
            nota2[i]=leer.nextInt();
            System.out.println("Ingrese nota 3");
            nota3[i]=leer.nextInt();
            promedioAlumno[i]=nota1[i]+nota2[i]+nota3[i];
            acumuladorPromedios=promedioAlumno[i]/3;
            System.out.println("El promedio de notas del alumno "+nombre[i]+" es "+acumuladorPromedios);

           if(acumuladorPromedios>notaAlta){
               notaAlta=acumuladorPromedios;
               AuxiliarNombre=nombre[i];
           }

           promedioGrupo=acumuladorPromedios+acumulador;
           acumulador=acumuladorPromedios;

        }
        System.out.println("El promedio del grupo es "+promedioGrupo/cantidadAlumnos);
        System.out.println("El alumno con la nota mas alta es "+AuxiliarNombre+" su nota promedio fue "+notaAlta);
    punto2();
    }
    static void punto2(){
        Scanner leer = new Scanner(System.in);
        int cantidad=0,totalVentas = 0;
        System.out.println("Por favor ingrese la cantidad de clientes");
        cantidad=leer.nextInt();
        String auxiliarNombre = "",auxiliarProducto = "";
    String[] articulo = new String[cantidad],nombre = new String[cantidad];
    int[] valor = new int[cantidad], cantidadArticulos=new int[cantidad];
    int valorMenor=0,valorPagado=0;
    for (int i=0;i<cantidad;i++){

        System.out.println("Por favor ingrese el nombre del cliente");
        nombre[i]=leer.next();
        System.out.println("Por favor ingrese el articulo a comprar");
        articulo[i]=leer.next();
        
        System.out.println("Por favor ingrese la cantidad ");
        cantidadArticulos[i]=leer.nextInt();
        System.out.println("Por favor ingrese su valor unitario sin puntos ni comas");
        valor[i]=leer.nextInt();
        valorPagado=valor[i]*cantidadArticulos[i];
        System.out.println("El valor a pagar por el cliente "+nombre[i]+" es "+valorPagado);
        if(valor[i]<valorMenor){
            valorMenor=valor[i];
            auxiliarNombre=nombre[i];
        }
        if(cantidadArticulos[i]==1){
            totalVentas++;
        }
           auxiliarProducto=articulo[i];
        valorMenor=valor[i];
    }
        System.out.println("El valor más bajo fue "+valorMenor+" pesos y fue comprado por "+auxiliarNombre);
        System.out.println("El total de ventas con un solo articulo es "+totalVentas);


    }
}
